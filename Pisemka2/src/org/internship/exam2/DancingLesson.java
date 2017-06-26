package org.internship.exam2;

/**
 * Created by Davča on 9.6.2017.
 */
public class DancingLesson {
    private Dancer dancer;
    private int dancerr;
    private int number;
    private int lady;
    private int man;
    private boolean lady2;
    private boolean man2;
    private boolean unset;
    public DancingLesson(Dancer[] dancers) {
        if (dancers == null) {
            throw new NullPointerException("Dancer does not exist");
        }
        for (int i = 0; i <= dancers.length; i++) {
            if (dancers[i] == null) {
                throw new NullPointerException("Somewhere in list of dancers is someone who does not exist.");
            }
            if (dancers[i].getNumber() == number) {
                this.dancer = dancers[i];
            }
            if (dancers[i].getNumber() == man){
                if (dancers[i].hasPartner()) {
                    man2 = false;
                }
            }
            if (dancers[i].getNumber() == lady){
                if (dancers[i].hasPartner()) {
                    lady2 = false;
                }
            }
            if (dancers[i].getNumber() == dancerr){
                if (dancers[i].unsetPartner()){
                    unset = true;
                }
            }
        }
    }
    public Dancer getDancer(int number){
        this.number = number;
        if (dancer!=null){
            return dancer;
        }
        else{
            return null;
        }
    }
    public boolean pair(int ladie, int gentleman){
       this.lady = ladie;
       this.man = gentleman;
        if ((ladie!=0)&&(gentleman!=0)&&(lady2!=false)&&(man2!=false)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean disjoin(int dancer){
        this.dancerr = dancer;
        if (dancer == 0){return false;}
        return unset;
    }
}

