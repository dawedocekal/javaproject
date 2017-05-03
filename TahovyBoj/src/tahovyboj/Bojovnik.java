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

public class Bojovnik {
    /** Jméno bojovníka */
    private String jmeno;
    /** Život v HP */
    private int zivot;
    /** Maximální zdraví */
    private int maxZivot;
    /** Útok v HP */
    private int utok;
    /** Obrana v HP */
    private int obrana;
    /** Instance hrací kostky */
    private Kostka kostka;
    /** Poslední zpráva */
    private String zprava;

    /**
     * Vytvoří novou instanci bojovníka
     * @param jmeno Jméno bojovníka
     * @param zivot Život v HP
     * @param utok Útok v HP
     * @param obrana Obrana v HP
     * @param kostka Instance hrací kostky
     */
    public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kostka kostka)
    {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }

    /**
     *  Provede útok na soupeře
     * @param souper Soupeř bojovník
     */
    public void utoc(Bojovnik souper)
    {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s útočí s úderem za %s hp", jmeno, uder));
        souper.branSe(uder);
    }

    /**
     *  Brání se proti úderu soupeře
     * @param uder Úder soupeře v HP
     */
    public void branSe(int uder)
    {            
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0)
        {
            zivot -= zraneni;
            zprava = String.format("%s utrpěl poškození %s hp", jmeno, zraneni);
            if (zivot <= 0)
            {
                zivot = 0;
                zprava += " a zemřel";                    
            }

        } else
            zprava = String.format("%s odrazil útok", jmeno);
        nastavZpravu(zprava);
    }

    /**
     * Zjistí, zda je bojovník naživu
     * @return True, pokud je naživu, jinak false
     */
    public boolean nazivu()
    { 
        return (zivot > 0);
    }

    private void nastavZpravu(String zprava)
    {
        this.zprava = zprava;
    }

    public String vratPosledniZpravu()
    {
        return zprava;
    }

    /**
     * Vrátí grafickou reprezentaci života
     * @return Řetězec s grafickou reprezentací života
     */
    public String grafickyZivot()
    {
        String s = "[";
        int celkem = 20;
        double pocet = Math.round(((double)zivot / maxZivot) * celkem);
        if ((pocet == 0) && (nazivu()))
            pocet = 1;
        for (int i = 0; i < pocet; i++)
            s += "#";
        for (int i = 0; i < celkem - pocet; i++)
            s += " ";
        s += "]";
        return s;
    }

    /**
     * Vrací textovou reprezentaci bojovníka
     * @return Textová reprezentace bojovníka
     */
    @Override
    public String toString()
    {
        return jmeno;
    }
}
