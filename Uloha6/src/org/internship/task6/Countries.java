package org.internship.task6;

import java.util.Collection;
import java.util.Set;

/**
 * Union of several countries.
 */
public interface Countries
{
    /**
     * Adds new countries.
     *
     * @param countries Set of countries to be added
     * @return true if some new country has been really added
     * @throws NullPointerException if the specified countries argument is null or if any element is null
     */
    boolean addCountries(Set<Country> countries);

    /**
     * @return Countries sorted by their name
     */
    Collection<Country> getCountries();

    /**
     * @return Countries sorted by their population (primary characteristic)
     * and name (secondary characteristic)
     */
    Collection<Country> getCountriesByPopulation();
}