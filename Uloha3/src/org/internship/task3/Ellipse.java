package org.internship.task3;

/**
 * Created by Davča on 31.5.2017.
 */
public class Ellipse extends ScaledShape{
    private double scaleX;
    private double scaleY;
    public Ellipse(double main, double secondary){
        super(main, secondary, new Circle(1));
        this.scaleX = main;
        this.scaleY = secondary;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = Math.PI*((1.5)*(scaleX + scaleY) - Math.sqrt(scaleX * scaleY));
        return perimeter;
    }
}
