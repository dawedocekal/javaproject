package org.internship.task1;

/**
 * Created by Davča on 18.5.2017.
 */
public class Bus {
    private int capacity;
    private boolean empty;
    private boolean noempty;
    private int passengers;
    private String message;
    private int number;

    public Bus(Line line, int capacity) {
        this.capacity = capacity;
        line.getLineNumber(41);
        this.number = number;
    }
    public boolean getOn(){
        if (passengers >= capacity){
            empty = false;
        }
        else {
            empty = true;
        }
        passengers++;
        return empty;
    }
    public boolean getOff(){
        if (passengers > 0){
            noempty = true;
        }
        else{
            noempty = false;
        }
        passengers--;
        if (passengers < 0) {
            passengers = 0;
        }
        return noempty;
    }

    public String toString(int number){
     message = "Bus no. " + number + " is carrying " + passengers + " passengers.";
     return message;
    }
}
