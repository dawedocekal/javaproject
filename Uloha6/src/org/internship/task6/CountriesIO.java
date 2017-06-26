package org.internship.task6;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * This interface extends the Countries with methods enabling
 * to store and recover countries by writing/reading data to/from IO streams.
 *
 */
public interface CountriesIO extends Countries
{
    /**
     * Reads input stream and appends new countries.
     * This method should fail atomically, i.e. if reading fails for some
     * reason, then the old collection of countries is preserved!
     *
     * Format of input data is as follows:
     * a) input is in text format
     * a) single line contains information just about one country
     * b) each line contains population and name of the country separated by single white space
     * c) name of the country can consist of more white-space-separated text strings
     *
     * Example:
     * 10 Finland
     * 10 Czech Republic
     * 142 Brazilia
     *
     * @param input Input stream (source of data).
     * @return true if some new country has been really added
     * @throws CountriesException on IO failure or if the data in input stream
     *         has invalid format.
     */
    boolean load(InputStream input) throws CountriesException;

    /**
     * Writes countries into given output stream.
     * Output format -- see load() method.
     *
     * @param output Output stream.
     * @throws CountriesException on I/O failure.
     */
    void save(OutputStream output) throws CountriesException;

}
