package org.internship.task3;
import static java.lang.Math.*;

/**
 * Created by Davča on 31.5.2017.
 */
public class Square extends GeneralRegularPolygon{
    private double a;
    public Square(double a){
        this.a = a;
        setEdgeLength(a);
        setNumEdges(4);
    }

    @Override
    public double getArea() {
        double perimeter = a*a;
        return perimeter;
    }
}
