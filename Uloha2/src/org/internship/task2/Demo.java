package org.internship.task2;

/**
 * Created by Davča on 30.5.2017.
 */
public class Demo {
    public static void main(String[] args) {
        NightWatchman nw = new NightWatchman();
        Candle cd = new Candle();
        Candle cs = new Candle(5);
        Torch tr = new Torch(10,true);
        Torch trs = new Torch();
        System.out.println(nw.toString());
        nw.changeLight(cd);
        System.out.println(nw.toString());
        nw.changeLight(cs);
        System.out.println(nw.toString());
        nw.changeLight(tr);
        System.out.println(nw.toString());
        nw.changeLight(trs);
        System.out.println(nw.toString());
    }
}
