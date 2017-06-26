package org.internship.task2;

/**
 * Created by Davča on 30.5.2017.
 */
public class NightWatchman {
    private Light light;
    private String message;
    public NightWatchman(){
        this.light = null;
    }
    public boolean hasLight(){
        if (light == null){
        return false;}
        else {
            return true;
        }
    }
   public Light changeLight(Light lightInfo){
        Light oldLight;
        oldLight = light;
        this.light = lightInfo;
        return oldLight;
   }
   public String toString(){
       if (light == null){
           message = "Night watchman's equipment: None";
       }
       else {
           message = "Night watchman's equipment: " + light;
       }
       return message;
   }
}
