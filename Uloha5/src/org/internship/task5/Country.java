package org.internship.task5;

import javax.management.openmbean.CompositeData;

import static sun.management.MonitorInfoCompositeData.getIdentityHashCode;

/**
 * Country.
 */
public class Country
{
    private String name;

    private int population;

    /**
     * Constructor.
     *
     * @param name The name of the country, must not be null.
     * @param population Current population
     * @throws NullPointerException if the name is null.
     * @throws IllegalArgumentException if the population parameters is <= 0
     */
    public Country(String name, int population)
    {
        if (name == null)    throw new NullPointerException("name");
        if (population <= 0) throw new IllegalArgumentException("population");

        this.name       = name;
        this.population = population;
    }

    /**
     * @return Name of the country
     */
    public String getName() {
        return name;
    }

    /**
     * @return Current population
     */
    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj!=null)) {
            if ((obj instanceof Country)){
                Country country1 = (Country)obj;
                if (country1.getName().equals(this.getName())){
                    return true;
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 3 * name.hashCode();
    }
}
