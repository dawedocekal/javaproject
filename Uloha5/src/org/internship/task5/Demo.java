package org.internship.task5;

/**
 * Write a description of class Demo here.
 */
public class Demo
{
    public static void main(String[] args) {
        Country cr = new Country("Czech Republic", 10);
        Country cr2 = new Country("Czech Republic", 15);
        Country fin = new Country("Finland", 10);
        Country rus = new Country("Russia", 142);

        printEquals(cr, cr, true);
        printEquals(cr, cr2, true);
        printEquals(cr, null, false);
        printEquals(cr, fin, false);

        CountryUnion union = new CountryUnionImpl();
        printPopulation(union, 0);
        System.out.print("Adding Czech Republic: ");
        union.add(cr);
        printPopulation(union, 10);
        System.out.print("Adding Russia: ");
        union.add(rus);
        printPopulation(union, 152);
        System.out.print("Re-adding Czech Republic: ");
        union.add(cr2);
        printPopulation(union, 152);
        System.out.print("Removing Czech Republic: ");
        union.remove(cr);
        printPopulation(union, 142);
        System.out.print("Removing Finland: ");
        union.remove(fin);
        printPopulation(union, 142);
    }

    public static void printEquals(Object obj1, Object obj2, boolean eq) {
        System.out.print(obj1 + " and " + obj2 + " are ");
        System.out.print(obj1.equals(obj2) ? "EQUAL" : "NOT EQUAL");
        System.out.println(", expected: " + (eq ? "EQUAL" : "NOT EQUAL"));
    }

    public static void printPopulation(CountryUnion union, int expected) {
        System.out.print(union.getCountries());
        System.out.println(", population: " + union.getPopulation() + ", expected: " + expected);
    }
}
