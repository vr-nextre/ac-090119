package it.nextre.academy.pr001.lambda;

import java.util.Random;

public class DadiMagici {

    public static double dadoPari1to6(){
        Random r = new Random();
        return 2* (1+r.nextInt(3));
    }

    public static double dadoPari1to8(){
        Random r = new Random();
        return 2* (1+r.nextInt(4));
    }


}//end class
