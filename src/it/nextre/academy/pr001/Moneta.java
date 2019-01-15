package it.nextre.academy.pr001;

import java.util.Random;
import java.util.Scanner;

public class Moneta {

    private static boolean DEBUG = false;

    public static void main(String[] args) {


        if(args.length>0 && args[0].equalsIgnoreCase("-d"))
            DEBUG=true;


        Random r = new Random();
        int giocate = 0;
        int vincite = 0;
        boolean gioca=true;

        //creo partite
        do{
            //aggiorno il numero di giocate
            giocate++;

            //lancio la moneta
            String faccia = r.nextBoolean() ? "testa" : "croce";


            if(DEBUG){
                System.out.println("----------------------------------");
                System.out.println("Moneta lanciata: " + faccia);
                System.out.println("giocate: " + giocate);
                System.out.println("vittorie: " + vincite);
                System.out.println("----------------------------------");
            }

            boolean errore_di_lettura = true;
            String scelta="";
            do {
                //Scanner s = new Scanner(System.in);
                //System.out.println("Testa o Croce (T/C)");
                scelta = leggiStringa("Testa o Croce (T/C)");
                scelta = scelta.toUpperCase();
                if (scelta.equals("T") || scelta.equals("C")) {
                    //ok
                    scelta = scelta.equals("T") ? "testa" : "croce";
                    errore_di_lettura=false;
                } else {
                    System.out.println("parola non valida");
                }
            }while(errore_di_lettura);

            //son sicuro che scelta sia o testa o croce

            if (faccia.equals(scelta)) {
                vincite++;
                System.out.println("Bravo hai vinto");
            }else{
                System.out.println("Peccato hai perso");
                System.out.println("La moneta vale: " + faccia);
            }
            //chiedo se vuole continuare


            scelta = leggiSN("Vuoi giocare ancora? (S/N)");
            gioca = scelta.equals("S") ? true : false;
        }while(gioca);

        //devo stampare le statistiche

        System.out.println("Partite giocate: " + giocate);
        System.out.println("Vittorie: " + vincite);
        System.out.println("Sconfitte: " + (giocate - vincite) );
        //printf
        //-5  5 cifre a partire da sinistra, 2 cifre decimali
        //5  5 cifre a partire da destra, 2 cifre decimali
        System.out.printf("Tasso di vittoria: %-6.2f", ( 100.0*vincite/giocate ) );
        System.out.print("%");
    }//end main




    public static String leggiStringa(String output){
        if (output!=null && output.length()>0){
            System.out.println(output);
        }
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        tmp = tmp.trim();
        if (tmp.length()>0){
            return tmp;
        }else{
            System.out.println("Input non valido");
            return leggiStringa(output);
        }
    }


    public static String leggiSN(String output){
        String scelta="";
        scelta = leggiStringa(output);
        scelta = scelta.toUpperCase();
        if (scelta.equals("S") || scelta.equals("N")) {
            //ok
            return scelta;
        }
        System.out.println("risposta non valida (S/N)");
        return leggiSN(output);

    }



}//end class
