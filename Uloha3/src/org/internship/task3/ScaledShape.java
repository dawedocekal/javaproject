package org.internship.task3;

import java.awt.*;

/**
 * Created by Davča on 31.5.2017.
 */
public class ScaledShape implements Measurable, Scaled {
    private double scaleX;
    private double scaleY;
    private double oldArea;

    public ScaledShape(double scaleX, double scaleY, GeneralRegularPolygon generalRegularPolygon){
        this.oldArea = generalRegularPolygon.getArea();
        this.scaleY = scaleY;
        this.scaleX = scaleX;
    }
    @Override
    public double getScaleX() {
        return scaleX;
    }

    @Override
    public double getScaleY() {
        return scaleY;
    }

    @Override
    public double getArea() {
        double area;
        area = scaleX * scaleY * oldArea;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
