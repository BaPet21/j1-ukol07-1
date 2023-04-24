package cz.czechitas.ukol07.svatky;

import java.time.MonthDay;
import java.lang.String;

public class Svatek {
    //TODO implementovat properties pro "den" typu MonthDay a "jmeno" typu String.

    private MonthDay den;
    private String jmeno;



    public MonthDay getDen() {
        return den;
    }

    public void setDen(MonthDay den) {
        this.den = den;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
