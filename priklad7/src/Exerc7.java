import java.util.Scanner;

/**
 * Created by Davča on 11.4.2017.
 */
public class Exerc7 {
    public static void main(String[] args) {
        int cis1;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej prvni cislo");
        cis1 = sc.nextInt();
        System.out.println("Nyni bude cislo nasobeno vemi cisly az do 10.");
        for(i=1;i<11;i++) {
            System.out.println(cis1+ " x " +i+ " = " +(cis1*i));
        }
    }
}
