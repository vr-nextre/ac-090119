package it.nextre.academy.pr001.eccezione;

import it.nextre.academy.pr001.Persona;
import it.nextre.academy.pr001.es4_4.ListaDinamicaInt;
import it.nextre.academy.pr001.utility.Lettore;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Ecc {

    public static void main(String[] args) throws RuntimeException, ArrayIndexOutOfBoundsException {

        Set<Persona> p = new TreeSet<>();
        p.add(new Persona("Mario","Rossi","","",1));
        p.add(new Persona("Marione","Rossi","","",10));
        System.out.println(p);


        ListaDinamicaInt l1 = new ListaDinamicaInt();
        l1.add(55);
        //System.out.println(l1.get(3));
        try {
            System.out.println(l1.get(0));
        }
        /*
        catch(RuntimeException e){
            System.out.println("Runtime: " + e.getMessage());
        }
        */
        /*
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        */
        /*
        catch (Exception e1){
            System.out.println(e1.getMessage());
            //e1.printStackTrace();
        }
        */
        finally {
            System.out.println("FINALLY: Check 1 passato...continuo");
        }
        System.out.println("Dopo il blocco try-catch");


        int x = Lettore.leggiIntero("Inserisci il numero di auto");

        System.out.println("dopo lettura, x vale: "+ x);




    }//end main

}//end class
