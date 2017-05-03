import java.util.Scanner;

/**
 * Created by Davča on 11.4.2017.
 */
public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej poloměr.");
        float p = sc.nextFloat();
        System.out.println("Poloměr: " +p);
        System.out.println("Obvod je: " +p*2*Math.PI);
        System.out.println("Obsah je: " +p*p*Math.PI);
    }
}
