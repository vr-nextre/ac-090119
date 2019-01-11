package it.nextre.academy.pr001;

import java.util.Scanner;

public class Scelta {

    public static void main(String[] args) {
        /*
        System.out.println(3/2*2);
        System.out.println(3/2*2.0);
        System.out.println(3/2.0*2);
        System.out.println(3.0/2*2);
        */

        short x=100;
        short y=400;

        y=(short)(Math.random()*10);

        //byte, short, int, char, enum, String(java 7) e relativi wrapper
        switch(x){
            /*
            case y:{ //non posso usare variabili, casi sempre ben determinati, costanti!
                System.out.println("Info"); break;
            }
            */
            default:{
                System.out.println("Loading..."); break;
            }
            case 200:{
                System.out.println("OK"); break;
            }
            case 300:{
                System.out.println("Redirect"); break;
            }
            case 415:
            case 404:
            case 400:{
                System.out.println("Errore Client"); break;
            }
            case 500:{
                System.out.println("Errore Server"); break;
            }
        }





        int[] arr0 = new int[3];
        int[] arr1 = new int[]{0,5,8};
        int[] arr2 = {0,5,8};

        String[] sts = {"a","b","c"};
        sts[2].toUpperCase();

        //Operatore ternario ? : ritorna sempre un valore

        sts[2] = arr0[1]>0 ? "Bella" : "Blaaa";
        //arr0[1]>0 ? sts[2] = "Bella" : sts[2] = "Blaaa";

        int k =0;
        sts[2] = ""+ ( k<0 ? k<-13 ? 5 : k>2 ? 3 : 4 : 56 );







    }//end main
}//end class
