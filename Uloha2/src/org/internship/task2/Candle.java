package org.internship.task2;
/**
 * Created by Davča on 30.5.2017.
 */
public class Candle implements Light {
    private int distance;
    private String message;
    public Candle(int distance){
        this.distance = distance;
    }
    public Candle(){
        this.distance = 3;
    }
    public String toString(){
        message = "Candle with beam distance of " + distance + "m.";
        return message;
    }

    @Override
    public int beamDistance() {
        return 0;
    }

    @Override
    public boolean isDirectional() {
        return false;
    }
}
