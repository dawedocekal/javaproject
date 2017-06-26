package org.internship.task3;

import static java.lang.Math.sin;

/**
 * Created by Davča on 31.5.2017.
 */
public abstract class GeneralRegularPolygon implements Measurable,RegularPolygon {
    private double a;
    private double n;

    public void setEdgeLength(double a){
        this.a = a;
    }
    public void setNumEdges(double n){
        this.n = n;
    }

    @Override
    public double getEdgeLength() {
        return a;
    }

    @Override
    public double getNumEdges() {
        return n;
    }

    @Override
    public double getRadius() {
        double r = a / (2 * sin(Math.PI / n));
        return r;
    }

    @Override
    public double getArea() {
        double r = getRadius();
        double x = (2 * Math.PI) / n;
        double area = ((n * r * r * sin(x)))*0.5;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = n*a;
        return perimeter;
    }

}
