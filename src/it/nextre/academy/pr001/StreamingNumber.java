package it.nextre.academy.pr001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamingNumber {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(3,5,7,3,6,8,23,2,8,4));
        //Predicate<Integer> pari = (n)->n%2==0;
        Predicate<Integer> pari = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==0;
            }
        };
        nums
                .stream()
                .filter((n)->n%2==0)
                .forEach(n->System.out.println(n));


    }//end main
}//end class
