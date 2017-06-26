package org.internship.task1;

/**
 * Created by Davča on 29.5.2017.
 */
public class Passenger {
    private int numero;
    private int passenger;
    private String message;
    private Bus bus;
    /**
     * Returns either the passenger's bus or null.
     *
     * @return bus or null
     */
    public Bus getBus(){
        return bus;
    }

    /**
     * Determines whether the passenger is inside a bus.
     *
     * @return true if the passenger is travelling in a bus,
     *         false otherwise
     */
    public boolean isInBus(){
        if (bus != null){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean getOn(Bus bus){
       if ((bus == null)||(isInBus())||(bus.isFull())){
           return false;
       }
       else {
           bus.getOn();
           this.bus = bus;
           return true;
       }
    }

    /**
     * Getting off the bus.
     *
     * @return false if the passenger is actually not travelling in a bus,
     *         true otherwise;
     */
    public boolean getOff(){
        if (!isInBus()){
            return false;
        }
        else {
            bus.getOff();
            this.bus = null;
            return true;
        }
    }

    /**
     * Changing to another bus: First, the passenger gets off
     * the old bus (if the passenger is actually
     * not travelling in a bus then this step is skipped).
     * Then the passenger tries to get on the new bus.
     *
     * @param newBus New bus to get on
     * @return false if either the newBus parameter is null or the new bus is full,
     *         true otherwise
     */
    public boolean changeBus(Bus newBus){
        if ((newBus == null)||(newBus.isFull())){
            return false;
        }
        else {
                getOff();
            return getOn(newBus);
        }
    }

    /**
     * @return either "Passenger is travelling in a bus" or "Passenger is not travelling in a bus"
     */
    @Override
    public String toString(){
        if (isInBus()){
            message = "Passenger is traveling in bus";
        }
        else{
            message = "Passenger isn't traveling in bus";
        }
        return message;
    }
}
