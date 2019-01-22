package it.nextre.academy.pr001.utility;

import java.util.Scanner;

import static it.nextre.academy.pr001.Moneta.leggiStringa;

public class Lettore {

    static int call = 0;

    public static int leggiIntero(String output){
        call++;
        //String tmp = "a";
        String tmp = leggiStringa(output);
        try{
            return Integer.parseInt(tmp);
        }catch (Exception e){
            System.err.println("Il paramentro non rappresenta un numero valido, riprova --> call: "+call);
            return leggiIntero(output);
        }

    }


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


}//end class
