package org.internship.task1;

/**
 * Created by Davča on 29.5.2017.
 */
public class Demo2 {
    public static void main(String[] args) {
        Line line = new Line(41, "Vranov", "Semilasso");
        Line line2 = new Line(50, "Komarov", "Zoo");
        Bus bus1 = new Bus(line , 22);
        Bus bus2 = new Bus(line2, 5);
        Passenger pass = new Passenger();
        pass.getOn(bus1);
        pass.getOn(bus2);
        pass.getOff();
        pass.getOff();
        pass.changeBus(bus2);
        pass.changeBus(bus1);
        System.out.println(pass.toString());
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
    }
}
