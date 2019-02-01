package it.nextre.academy.pr001.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GiocoMain {

    public static void main(String[] args) {
        Random r = new Random();
        Generante dado6facce = new Generante() {
            @Override
            public double genera() {
                Random r = new Random();
                return 1+r.nextInt(6);
            }
        };

        Generante dadoTruccato = ()->4;

        Dado d1= new Dado();
        System.out.println(d1.lancia(dado6facce));
        System.out.println(d1.lancia( ()-> 1+r.nextInt(6) ));
        System.out.println(d1.lancia(dadoTruccato));
        System.out.println(d1.lancia(DadiMagici::dadoPari1to6));
        System.out.println(d1.lancia(d1::dado12));

        List<String> players = new ArrayList<>();
        players.add("Federico");
        players.add("Ira");
        players.add("Fantozzi");


        int conteggio=0;
        Box cont = new Box();
        long playerF = 0;
        players.stream()
                .filter((name)->true)
                .filter( item->item.toLowerCase().startsWith("f") )
                //.peek((s)->{conteggio++;return;})
                .peek((item)->cont.incrementa(1))
                .forEach((item)->cont.incrementa(1));
        System.out.println(cont.getValue());


        System.out.println("############################");
        System.out.println("############################");
        System.out.println("############################");


        Box cont2 = new Box();
        IntStream nums = IntStream.generate(r::nextInt);
        IntStream nums1to5 = (IntStream.of(1,2,3,4,5));

        nums
            //.peek(System.out::println)
                .peek(val->cont2.incrementa(1))
                .filter(item->item>5&&item<30)
                //.findFirst()
                .mapToObj(item->" pallina numero: "+item)
                .limit(2)
                .forEach(item->{
                    System.out.println("Torvato il numero: "+item+" dopo "+cont2.getValue()+" tentativi");
                });
            //.forEach(System.out::println)
        ;













    }//end main

}//end class


class Box{
    int value=0;
    public void incrementa(int x){
        value+=x;
    }
    public int getValue(){
        return value;
    }
}