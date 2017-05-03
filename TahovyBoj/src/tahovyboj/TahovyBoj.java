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

public class TahovyBoj {

    public static void main(String[] args) {
        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);

        System.out.printf("Život: %s\n", bojovnik.grafickyZivot()); // test GrafickyZivot(); 

        // útok na našeho bojovníka
        Bojovnik souper = new Bojovnik("Shadow", 60, 18, 15, kostka);
        souper.utoc(bojovnik);
        System.out.println(souper.vratPosledniZpravu());
        System.out.println(bojovnik.vratPosledniZpravu());

        System.out.printf("Život: %s\n", bojovnik.grafickyZivot()); // test GrafickyZivot();
    }
}
