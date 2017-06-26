package org.internship.task5;

import java.util.Collection;

/**
 * Union of several countries.
 *
 * @author Radek Oslejsek
 * @version 2011-11-21
 */
public interface CountryUnion
{
    /**
     * Adds a new country to the union.
     *
     * @param country Country to be added
     * @return false if the county argument is null or if this union already contained
     *         the specified country
     */
    boolean add(Country country);

    /**
     * Removes country from the union.
     *
     * @param country Country to be removed
     * @return true if the union contained the specified country
     */
    boolean remove(Country country);

    /**
     * Computes population, i.e. number of people living in the union.
     *
     * @return population in the union.
     */
    int getPopulation();

    /**
     * @return All countries of the union. If the union has no country then empty collection
     * is returned.
     */
    Collection<Country> getCountries();

    /**
     * @return list of countries in the format "[country1, country2, ...]"
     */
    String toString();
}