package org.internship.task3;

/**
 * Created by Davča on 31.5.2017.
 */
public class Rectangle extends ScaledShape{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        super(width, height, new Square(1));
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (width+height);
        return perimeter;
    }
}
