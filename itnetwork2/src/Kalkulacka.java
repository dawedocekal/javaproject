import java.util.Scanner;

/**
 * Created by Davča on 18.4.2017.
 */
public class Kalkulacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte operaci, která se provede.");
        System.out.println("1-scítání \n2-odčítání\n3-násobení\n4-dělení");
        int num1 = sc.nextInt();
        System.out.println("Zadej 2 čísla.");
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if ((num1 != 0) && (num1 < 5)) {
            switch (num1) {
                case 1:
                    scitani(num2, num3);
                    break;
                case 2:
                    odcitani(num2, num3);
                    break;
                case 3:
                    nasobeni(num2, num3);
                    break;
                case 4:
                    deleni(num2, num3);
                    break;
            }
        } else System.out.println("Zadej správné číslo");
    }

    public static void scitani(int num2, int num3) {

        System.out.println(num2 + "+" + num3 + "=" + (num2 + num3));

    }

    public static void odcitani(int num2, int num3) {
        System.out.println(num2 + "-" + num3 + "=" + (num2 - num3));
    }

    public static void nasobeni(int num2, int num3) {
        System.out.println(num2 + "*" + num3 + "=" + (num2 * num3));
    }

    public static void deleni(int num2, int num3) {
        System.out.println(num2 + "/" + num3 + "=" + (num2 / num3));
    }
}
