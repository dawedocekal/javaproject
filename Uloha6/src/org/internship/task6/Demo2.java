package org.internship.task6;
import java.util.Set;
import java.util.HashSet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;


public class Demo2
{
    public static void main(String[] args) throws IOException {
        CountriesIO countries = createCountries();

        System.out.println("---- Test ukladani dat");
        try {
            countries.save(new FileOutputStream("output-data.txt"));
            System.out.println(" [OK] podivejte se do souboru 'output-data.txt'");
        } catch (CountriesException ex) {
            System.out.println(" [ERROR] byla vyhozena vyjimka: " + ex);
        }

        countries = new CountriesIOImpl();
        System.out.println();
        System.out.println("---- Test nacteni bezchybnych dat z 'input-data-ok.txt'");
        try {
            boolean lres = countries.load(new FileInputStream("input-data-ok.txt"));
            if (!lres) {
                System.out.println(" [ERROR] load vratilo false");
            } else {
                System.out.println(" [OK] nasledujici vypis by se mel (az na poradi radku) shodovat se souborem 'input-data-ok.txt':");
                System.out.println();
                countries.save(System.out);
            }
        } catch (CountriesException ex) {
            System.out.println(" [ERROR] byla vyhozena vyjimka: " + ex);
        }
        System.out.println();

        testErrorFile("input-data-error-1.txt");
        testErrorFile("input-data-error-2.txt");
        testErrorFile("input-data-error-3.txt");
    }

    protected static CountriesIO createCountries() {
        Set<Country> cs = new HashSet<Country>();
        cs.add(new Country("Finland", 10));
        cs.add(new Country("Brazilia", 142));
        cs.add(new Country("Czech Republic", 10));
        CountriesIO ret = new CountriesIOImpl();
        ret.addCountries(cs);
        return ret;
    }


    protected static void testErrorFile(String file) {
        CountriesIO countries = new CountriesIOImpl();
        System.out.println("---- Test nacteni chybnych dat z '" + file + "'");
        try {
            countries.load(new FileInputStream(file));
            System.out.println(" [ERROR] nebyla vyhozena vyjimka");
        } catch (CountriesException ex) {
            System.out.println(" [OK]");
        } catch (Exception ex) {
            System.out.println(" [ERROR] byla vyhozena spatna vyjimka: " + ex);
        }
    }
}