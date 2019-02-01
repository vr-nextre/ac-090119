package it.nextre.academy.pr001.lambda;

import java.util.Random;

public class Dado {

    public double lancia(Generante g){
        return g.genera();
    }

    public double dado12(){
        Random r = new Random();
        return 1+r.nextInt(12);
    }


}//end class
