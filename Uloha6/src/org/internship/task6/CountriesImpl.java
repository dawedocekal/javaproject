package org.internship.task6;

import java.util.*;

/**
 * Created by Davča on 6.6.2017.
 */
public class CountriesImpl implements Countries {
    private Set<Country> countries2 = new TreeSet<>();
    private Set<Country> countries3 = new TreeSet<>(new CountryComparator());

    @Override
    public boolean addCountries(Set<Country> countries) throws NullPointerException{
        if ((countries2 == null)||(countries==null)){
            new NullPointerException("Something is null.");
        }
            this.countries2.addAll(countries);
            return true;
    }

    @Override
    public Collection<Country> getCountries() {
        return countries2;
    }

    @Override
    public Collection<Country> getCountriesByPopulation() {
        countries3.addAll(countries2);
        return countries3;
    }
}
