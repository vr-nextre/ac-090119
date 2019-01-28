package it.nextre.academy.pr001.enumerations;

public class AppEnum {

    public static void main(String[] args) {

        Weather tempoOdierno = Weather.SOLE;
        System.out.println(tempoOdierno);
        System.out.println(tempoOdierno.getClass());
        System.out.println(tempoOdierno.name());
        System.out.println(tempoOdierno.toString());
        System.out.println(tempoOdierno.compareTo(Weather.NEVE));
        System.out.println(tempoOdierno.ordinal());
        System.out.println(tempoOdierno.PIOGGIA.ordinal());
        System.out.println(Weather.PIOGGIA.ordinal());
        System.out.println(Weather.SOLE.PIOGGIA.ordinal());

        Weather w = Weather.valueOf("NUVOLO");
        System.out.println(w.ordinal());
        System.out.println("WEATHER: ");
        for(Weather tempo : Weather.values()){
            System.out.println("\t" + tempo.ordinal() + " - " + tempo);
        }

        System.out.println(Weather.values()[4]);



        //------------
        System.out.println("---------------------------");

        Semi carta1 = Semi.PICCHE;
        Semi carta2 = Semi.CUORI;
        System.out.println(carta1.getColore());
        System.out.println(carta2.getColore());
        //carta2.setColore("Arcobaleno");
        System.out.println(carta1.getColore());
        System.out.println(carta2.getColore());

        System.out.println(carta1.equals(carta2));
        System.out.println(carta1.equals(Semi.valueOf("PICCHE")));


    }//end main

}//end class
