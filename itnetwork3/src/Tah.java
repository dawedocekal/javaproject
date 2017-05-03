/**
 * Created by Davča on 19.4.2017.
 */
public class Tah {
    public static void main(String[] args) {
        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("David",80,80,80,kostka);

        System.out.println("Zivoty: " + bojovnik.grafickyZivot());

        Bojovnik souper = new Bojovnik("Shadow", 60, 18, 15, kostka);
        souper.utoc(bojovnik);
        System.out.println(souper.vratPosledniZpravu());
        System.out.println(bojovnik.vratPosledniZpravu());

        System.out.printf("Život: "+bojovnik.grafickyZivot()+"" +
                "\n" );
    }

}
