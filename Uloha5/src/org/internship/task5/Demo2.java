package org.internship.task5;

public class Demo2
{
    public static void main(String[] args) {
        Country cr = new Country("Czech Republic", 10);
        Country cr2 = new Country("Czech Republic", 15);
        Country fin = new Country("Finland", 10);
        Country rus = new Country("Russia", 142);
        Country bra = new Country("Brazilia", 142);

        Continents cont = new ContinentsImpl();

        System.out.println("Empty atlas: ");
        System.out.println(cont);

        System.out.println("Initial atlas: ");
        cont.add(Continent.EUROPE, cr);
        cont.add(Continent.EUROPE, rus);
        cont.add(Continent.EUROPE, fin);
        cont.add(Continent.EUROPE, cr2);
        cont.add(Continent.SOUTH_AMERICA, bra);
        cont.add(Continent.ASIA, rus);
        cont.add(Continent.EUROPE, null);
        cont.add(null, cr);
        System.out.println(cont);

        System.out.println("Nothing will change: ");
        cont.remove(Continent.ASIA, fin);
        cont.remove(Continent.AFRICA, fin);
        cont.remove(Continent.EUROPE, null);
        cont.remove(null, fin);
        System.out.println(cont);

        System.out.println("Removed Finland: ");
        cont.remove(Continent.EUROPE, fin);
        System.out.println(cont);

        System.out.println("Population: ");
        System.out.println("Europe: " + cont.getPopulation(Continent.EUROPE));
        System.out.println("Asia:   " + cont.getPopulation(Continent.ASIA));
        System.out.println("Africa: " + cont.getPopulation(Continent.AFRICA));
        System.out.println("'null': " + cont.getPopulation(null));

        System.out.println("Most populated countries: ");
        System.out.println(cont.getMostPopulatedCountries());
    }
}