package org.internship.task4;

/**
 * Created by Davča on 2.6.2017.
 */
public class CannotSendException extends MessengerException {
    public CannotSendException(String message, Throwable cause) {
        super(message,cause);
    }
}
