/**
 * Created by Davča on 18.4.2017.
 */
public class Hlavni {
    public static void main(String[] args) {
        Zdravic zdrav = new Zdravic();
        zdrav.text = "Ahoj";
        System.out.println(zdrav.pozdrav("Karle"));
        zdrav.text = "Zdravíme";
        System.out.println(zdrav.pozdrav("Jano"));
    }
}
