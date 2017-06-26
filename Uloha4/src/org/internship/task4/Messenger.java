package org.internship.task4;

import java.net.NoRouteToHostException;
import java.net.UnknownHostException;

/**
 * Interface for sending messages.
 */
public interface Messenger {

    /**
     * Sends message to concrete recipient.
     *
     * @param target terget (recipient) of the message
     * @param text text of the message
     * @throws throws MessegerException if the sending fails for some reason
     */
    void send(String target, String text) throws MessengerException, NoRouteToHostException, UnknownHostException;

    /**
     * Sends message to all recipients.
     *
     * @param message message
     * @throws throws MessengerException if the sending fails for some reason
     */
    void send(Message message) throws MessengerException;
}