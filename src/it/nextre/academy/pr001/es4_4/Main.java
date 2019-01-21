package it.nextre.academy.pr001.es4_4;

public class Main {

    public static void main(String[] args) {


        ListaDinamicaInt l = new ListaDinamicaInt();

        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        System.out.println(l);
        //l.remove(5);
        while(l.size()>0){
            l.remove(0);
            System.out.println(l);
        }







    }//end main

}//end class
