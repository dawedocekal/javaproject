package org.internship.task5;

import java.util.Collection;

/**
 * Continents. Single country can be shared by several continents, e.g. Russia.
 */
public interface Continents
{
    /**
     * Adds a country to the continent.
     *
     * @param continent Continent
     * @param country Country to be added
     * @return false if the contitent or country arguments are null or if the continent
     *         already contained the specified country
     */
    boolean add(Continent continent, Country country);

    /**
     * Removes country from the continent.
     *
     * @param continent Continent
     * @param country Country to be removed
     * @return false if the continent does not exist or does not contain specified country
     */
    boolean remove(Continent continent, Country country);

    /**
     * Computes population of the continent.
     *
     * @param continent Continent
     * @return population, 0  if the continent does not exist
     */
    int getPopulation(Continent continent);

    /**
     * @param continent Continent
     * @return All countries of the continent.
     *         If the continent does not exist or has no country then empty
     *         collection is returned.
     */
    Collection<Country> getCountries(Continent continent);

    /**
     * Returns all countries of all continent WITHOUT DUPLICITIES
     * (one country can by located in multiple continets, i.e. Russia).
     *
     * @return all countries of all continents (without duplicities)
     */
    Collection<Country> getAllCountries();

    /**
     * Searches for the countries with the highest population.
     * Because there can exist multiple most populated countries then a collection is returned.
     *
     * @return Collection of the most populated countries. Never returns null.
     */
    Collection<Country> getMostPopulatedCountries();

    /**
     * @return list of continents and their countries. For the format see listings
     *         in the homework assignment
     */
    String toString();
}
