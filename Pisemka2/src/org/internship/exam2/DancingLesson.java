package org.internship.exam2;

/**
 * Created by Davča on 9.6.2017.
 */
public class DancingLesson {
    private Dancer lady;
    private Dancer man;
    private Dancer[] dancers;

    public DancingLesson(Dancer[] dancers) {
        if (dancers == null) {
            throw new NullPointerException("Dancer does not exist");
        }
        for (int i = 0; i < dancers.length; i++) {
            if (dancers[i] == null) {
                throw new NullPointerException("Somewhere in list of dancers is someone who does not exist.");
            } else {
                this.dancers = dancers;
            }
        }
    }

    public Dancer getDancer(int number) {
        for (int i = 0; i < dancers.length; i++) {
            if (dancers[i].getNumber() == number) {
                return dancers[i];
            }
        }
        return null;
    }

    public boolean pair(int ladie, int gentleman) {
        this.lady = getDancer(ladie);
        this.man = getDancer(gentleman);
        try{
            lady.setPartner(man);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean disjoin(int dancer) {
        try{
            for (int i = 0; i < dancers.length; i++) {
                if (dancers[i].getNumber() == dancer) {
                   return dancers[i].unsetPartner();
                }
            }
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
}

