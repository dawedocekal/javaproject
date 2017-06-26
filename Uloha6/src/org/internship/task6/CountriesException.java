package org.internship.task6;

public class CountriesException extends Exception
{
    public CountriesException() {
    }

    public CountriesException(String msg) {
        super(msg);
    }

    public CountriesException(Throwable cause) {
        super(cause);
    }

    public CountriesException(String msg, Throwable cause) {
        super(msg, cause);
    }
}