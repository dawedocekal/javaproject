import java.util.Random;

/**
 * Created by Davča on 19.4.2017.
 */
public class Kostka {
    private Random random;
    private int pocetstran;

    public Kostka(int pocetstran) {
        this.pocetstran = pocetstran;
        random = new Random();
    }

    public int vratPocetSten() {
        return pocetstran;
    }

    public Kostka() {
        this.pocetstran = 6;
        random = new Random();
    }

    public int hod() {
        return random.nextInt(pocetstran) + 1;
    }

    public String toString() {

        return "Kostka s " + pocetstran + " stěnami";
    }
}
