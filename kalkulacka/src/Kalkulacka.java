import java.util.Scanner;

/**
 * Created by Davča on 3.5.2017.
 */
public class Kalkulacka {
    public static void main(String[] args) {
        Operace operace = new Operace();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej operaci\n1-scitani\n2-odcitani\n3-nasobeni\n4-deleni");
        int num1 = scanner.nextInt();
        if ((num1 > 4) || (num1 < 1)) {
            System.out.println("Spatne cislo!");
        } else
            System.out.println("Dejte 2 cisla");
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        switch (num1) {
            case 1:
                operace.scitani(num2,num3);
                break;
            case 2:
                operace.odcitani(num2,num3);
                break;
            case 3:
                operace.nasobeni(num2,num3);;
                break;
            case 4:
                operace.deleni(num2,num3);;
                break;
        }
    }
}
