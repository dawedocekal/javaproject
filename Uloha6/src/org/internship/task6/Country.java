package org.internship.task6;

public class Country implements Comparable
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
        return getName() + " with the population of " + population + " mil. people";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Country)) return false;
        Country country = (Country) obj;
        return country.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        int cisilko = 0;
        if (o instanceof Country) {
            Country c = (Country) o;
            cisilko = this.name.compareTo(c.getName());
        }
        return cisilko;
    }
}
