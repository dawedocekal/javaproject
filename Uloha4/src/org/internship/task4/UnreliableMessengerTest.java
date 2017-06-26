package org.internship.task4;

        import java.io.IOException;
        import java.net.NoRouteToHostException;
        import java.net.UnknownHostException;
        import junit.framework.*;

/**
 * Testovaci trida pro ulohu cislo 6.
 *
 * @author Petr Adamek
 */
public class UnreliableMessengerTest extends TestCase {

    public UnreliableMessengerTest(String testName) {
        super(testName);
    }

    public void testRules() {
        BasicRulesTester.testMethodsAndAttributes(MessengerException.class);
        BasicRulesTester.testMethodsAndAttributes(CannotSendException.class);
        BasicRulesTester.testMethodsAndAttributes(TargetUnreachableException.class);
        BasicRulesTester.testMethodsAndAttributes(UnreliableMessenger.class);
    }

    private void assertAncestor(Class ancestor, Class clazz) {
        assertEquals("Trida " + clazz + " neni primym potomkem tridy " + ancestor,
                ancestor,clazz.getSuperclass());
    }

    public void testExceptionHierarchy() {
        assertAncestor(Exception.class,MessengerException.class);
        assertAncestor(MessengerException.class,CannotSendException.class);
        assertAncestor(MessengerException.class,TargetUnreachableException.class);
    }

    public void testNewUnreliableMessengerWithNullConnector() {
        try {
            Messenger messenger = new UnreliableMessenger(null,1);
            fail("Podarilo se vytvorit instanci tridy UnreliableMessenger s parametrem " +
                    "connector = null, aniz by konstruktor vyhodil vyjimku " +
                    "NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Vyjimka NullPointerException vyhozena konstruktorem " +
                    "UnreliableMessenger(Connector,int) by jako popis chyby mela " +
                    "obsahovat nazev chybneho parametru","connector",e.getMessage());
            // All is ok
        }
    }

    public void testNewUnreliableMessengerWithWrongRetries() {
        try {
            Messenger messenger = new UnreliableMessenger(new SimpleConnector(),-1);
            fail("Podarilo se vytvorit instanci tridy UnreliableMessenger se zapornym" +
                    " poctem opakovani (retries), aniz by konstruktor vyhodil " +
                    "vyjimku IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Vyjimka IllegalArgumentException vyhozena konstruktorem " +
                            "UnreliableMessenger(Connector,int) by jako popis chyby mela " +
                            "obsahovat nazev chybneho parametru",
                    "maxSendAttempts",e.getMessage());
            // All is ok
        }
        try {
            Messenger messenger = new UnreliableMessenger(new SimpleConnector(),0);
            fail("Podarilo se vytvorit instanci tridy UnreliableMessenger s nulovym" +
                    " poctem opakovani (retries), aniz by konstruktor vyhodil " +
                    "vyjimku IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Vyjimka IllegalArgumentException vyhozena konstruktorem " +
                            "UnreliableMessenger(Connector,int) by jako popis chyby mela " +
                            "obsahovat nazev chybneho parametru",
                    "maxSendAttempts",e.getMessage());
            // All is ok
        }
    }

