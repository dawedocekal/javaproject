/**
 * Created by Davča on 11.4.2017.
 */
public class Exerc15 {
    public static void main(String[] args) {
        int a,b,temp;
        a = 10;
        b = 5;
        System.out.println("Před výměnou: " +a+ "," +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("po výměně: " +a+ "," +b);
    }
}
