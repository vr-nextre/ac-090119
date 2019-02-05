package it.nextre.academy.pr001.lingue;

import java.util.Locale;
import java.util.ResourceBundle;

public class LingueMain {

    public static void main(String[] args) {


        //leggo la lcoale e stampo il titolo nella lingua corretta
        Locale defaultLang = null;
        //System.getProperties().forEach((a,b)->System.out.println(a+":"+b));
        //System.out.println(System.getProperty("user.language"));

        defaultLang = new Locale(System.getProperty("user.language"),System.getProperty("user.country"));
        System.out.println(defaultLang);
        //stessa cosa di sopra ma più veloce
        defaultLang = Locale.getDefault();
        System.out.println(defaultLang);

        System.out.println("Cambio la lingua di default");
        Locale.setDefault(Locale.CHINA);
        defaultLang = Locale.getDefault();
        System.out.println(defaultLang);



        Locale loc = Locale.ITALY;
        //loc = Locale.FRANCE;
        loc = Locale.UK;
        System.out.println("Voglio usare la lingua: " + loc);

        ResourceBundle rs = ResourceBundle.getBundle("lang/testi",loc);

        System.out.println(
                rs.getString("home.benvenuto")

        );



        System.out.println(rs.getString("home.coupon"));


    }//end main

}//end class
