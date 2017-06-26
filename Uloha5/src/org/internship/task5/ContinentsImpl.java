package org.internship.task5;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Davča on 5.6.2017.
 */
public class ContinentsImpl implements Continents {
    private Set<Country> set = new HashSet<>();
    private Set<Country> EUROPE = new HashSet<>();
    private Set<Country> ASIA = new HashSet<>();
    private Set<Country> NORTH_AMERICA = new HashSet<>();
    private Set<Country> SOUTH_AMERICA = new HashSet<>();
    private Set<Country> AFRICA = new HashSet<>();
    private Set<Country> AUSTRALIA = new HashSet<>();
    private Set<Country> ANTARCTICA = new HashSet<>();
    private boolean add;
    private int population1;
    private int population2;
    private int population3;
    private int population4;
    private int population5;
    private int population6;
    private int population7;
    private int max_pop;

    @Override
    public boolean add(Continent continent, Country country) {
        if ((continent == null) || (country == null)) {
            return false;
        }
        switch (continent) {
            case ASIA:
                if (ASIA.add(country)) {
                    add = true;
                    population1 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case AFRICA:
                if (AFRICA.add(country)) {
                    add = true;
                    population2 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case EUROPE:
                if (EUROPE.add(country)) {
                    add = true;
                    population3 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case AUSTRALIA:
                if (AUSTRALIA.add(country)) {
                    add = true;
                    population4 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case ANTARCTICA:
                if (ANTARCTICA.add(country)) {
                    add = true;
                    population5 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case NORTH_AMERICA:
                if (NORTH_AMERICA.add(country)) {
                    add = true;
                    population6 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case SOUTH_AMERICA:
                if (SOUTH_AMERICA.add(country)) {
                    add = true;
                    population7 += country.getPopulation();
                } else {
                    add = false;
                }
                break;
        }
        set.add(country);
        return add;
    }

    @Override
    public boolean remove(Continent continent, Country country) {
        if ((country == null) || (continent == null)) {
            return false;
        }
        switch (continent) {
            case ASIA:
                if (ASIA.remove(country)) {
                    add = true;
                    population1 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case AFRICA:
                if (AFRICA.remove(country)) {
                    add = true;
                    population2 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case EUROPE:
                if (EUROPE.remove(country)) {
                    add = true;
                    population3 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case AUSTRALIA:
                if (AUSTRALIA.remove(country)) {
                    add = true;
                    population4 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case ANTARCTICA:
                if (ANTARCTICA.remove(country)) {
                    add = true;
                    population5 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case NORTH_AMERICA:
                if (NORTH_AMERICA.remove(country)) {
                    add = true;
                    population6 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            case SOUTH_AMERICA:
                if (SOUTH_AMERICA.remove(country)) {
                    add = true;
                    population7 -= country.getPopulation();
                } else {
                    add = false;
                }
                break;
            default:
                return false;
        }
        set.remove(country);
        return add;
    }

    @Override
    public int getPopulation(Continent continent) {
        if (continent == null) {
            return 0;
        }
        switch (continent) {
            case ASIA:
                return population1;
            case AFRICA:
                return population2;
            case EUROPE:
                return population3;
            case AUSTRALIA:
                return population4;
            case ANTARCTICA:
                return population5;
            case NORTH_AMERICA:
                return population6;
            case SOUTH_AMERICA:
                return population7;
            default:
                return 0;
        }
    }

    @Override
    public Collection<Country> getCountries(Continent continent) {
        switch (continent) {
            case ASIA:
                return ASIA;
            case AFRICA:
                return AFRICA;
            case EUROPE:
                return EUROPE;
            case AUSTRALIA:
                return AUSTRALIA;
            case ANTARCTICA:
                return ANTARCTICA;
            case NORTH_AMERICA:
                return NORTH_AMERICA;
            case SOUTH_AMERICA:
                return SOUTH_AMERICA;
            default:
                return null;
        }
    }

    @Override
    public Collection<Country> getAllCountries() {
        return set;
    }

    @Override
    public Collection<Country> getMostPopulatedCountries() {
        int population = 0;
        Set<Country> biggest = new HashSet();
        for (Country c : set) {
            population = c.getPopulation();
            if (max_pop < population) {
                max_pop = population;
            }
        }
        for (Country c : set) {
            if (max_pop == c.getPopulation()) {
                biggest.add(c);
            }
        }
        return biggest;
    }
   @Override
    public String toString(){
        return "{ASIA="+Arrays.toString(ASIA.toArray())+", EUROPE="+Arrays.toString(EUROPE.toArray())+", SOUTH_AMERICA="+Arrays.toString(SOUTH_AMERICA.toArray())+"}";
    }
}
