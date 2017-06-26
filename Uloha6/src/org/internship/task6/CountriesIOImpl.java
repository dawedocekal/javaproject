package org.internship.task6;

import java.io.*;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Davča on 6.6.2017.
 */
public class CountriesIOImpl implements CountriesIO {
    private Set<Country> countries2 = new TreeSet<>();
    private Set<Country> countries3 = new TreeSet<>(new CountryComparator());
    private String s;

    @Override
    public boolean addCountries(Set<Country> countries) {
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

    @Override
    public boolean load(InputStream input) throws CountriesException {
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        boolean added = false;
        try {
           do {
               String s = br.readLine();
               String[] array = s.split(" ",2);
               Country c = new Country(array[1], Integer.parseInt(array[0]));
               added = countries2.add(c);
           }
           while (br.ready());
           return added;
        }
        catch (Exception e){
            throw new CountriesException("Error in input.");
        }
    }

    @Override
    public void save(OutputStream output) throws CountriesException {
        PrintWriter pw = new PrintWriter(output);
            pw.println(countries2);
           // pw.flush();
            if (pw.checkError()){
                throw new CountriesException("Error in output");
            }
    }
}
