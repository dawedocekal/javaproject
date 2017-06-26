package org.internship.task4;

/**
 * Created by Davča on 1.6.2017.
 */
public class MessengerException extends Exception {
    public MessengerException(String message) {
        super(message);
    }

    public MessengerException(String message, Throwable cause) {
        super(message, cause);
    }
}
