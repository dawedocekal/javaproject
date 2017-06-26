package org.internship.task4;

import java.net.NoRouteToHostException;
import java.net.UnknownHostException;

/**
 * Toto rozhrani reprezentuje tridu, ktera je schopna
 * navazat spojeni s nejakym pocitacem. Prostrednictvim
 * tohoto spojeni je pak mozne danemu pocitaci posilat
 * data.
 */
public interface Connector {

    /**
     * Navaze a vrati spojeni s pocitacem, jehoz adresa je zadana jako parametr.
     *
     * @param target adresa pocitace, s nimz ma byt spojeni navazano
     * @throws java.net.UnknownHostException pokud dana adresa pocitace nexistuje
     * @throws java.net.NoRouteToHostException pokud neni mozne s danym
     * pocitacem navazat spojeni z duvodu nedostatecnych smerovacich informaci
     * @return Navazane spojeni s danym pocitacem
     */
    Connection getConnection(String target) throws UnknownHostException,
            NoRouteToHostException;
}
