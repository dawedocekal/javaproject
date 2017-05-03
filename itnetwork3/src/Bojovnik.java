/**
 * Created by Davča on 24.4.2017.
 */
public class Bojovnik {
    private String jmeno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kostka kostka;
    private String zprava;

    public Bojovnik(String jmeno,int zivot, int utok,int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }
    public String toString(){
        return jmeno;
    }
    public boolean nazivu(){
            return (zivot > 0);
    }
    public String grafickyZivot(){
        String s = "[";
        maxZivot = 20;
        int celkem = 20;
        double pocet = Math.round((zivot / maxZivot) * celkem);
        if ((pocet == 0) && (nazivu())){
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s += "#";
        }
        for (int i = 0; i < celkem - pocet; i++) {
            s += " ";
        }
        s += "]";
        return s;
    }
    public void branSe(int uder){
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0) {
            zivot -= zraneni;
            zprava = String.format(jmeno+" utrpěl poškození "+zraneni+" hp");
            if (zivot <= 0) {
                zivot = 0;
                zprava += " a zemřel";
            }
        }else zprava = String.format(jmeno+" odrazil útok");
        nastavZpravu(zprava);
    }
    public void utoc(Bojovnik souper) {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format(jmeno+" útočí s úderem za "+uder+" hp"));
        souper.branSe(uder);
    }
    private void nastavZpravu(String zprava) {
        this.zprava = zprava;
    }
    public String vratPosledniZpravu() {
        return zprava;
    }

}
