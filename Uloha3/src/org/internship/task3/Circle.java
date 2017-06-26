package org.internship.task3;
import java.lang.Integer;

/**
 * Created by Davča on 31.5.2017.
 */
public class Circle extends GeneralRegularPolygon {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        setEdgeLength(0);
        setNumEdges((double) Integer.MAX_VALUE);
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
}
