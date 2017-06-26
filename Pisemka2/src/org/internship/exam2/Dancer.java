package org.internship.exam2;

/**
 * Dancer.
 */
public class Dancer {
    private Dancer partner;

    private boolean female;

    private int number;

    /**
     * @param number   Dancer's number
     * @param isFemale Dancer's genre
     */
    public Dancer(int number, boolean isFemale) {
        this.number = number;
        female = isFemale;
    }

    /**
     * @return true if the dancer has a partner
     */
    public boolean hasPartner() {
        return partner != null;
    }

    /**
     * @return true if the dancer is female
     */
    public boolean isFemale() {
        return female;
    }

    /**
     * @return true if the dancer is male
     */
    public boolean isMale() {
        return !female;
    }

    /**
     * @return dancer's number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Breaks the dancing pair, i.e. unsets partner of this dancer and vice versa.
     *
     * @return false if this dancer had no partner.
     */
    public boolean unsetPartner() {
        if (!hasPartner()) return false;
        partner.partner = null;
        partner = null;
        return true;
    }

    public void setPartner(Dancer partner) throws DancerException {
        if (partner == null) {
            throw new NullPointerException("Partner does not exist.");
        }
        if ((this.partner.hasPartner()) || (partner.hasPartner())) {
            throw new DancerException("One of them alreade has partner");
        }
        if (((this.partner.isMale()) && partner.isMale()) || ((this.partner.isFemale()) && (partner.isFemale()))) {
            throw new DancerException("Same genres.");
        }
        if ((this.number == partner.number)){
            throw new DancerException("One human.");
        }
    }
}
