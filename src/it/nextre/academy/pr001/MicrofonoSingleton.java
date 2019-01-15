package it.nextre.academy.pr001;

import java.time.LocalDateTime;
import java.util.Random;

public class MicrofonoSingleton {

    //condividere una risorsa senza creare più copie

    private int channel;    //6-36

    private static MicrofonoSingleton instance;
    private MicrofonoSingleton(){
        Random r = new Random();
        this.channel= 6+r.nextInt(31);
        System.out.println("Microfono creato " + LocalDateTime.now());
    }

    public static synchronized MicrofonoSingleton getInstance(){
        if(instance==null){
            instance = new MicrofonoSingleton();
        }
        return instance;
    }


    public void getInfo(){
        System.out.println("Microfono impostato sul canale "+this.channel);
    }

    //extra anti-pattern, errore avere un destroy nel singleton
    public static void destroy(){
        instance=null;
    }

}//end class
