import java.util.Scanner;

/**
 * Created by Davča on 11.4.2017.
 */
public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte první číslo");
        int cis1 = sc.nextInt();
        System.out.println("Zadejte druhe cislo");
        int cis2 = sc.nextInt();
        System.out.println("+-x/mod");
        System.out.println(cis1+ " + " +cis2+ " = " +(cis1+cis2));
        System.out.println(cis1+ " - " +cis2+ " = " +(cis1-cis2));
        System.out.println(cis1+ " x " +cis2+ " = " +(cis1*cis2));
        System.out.println(cis1+ " / " +cis2+ " = " +(cis1/cis2));
        System.out.println(cis1+ " mod " +cis2+ " = " +(cis1%cis2));
    }
}
