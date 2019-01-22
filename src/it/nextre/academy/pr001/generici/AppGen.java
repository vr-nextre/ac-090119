package it.nextre.academy.pr001.generici;

import it.nextre.academy.pr001.Auto;
import it.nextre.academy.pr001.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 public final class AppGen {

    public static void main(String[] args) throws InterruptedException {
        ListaDinamicaGen<Auto> autos = new ListaDinamicaGen<>();
        ListaDinamicaGen<Persona> iscritti = new ListaDinamicaGen<>();
        ListaDinamicaGen<Double> temperature = new ListaDinamicaGen<>();

        autos.add(new Auto());

        System.out.println(autos);
        System.out.println(autos.get(0).getClass());

        System.out.println("#################");

        List<Auto> garage = new ArrayList<>();
        //garage.add(new Auto());
        garage.add(new Auto("aa001aa","FIAT","128"));
        garage.add(new Auto("ab002aa","FIAT","Panda"));
        garage.add(new Auto("ac003aa","FIAT","Tipo"));
        System.out.println(garage.size());

        /*System.out.println(garage);
        System.out.println(garage.get(0));
        System.out.println(garage.remove(0));
        System.out.println(garage.size());
        System.out.println(garage);
        */

        //iterator come strumento per ciclare su un insieme di dati
        /*
        for (int i = 0; i < garage.size(); i++) {
            System.out.println(garage.get(i));
        }//end for
        */

        Iterator<Auto> it = garage.iterator();
        garage.add(new Auto("ac004aa","FIAT","Tipo"));
        garage.add(new Auto("ac005aa","FIAT","Tipo"));
        System.out.println(garage.size());

        it = garage.iterator();
        while(it.hasNext() && false) {
            System.out.println(it.next());
            garage.add(new Auto("ac007aa","FIAT","Tipo"));
            garage.add(new Auto("ac008aa","FIAT","Tipo"));
            //System.out.println("Errore");
            it = garage.iterator();
            System.out.println(garage.size());
            //Thread.sleep(250);
        }

        /*
        * auto boxing e auto unboxing
        * */
        System.out.println("#############################");

        List<Object> numeri = new ArrayList<>();
        numeri.add((short)2);
        numeri.add(""+4);
        //numeri.add(5.5);
        System.out.println(numeri.get(0).getClass());
        System.out.println(numeri.get(0).toString());
        System.out.println( ( ((Short)numeri.get(0)) + 1) + "");
        numeri.add(   ((Short)numeri.get(0)).shortValue()   );
        numeri.add(   ((Short)numeri.get(0)).shortValue() * 1  );
        System.out.println(numeri.get(2).getClass());   //Short
        System.out.println(numeri.get(3).getClass());   //Integer

        System.out.println("##############################################");

        stampaLista(garage);
        stampaLista(numeri);


    }//end main



    public static void stampaLista (List<?> l){
        System.out.println(l.iterator());
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Elemento: " + i);
            System.out.println(l.get(i));
            System.out.println(l.get(i).getClass());
            System.out.println("------------------------");

        }//end for
    }


}//end class
