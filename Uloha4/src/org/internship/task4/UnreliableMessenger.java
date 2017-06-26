package org.internship.task4;

import java.net.NoRouteToHostException;
import java.net.UnknownHostException;

/**
 * Created by Davča on 2.6.2017.
 */
public class UnreliableMessenger extends SimpleMessenger {
    private Connector connector;
    private int maxAttends;
    private Connection connection;

    public UnreliableMessenger(Connector connector, int maxSendAttends) {
        this.connector = connector;
        this.maxAttends = maxSendAttends;
        if ((connector == null) ) {
            throw new NullPointerException("connector");
        }
        if ((maxAttends < 1)){
            throw new IllegalArgumentException("maxSendAttempts");
        }
    }

    @Override
    public void send(String target, String text) throws MessengerException, TargetUnreachableException {
        if ((target == null) || (text == null)) {
            throw new MessengerException("Text od target is null.");
        }
        try {
            connection = connector.getConnection(target);
        } catch (Exception e) {
            throw new TargetUnreachableException("Cannot get connectivity", e);
        }
        for (int i = 1; i <= maxAttends; i++) {
            try {
                connection.sendData(text);
            } catch (Exception e) {
                if (i >= maxAttends) {
                    throw new CannotSendException("Cannot send message.", e);
                }
            }
        }
        System.out.println("Sending " + text + " to " + target + ".");
    }


}
