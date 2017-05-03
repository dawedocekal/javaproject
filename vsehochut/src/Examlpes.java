import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Davča on 12.4.2017.
 */
public class Examlpes {

    public static void main(String[] args) {
     vetveni();
    }
    private static void pole() {
        int[] pole  = {100,200,300,400,500,600,700,800,900,1000};
        for (int i = 0; i<10; i++) System.out.println("Na indexu " + i + " je číslo " + pole[i]);
   }
     private static void podminkaif() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Zadej číslo a já ti řeknu jestli je větší než 10.");
         int cis = Integer.parseInt(sc.nextLine());
         if (10<cis) System.out.println("Ano, je větší.");
         else System.out.println("Ne, není větší.");
   }
      private static void vetveni() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte číslo.");
        int cis2 = sc.nextInt();
           switch(cis2) {
              case 1:
                  System.out.println("Zadali jste číslo 1.");
                  break;
              case 2:
                  System.out.println("Zadali jste číslo 2.");
                  break;
              case 3:
                  System.out.println("Zadali jste číslo 3.");
                  break;
              case 4:
                  System.out.println("Zadali jste číslo 4.");
                  break;
              case 5:
                  System.out.println("Zadali jste číslo 5.");
                  break;
              default:
                  System.out.println("Špatná volba, vyber číslo od 1 do 5.");
                  break;
          }

          Ex1 ex = new Ex1();
           ex.toString();
      }
      private static void podminkadowhile() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("1. slovo");
        String str1 = sc3.nextLine();
        System.out.println("2. slovo");
        String str2 = sc3.nextLine();
        do {
            System.out.println(str1+str2);
        } while (str1==str2);
      }
      private static void podminkafor() {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Zadej kolik chceš průchodů cyklem.");
        int cisilko = sc4.nextInt();
        int i;
        for (i=1;i<cisilko+1;i++) {
            System.out.println(i+ ". průchod cyklem.");
        }
      }
}
