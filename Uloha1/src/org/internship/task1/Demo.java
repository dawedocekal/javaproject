package org.internship.task1;

/**
 * Created by Davča on 18.5.2017.
 */
public class Demo {
    public static void main(String[] args) {
        int i;

        /**
         * Constructors
         * Calling from other classes
         */

        Line line = new Line(41, "Vranov", "Semilasso");
        Line line2 = new Line(50, "Komarov", "Zoo");
        Bus bus1 = new Bus(line , 22);
        Bus bus2 = new Bus(line2, 5);
        Bus bus3 = new Bus(line2, 22);

        /**
         * methods to get on and get off bus
         */
        bus1.getOn();
        bus1.getOff();
        bus1.getOff();
        for (i=1;i < 7;i++){
            bus2.getOn();
        }
        bus3.getOn();
        bus3.getOn();
        System.out.println(bus1.toString(line.getLineNumber(41)));
        System.out.println(bus2.toString(line2.getLineNumber(50)));
        System.out.println(bus3.toString(line2.getLineNumber(50)));
}
}
