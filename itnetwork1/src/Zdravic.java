import java.util.Scanner;

/**
 * Created by Davča on 18.4.2017.
 */
/** Třída zdravič*/
public class Zdravic {
    String text;

    /**
     * Pozdraví uživatele
     * @param name Jméno uživatele
     * @return Text
     */
    public String pozdrav(String name) {
        return String.format(text + " " + name);
    }

}
