package org.internship.task4;

import java.io.IOException;

/**
 * Toto rozhrani reprezentuje spojeni navazane s nejakym pocitacem.
 */
public interface Connection {

    /**
     * Posle danemu pocitaci nejaka data.
     *
     * @param data data, ktera maji byt poslana
     * @throws java.io.IOException pokud dojde k nejake chybe pri posilani dat
     */
    public void sendData(String data) throws IOException;

}