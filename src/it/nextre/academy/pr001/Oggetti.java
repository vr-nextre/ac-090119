package it.nextre.academy.pr001;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Oggetti {

    public static void main(String[] args) {

        Persona m = new Persona("Mario", "Rossi", "+3933652514", "m.rossi@gm.com", 40);

        Persona f = new Persona("Gina", "Verdi", "+3934714141025", "gina@test.it", 50);

        String cognome = PersonaUtils.getRandomSurname();

        Persona[] persone = new Persona[10];
        for (int i = 0; i < 10; i++) {
            persone[i] = new Persona(
                    PersonaUtils.getRandomName(),
                    PersonaUtils.getRandomSurname(),
                    PersonaUtils.getRandomTelefono(4),
                    "undefined",
                    PersonaUtils.getRandomNumero(10, 50)
            );
            persone[i].setEmail(PersonaUtils.generaMail(persone[i]));
        }

        //nmila operazioni sulle persone

        for (Persona tmp : persone) {
            System.out.println(tmp);
        }


        ExecutorService s = Executors.newFixedThreadPool(1);



/*
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8);
        list.replaceAll(i -> i + 1);
        list.set(0, 11); //add no
        System.out.println(list);
*/
/*
        IntStream stream = IntStream.rangeClosed(1, 4);
        int res = 3;
        //accumulatore rex diventa il primo parametro passato nella reduce, il risultato viene messo in accumulator per il giro dopo
        System.out.println(stream.reduce(res++, (i, j) -> {
            System.out.println("i: " + i + " , j: " + j);
            return i * j;
        }));
*/
/*
        System.out.println(null instanceof Object);
        String str1 = "";
        System.out.println(str1 instanceof Object);
*/

    }//end main


}//end class
