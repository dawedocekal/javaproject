package org.internship.task6;

import java.util.HashSet;
import java.util.Set;

/**
 * Demo for the first part.
 *
 * @author Radek Oslejsek
 */
public class Demo1
{
    public static void main(String[] args) {
        Countries countries = createCountries();

        System.out.println("==================================================");
        System.out.println("Countries sorted by name:");
        for (Country c : countries.getCountries()) {
            System.out.println("  * " + c);
        }
      System.out.println("----------------------------------------");
        System.out.println("Countries sorted by population:");
        for (Country c : countries.getCountriesByPopulation()) {
            System.out.println("  * " + c);
        }
    }

    protected static Countries createCountries() {
        Set<Country> cs = new HashSet<Country>();
        cs.add(new Country("Finland", 10));
        cs.add(new Country("Brazilia", 142));
        cs.add(new Country("Czech Republic", 10));
        Countries ret = new CountriesImpl();
        ret.addCountries(cs);
        return ret;
    }
}
