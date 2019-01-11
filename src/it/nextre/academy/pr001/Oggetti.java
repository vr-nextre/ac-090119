package it.nextre.academy.pr001;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Oggetti{

    public static void main(String[] args) {

        Persona m = new Persona("Mario","Rossi","+3933652514","m.rossi@gm.com",40);

        Persona f = new Persona("Gina","Verdi","+3934714141025","gina@test.it",50);

       String cognome = PersonaUtils.getRandomSurname();

       Persona[] persone = new Persona[10];
       for (int i=0; i<10;i++){
           persone[i] = new Persona(
                   PersonaUtils.getRandomName(),
                   PersonaUtils.getRandomSurname(),
                   PersonaUtils.getRandomTelefono(4),
                   "undefined",
                   PersonaUtils.getRandomNumero(10,50)
           );
           persone[i].setEmail(PersonaUtils.generaMail(persone[i]));
       }

       //nmila operazioni sulle persone

       for(Persona tmp : persone){
           System.out.println(tmp);
       }





    }//end main


}//end class

