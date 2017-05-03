import java.util.Scanner;

/**
 * Created by Davča on 11.4.2017.
 */
public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej první číslo");
        int cis1 = sc.nextInt();
        System.out.println("Zadej druhé číslo");
        int cis2 = sc.nextInt();
        System.out.println("Zadej třetí číslo");
        int cis3 = sc.nextInt();

        float prum = (cis1+cis2+cis3)/3;
        System.out.println("Průměr je: " +prum);
    }
}
