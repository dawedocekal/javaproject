package org.internship.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Davča on 2.6.2017.
 */
public class CountryUnionImpl implements CountryUnion {
        private Set<Country> set = new HashSet<Country>();
        @Override
        public boolean add(Country country) {
            if (country == null) {
                return false;
            }
            else {
                return set.add(country);
                }
        }

        @Override
        public boolean remove(Country country) {
            if (country == null) {
                return false;
            }
            else{
                return set.remove(country);
            }
        }

        @Override
        public int getPopulation() {
            int population = 0;
            for (Country c : set){
                population += c.getPopulation();
            }
            return population;
        }

        @Override
        public Collection<Country> getCountries() {
            return set;
        }
}
