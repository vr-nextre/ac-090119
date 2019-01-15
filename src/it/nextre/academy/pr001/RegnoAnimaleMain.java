package it.nextre.academy.pr001;

import it.nextre.academy.pr001.animale.Animale;
import it.nextre.academy.pr001.animale.mammiferi.Mammifero;
import it.nextre.academy.pr001.animale.spugne.Spugna;
import it.nextre.academy.pr001.animale.spugne.SpugnaDolce;
import it.nextre.academy.pr001.animale.spugne.SpugnaMarina;
import it.nextre.academy.pr001.astratto.CreditCardGenerator;
import it.nextre.academy.pr001.astratto.Generante;
import it.nextre.academy.pr001.astratto.Generatore;

import java.util.ArrayList;

public class RegnoAnimaleMain {
    public static void main(String[] args) throws InterruptedException {


        Spugna spongebob = new SpugnaMarina("Giallo Limone",false);
        //Spugna spongebob = new SpugnaDolce();

        System.out.println(spongebob instanceof Object);
        System.out.println(spongebob instanceof Animale);
        System.out.println(spongebob instanceof Spugna);
        System.out.println(spongebob instanceof SpugnaMarina);
        System.out.println(spongebob instanceof SpugnaDolce);
        //System.out.println(spongebob instanceof Mammifero); //errore di compilazione perchè sono rami di classi differenti


        // il modo corretto per accedere a un figlio con certezza
        // è di fare il cast controllato con instanceof
        if(spongebob instanceof SpugnaMarina)
            System.out.println(((SpugnaMarina)spongebob).getTipoAcqua());


        //System.out.println(((SpugnaMarina)spongebob).getTipoAcqua()); //cattiva pratica farlo senza il contollo

        System.out.println(spongebob.getColore());
        System.out.println(spongebob.isVelenosa());


        System.out.println(spongebob);

        //DEBUG INTELLIJ
        // F8 -> prossima istruzione del metodo corrente
        // F7 -> entra nel metodo corrente e prosegue l'esecuzione
        // Maiusc+F8 esegue tutto il metodo e salta fuori al chiamante


        MicrofonoSingleton mic = MicrofonoSingleton.getInstance();
        mic.getInfo();

        Thread.sleep(3000);

        MicrofonoSingleton mic2 = MicrofonoSingleton.getInstance();
        mic2.getInfo();
        // MicrofonoSingleton.destroy(); // mai annullare la referenza din un oggetto singleton

        MicrofonoSingleton mic3 = MicrofonoSingleton.getInstance();
        mic3.getInfo();


        Generatore g = new CreditCardGenerator();
        System.out.println(g.genera());

        int h = Generante.k;

        Generante ga = new CreditCardGenerator();
        ((Generatore) ga).genera();
        System.out.println( ga instanceof Generatore);


    }//end main
}//end class
