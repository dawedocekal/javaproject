package org.internship.task6;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Davča on 6.6.2017.
 */
public class CountryComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        int cisilko = 0;
        if (o1.getPopulation() != o2.getPopulation()) {
            cisilko = Integer.compare(o1.getPopulation(), o2.getPopulation());
        }
        else{
            cisilko = o1.getName().compareTo(o2.getName());
        }
        return cisilko;
    }
}
