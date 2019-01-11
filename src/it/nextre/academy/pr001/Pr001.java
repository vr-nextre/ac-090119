package it.nextre.academy.pr001;

import java.io.File;

public class Pr001 {
    public static void main(String[] args) {

        String frase = "Che bella giornata è oggi!";

        int spazi=0;
        String tmp="";

        for(int i=0;i<frase.length();i++){
            char c = frase.charAt(i);
//        char[] cars = frase.toCharArray();
//        for (int i=0; i < cars.length; i++){
//            char c = cars[i];
            if (c==' '){
                spazi++;
                System.out.println("Spazio in pos: "+i);
            }else{
                tmp += c;
            }
        }
        System.out.println("Spazi trovati: " + spazi);
        System.out.println("La stringa senza spazi è lunga: " + tmp.length());
        System.out.println("Stringa senza spazi: " + tmp);


        int k = 3;
        k = k+1;
        System.out.println(k);
        k++;
        System.out.println(k);
        k += 3;  //k = k+3
        System.out.println(k);
        k *= 2; // k = k*2
        System.out.println(k);
        k=k++; //prima leggo k(16), poi incremento k(17), poi assegno quello che ho letto (16)
        System.out.println(k);
        k=++k; //prima incremento k(17), poi lo leggo k(17), poi assegno quello che ho letto k(17)
        System.out.println(k);

        k=0;
        System.out.println( "k=" + k + ", k++=" + k++ + ", --k=" + --k);


        k=0;
        for(;;){
            if (k==0){
                k++;
                System.out.println("salto");
                continue; //riparte dal controllo della condizione, facendo l'incremento
                //k++;  //Errore, codice irraggiungibile
            }
            System.out.println("dopo continue");
            break;  //rompe il ciclo e continua dalla prima istruzione fuori dal ciclo
            //k++; //Errore, codice irraggiungibile
        }

        // break e continue fanno riferimento al ciclo più vicino/interno



        ciclo1:while(true){
            System.out.println("START...");
            cicloInterno: for(int i=0; i<3;i++){
                System.out.println("i: "+i);
                //esempio di caso critico, esco da tutto
                if (i==1){
                    break ciclo1;
                }
            }
            System.out.println("...NEXT\n");
        }


        System.out.println("-----------------------------");



        //versione senza break e continue ma è più prolissa e confusionaria

        boolean errore = false;
        //errore = !errore; //inversione di un booleano
        ciclo1:while(!errore){
            System.out.println("START...");
            cicloInterno: for(int i=0; i<3;i++){
                if (!errore) {
                    System.out.println("i: " + i);
                    //esempio di caso critico, esco da tutto
                    if (i == 1) {
                        //break ciclo1;
                        errore = true;
                    }
                }
            }
            System.out.println("...NEXT\n");
        }

        //break e continue vanno usati con criterio e non bisogna abusarne






        System.out.println(invertiStringa("CiaonE"));


        System.out.println(seghettaFrase(frase));

        m(2,2,3);

        Short ss = 4;
        short s = 4;
        m(ss, ss);

        Long ll = 0l;
        long l = 0;



    }//end main


    public static String seghettaFrase(String frase) {
        return seghettaFrase(frase, false);
    }




    public static String seghettaFrase(String frase, boolean maiuscolo) {
        String tmp="";
        frase=frase.toLowerCase();
        boolean minuscolo=maiuscolo;
        for(int i=0;i<frase.length();i++){
            if(minuscolo){
                tmp+= (""+frase.charAt(i)).toUpperCase();
                minuscolo=!minuscolo;
            }else{
                tmp+= (""+frase.charAt(i)).toLowerCase();
                minuscolo=!minuscolo;
            }
        }
        return tmp;
    }


    public static String invertiStringa(String frase){
        String invertita="";
        for(int i=frase.length()-1; i>=0; i--)
            invertita += frase.charAt(i);
        return invertita;
    }









    //PROVE DI OVERLOAD

    public  static void m(int ... x){
        System.out.println("... i");
    }

    public static void m(int a, int b){
        System.out.println(" i i");
    }

    public static void m(int a, Integer b){
        System.out.println("i I");
    }
    /*
    public static void m(Integer a, int b){
        System.out.println("I i");
    }
    */
    public static void m(Integer a, Integer b){
        System.out.println("I I");
    }


    public static void m(long a, long b){
        System.out.println("l l");
    }

















}//end class




