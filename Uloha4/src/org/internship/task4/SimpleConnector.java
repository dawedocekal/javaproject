package org.internship.task4;


        import java.io.IOException;
        import java.net.NoRouteToHostException;
        import java.net.UnknownHostException;
        import java.util.Random;

/**
 * Tato trida reprezentuje jednoduchy nespolehlivy Connector, ktery
 * umozni uspesne provedeni operace az na nekolikaty pokus.
 */
public class SimpleConnector implements Connector {

    private Random random = new Random();
    private int retries = random.nextInt(10);
    private boolean nrthFailure = false;

    /**
     * Navaze a vrati spojeni s pocitacem, jehoz adresa je zadana jako parametr.
     *
     * @param target adresa pocitace, s nimz ma byt spojeni navazano
     * @throws java.net.UnknownHostException pokud dana adresa pocitace nexistuje
     * @throws java.net.NoRouteToHostException pokud neni mozne s danym
     * pocitacem navazat spojeni z duvodu nedostatecnych smerovacich informaci
     * @return Navazane spojeni s danym pocitacem
     */
    public Connection getConnection(String target) throws UnknownHostException,
            NoRouteToHostException {

        retries--;
        if (retries <= 0) {
            retries = random.nextInt(10);
            if (nrthFailure = !nrthFailure) {
                throw new NoRouteToHostException("No route to " + target +
                        " (counter: " + retries + ").");
            } else {
                throw new UnknownHostException("No host: " + target +
                        " (counter: " + retries + ").");
            }
        } else {
            return new SimpleConnection(target);
        }
    }

    private class SimpleConnection implements Connection {

        private int retries = random.nextInt(8);
        private String target;

        private SimpleConnection(String target) {
            this.target = target;
        }

        public void sendData(String data) throws IOException {
            retries--;
            if(retries > 0) {
                throw new IOException("Cannot send data (counter: "+retries+")");
            } else {
                retries = random.nextInt(8);
                System.out.println("Data '"+ data +"' sent to '" + target + "'.");
            }
        }
    }

}
