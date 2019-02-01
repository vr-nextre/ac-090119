package it.nextre.academy.pr001.lambda;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlipCoin {

    public static void main(String[] args) {

        Random r = new Random();
        Supplier<Boolean> lancio = (r::nextBoolean);

        Stream<Boolean> lanci = Stream.generate(lancio);
        //Map<Boolean, Long> events =
                lanci
                        //.parallel()
                        .limit(6000)
                        .collect(
                                //Collectors.partitioningBy(item->item)
                                Collectors.partitioningBy(item->item, Collectors.counting())
                                //Collectors.groupingBy(item->item,Collectors.counting())
                        ).forEach((k,v)->System.out.println(k+"="+v));
        //System.out.println(events);


    }//end main

}//end class
