	/*
	 *	       __          __                __            
	 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
	 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
	 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
	 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
	 *                                                   
	 *                                                           
	 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
	 * 
	 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
	 *	sociální síti DEVBOOK.CZ	
	 *	
	 *	Kód můžete upravovat pod licencí MIT, 
	 *	tedy jak chcete, jen zmiňte odkaz na www.devbook.cz :-) 
	 */


package tahovyboj;

import java.util.Random;

/** Třída reprezentuje hrací kostku */
public class Kostka
{
    /** Generátor náhodných čísel */
    private Random random;
    /** Počet stěn kostky */
    private int pocetSten;

    /** Vytvoří novou instanci hrací kostky */
    public Kostka()
    {
        this.pocetSten = 6;
        random = new Random();
    }

    /**
     * Vytvoří novou instanci hrací kostky
     * @param pocetSten Počet stěn hrací kostky
     */ 
    public Kostka(int pocetSten)
    {
        this.pocetSten = pocetSten;
        random = new Random();
    }

    /**
     * Vrátí počet stěn hrací kostky
     * @return počet stěn hrací kostky
     */
    public int vratPocetSten()
    {
        return pocetSten;
    }

    /**
     * Vykoná hod kostkou
     * @return Číslo od 1 do počtu stěn
     */
    public int hod()
    {
        return random.nextInt(pocetSten + 1) + 1;
    }

    /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override
    public String toString()
    {
        return String.format("Kostka s %s stěnami", pocetSten);
    }

}
