package org.internship.task2;

/**
 * Created by Davča on 30.5.2017.
 */
public class Torch implements Light,BatteryPowered{
    private int beam;
    private String message;
    private boolean hasBateries;
    public Torch(int beam, boolean hasBateries){
        this.beam = beam;
        this.hasBateries = hasBateries;
    }
    public Torch(){
        Torch torch = new Torch(0,false);
    }

    public String toString(){
        if (hasBatteries()){
            message = "Torch with batteries. Beam distance is " + beam + "m.";
        }
        else{
            message = "Torch without batteries. Beam distance is 0m.";
        }
        return message;
    }

    @Override
    public int beamDistance(){
        if (hasBateries != true){
            return 0;
        }
        else{
            return beam;
        }
    }

    @Override
    public boolean isDirectional() {
        return false;
    }

    @Override
    public boolean hasBatteries() {
        return true;
    }

    @Override
    public boolean insertBatteries() {
        return false;
    }

    @Override
    public boolean removeBatteries() {
        return false;
    }
}
