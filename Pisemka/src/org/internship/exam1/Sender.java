package org.internship.exam1;

/**
 * Sender
 */
public interface Sender {

    /**
     * Sends a message from one person to another
     *
     * @param from sender
     * @param to receiver
     * @param content the message
     * @return true if message is successfully sent
     */
    boolean send(Person from, Person to, String content);
}
