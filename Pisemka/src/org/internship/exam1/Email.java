package org.internship.exam1;

/**
 * Email
 * All methods here are simple getters/setters
 */
public interface Email extends Sender {

    /**
     * Returns SMTP server of email provider.
     *
     * @return SMTP server.
     */
    String getSmtp();

    /**
     * Sends a message with subject from one person to another
     *
     * @param from sender
     * @param to receiver
     * @param content the message
     * @param subject subject of the message
     * @return true if message is successfully sent
     */
    boolean send(Person from, Person to, String content, String subject);
}