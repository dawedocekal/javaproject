package org.internship.task4;

import java.net.NoRouteToHostException;
import java.net.UnknownHostException;

/**
 * Created by Davča on 1.6.2017.
 */
public class SimpleMessenger implements Messenger {
    public static void main (String[]args) throws MessengerException {
        SimpleMessenger simp = new SimpleMessenger();
        simp.send("target1", "test message");
        simp.send("target2", "test message");
    }

    @Override
    public void send(String target, String text) throws MessengerException {
        if ((target == null) || (text == null)) {
            throw new MessengerException("Text od target is null.");
        }
        System.out.println("Sending " + text + " to " + target + ".");
    }

    @Override
    public void send(Message message) throws MessengerException {
        if (message == null) {
            throw new MessengerException("Message is null.");
        }
        String msg = message.getText();
        for (int i = 0; i < message.numTargets(); i++) {
            String trg = message.getTarget(i);
            send(trg, msg);
        }
    }

}
