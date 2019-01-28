package it.nextre.academy.pr001.astratto;

import java.util.Random;

public class TestAnonima {

    public static void main(String[] args) {
        Generante gbolle = new BolleGenerator();
        System.out.println(gbolle.calcola());
        System.out.println(gbolle.getClass());

        Generante bolleRandom = new Generante(){
            @Override
            public String calcola(){
                Random r = new Random();
                return "faccio... "+r.nextInt(10)+ " bolle";
            }


            public void resetta() {

            }

            public void saluta(){}
            public void saluta1(){}
            public void saluta2(){}
            public void saluta3(){}
            public void saluta4(){}
        };

        System.out.println(bolleRandom.calcola());
        System.out.println(bolleRandom.getClass());





        Generante genBollePari = ()->{
                Random r = new Random();
                int bolle = r.nextInt(10);
                return "faccio... "+(bolle%2==0 ? bolle : bolle+1 )+ " bolle";
        };

        System.out.println(genBollePari.calcola());
        System.out.println(genBollePari.getClass());



        Generante bolleGrosse=()->"Bolle grosse create";
        System.out.println(bolleGrosse.calcola());
        System.out.println(bolleGrosse.getClass());






    }//end main

}//end class