    public void testSendData() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,1);

        try {
            messenger.send("address1", null);
            fail("Pri chybejicim textu zpravy nebyla vyhozena pozadovana vyjimka");
        } catch (MessengerException ex) {
            assertNotNull("Vyjimka MessengerException vyvolana jako reakce na chybejici text zpravy " +
                    "nema nastavenou smysluplnou zpravu o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Pri chybejicim textu zpravy byla vyhozena spatna vyjimka " + ex);
        }

        try {
            messenger.send(null, "aaa");
            fail("Pri chybejicim adresatovi nebyla vyhozena pozadovana vyjimka");
        } catch (MessengerException ex) {
            assertNotNull("Vyjimka MessengerException vyvolana jako reakce na chybejiciho adresata " +
                    "nema nastavenou smysluplnou zpravu o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Pri chybejicim adresatovi byla vyhozena spatna vyjimka " + ex);
        }

        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
        } catch (Exception ex) {
            fail("Pri pokusu odeslat zpravu byla neocekavane vyhozena vyjimka " + ex);
        }
        assertEquals("Pri posilani zpravy nebyl poslan ocekavany text",
                "messageText",connector.sentData);
        assertEquals("Spojeni nebylo navazano se spravnou adresou","" +
                "address1",connector.host);
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
        assertEquals("Metoda Connection.sendData() byla zbytecne volana vicekrat",
                1,connector.sendDataCounter);
    }

    public void testConnectWithUnknownHostException() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,5);
        connector.connectionException = new UnknownHostException();
        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
            fail("Metoda UnreliableMessenger.send() nevyhodi vyjimku, " +
                    "ackoliv se nepodarilo navazat spojeni a metoda " +
                    "Connector.getConnection() vyhodila vyjimku UnknownHostException");
        } catch (TargetUnreachableException ex) {
            assertSame("Vyjimka TargetUnreachableException vyvolana jako reakce na " +
                    "vyjimku UnknownHostException nema spravne nastavenou " +
                    "svoji pricinu",connector.connectionException,ex.getCause());
            assertNotNull("Vyjimka TargetUnreachableException vyvolana jako reakce na " +
                    "vyjimku UnknownHostException nema nastavenou smysluplnou zpravu " +
                    "o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Metoda UnreliableMessenger.send() misto ocekavane vyjimky " +
                    "TargetUnreachableException vyhodila vyjimku " + ex);
        }
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
    }

    public void testConnectWithNoRouteToHostException() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,5);
        connector.connectionException = new NoRouteToHostException();
        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
            fail("Metoda UnreliableMessenger.send() nevyhodi vyjimku, " +
                    "ackoliv se nepodarilo navazat spojeni a metoda " +
                    "Connector.getConnection() vyhodila vyjimku NoRouteToHostException");
        } catch (TargetUnreachableException ex) {
            assertSame("Vyjimka TargetUnreachableException vyvolana jako reakce na " +
                    "vyjimku NoRouteToHostException nema spravne nastavenou " +
                    "svoji pricinu",connector.connectionException,ex.getCause());
            assertNotNull("Vyjimka TargetUnreachableException vyvolana jako reakce na " +
                    "vyjimku NoRouteToHostException nema nastavenou smysluplnou zpravu " +
                    "o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Metoda UnreliableMessenger.send() misto ocekavane vyjimky " +
                    "TargetUnreachableException vyhodila vyjimku " + ex);
        }
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
    }

    public void testSendDataWithErrorAndNoRetry() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,1);
        connector.dataException = new IOException();
        connector.dataExceptionCounter = 1;
        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
            fail("Metoda UnreliableMessenger.send() nevyhodi vyjimku, " +
                    "ackoliv se nepodarilo poslat data a metoda " +
                    "Connection.sendData() vyhodila vyjimku IOException");
        } catch (CannotSendException ex) {
            assertSame("Vyjimka CannotSendException vyvolana jako reakce na " +
                    "vyjimku IOException nema spravne nastavenou " +
                    "svoji pricinu",connector.dataException,ex.getCause());
            assertNotNull("Vyjimka CannotSendExceptionvyvolana jako reakce na " +
                    "vyjimku IOException nema nastavenou smysluplnou zpravu " +
                    "o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Metoda UnreliableMessenger.send() misto ocekavane vyjimky " +
                    "CannotSendException vyhodila vyjimku " + ex);
        }
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
        assertEquals("Metoda Connection.sendData() byla zbytecne volana vicekrat",
                1,connector.sendDataCounter);
    }

    public void testSendDataWithErrorAndRetryIsOk() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,2);
        connector.dataException = new IOException();
        connector.dataExceptionCounter = 1;
        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
        } catch (Exception ex) {
            fail("Pri pokusu odeslat zpravu byla neocekavane vyhozena vyjimka "
                    + ex + " (jde o situaci, kdy napoprve metoda " +
                    "Connection.sendData() vyhodi vyjimku a az teprve napodruhe " +
                    "uspeje)");
        }
        assertEquals("Pri posilani zpravy nebyl poslan ocekavany text",
                "messageText",connector.sentData);
        assertEquals("Spojeni nebylo navazano se spravnou adresou","" +
                "address1",connector.host);
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
        assertEquals("Metoda Connection.sendData() byla zbytecne volana vicekrat",
                2,connector.sendDataCounter);
    }

    public void testSendDataWithErrorAndRetryIsNotOk() {
        TestConnector connector = new TestConnector();
        Messenger messenger = new UnreliableMessenger(connector,2);
        connector.dataException = new IOException();
        connector.dataExceptionCounter = 2;

        try {
            messenger.send(new MessageImpl("messageText",new String[]{"address1"}));
            fail("Metoda UnreliableMessenger.send() nevyhodi vyjimku, " +
                    "ackoliv se nepodarilo poslat data ani napodruhe a pocet " +
                    "opakovani byl nastaven na dve");
        } catch (CannotSendException ex) {
            assertSame("Vyjimka CannotSendException vyvolana jako reakce na " +
                    "vyjimku IOException nema spravne nastavenou " +
                    "svoji pricinu",connector.dataException,ex.getCause());
            assertNotNull("Vyjimka CannotSendExceptionvyvolana jako reakce na " +
                    "vyjimku IOException nema nastavenou smysluplnou zpravu " +
                    "o chybe",ex.getMessage());
        } catch (Exception ex) {
            fail("Metoda UnreliableMessenger.send() misto ocekavane vyjimky " +
                    "CannotSendException vyhodila vyjimku " + ex);
        }
        assertEquals("Metoda Counter.getConnection() byla zbytecne volana vicekrat",
                1,connector.getConnectionCounter);
        assertEquals("Metoda Connection.sendData() byla zbytecne volana vicekrat",
                2,connector.sendDataCounter);
    }

    private static class TestConnector implements Connector {

        private IOException dataException;
        private IOException connectionException;
        private int dataExceptionCounter;
        private String sentData;
        private String host;
        private int getConnectionCounter;
        private int sendDataCounter;

        public Connection getConnection(String target) throws
                UnknownHostException, NoRouteToHostException {
            getConnectionCounter++;
            if (connectionException instanceof NoRouteToHostException) {
                throw (NoRouteToHostException) connectionException;
            } else if (connectionException instanceof UnknownHostException) {
                throw (UnknownHostException) connectionException;
            } else {
                host = target;
                return new Connection() {
                    public void sendData(String data) throws IOException {
                        sendDataCounter++;
                        if (dataExceptionCounter-- > 0 && dataException != null) {
                            throw dataException;
                        }
                        sentData = data;
                    }
                };
            }
        }

        public IOException getConnectionException() {
            return connectionException;
        }

    }
}
