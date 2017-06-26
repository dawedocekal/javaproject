package org.internship.task3;

import java.util.Locale;
import static java.lang.Math.*;

public class Demo
{
    public static void main(String[] args) {
        write("Square", new Square(3.0));
        write("Regular Octagon", new RegularOctagon(3.0));


        write("Circle", new Circle(3.0));
        write("Rectangle", new Rectangle(3.0, 2.0));
        write("Ellipse", new Ellipse(3.0, 2.0));

    }

    protected static void write(String shape, Measurable mes) {
        System.out.println(shape + ": area = " + String.format(new Locale("en"), "%.1f", mes.getArea()) +
                ", perimeter = " + String.format(new Locale("en"), "%.1f", mes.getPerimeter()));
    }
}
