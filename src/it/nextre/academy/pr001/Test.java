package it.nextre.academy.pr001;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Test {


    enum Flags {
        TRUE, FALSE;

        Flags() {
            System.out.println("HELLO");
        }
    }


    static int a = 10000;
    static {
        --a;
    }


    {
        ++a;
    }

    public static void main(String[] args) {
//        System.out.println(a);
//        Flags f = Flags.TRUE;
//        Flags f1 = Flags.FALSE;

        //System.out.println(isPowerOf2(10));




        Duration d = Duration.ofMillis(16342621);
        System.out.printf("\npos: %-5s pilota: %-20s tempo: %-20s", "1", "Mariolino Rossi", "01:04:59:635");
        System.out.printf("\npos: %-5s pilota: %-20s tempo: %-20s", "123", "Mariolino Rossiii", "01:04:59:635");
        System.out.printf("\npos: %-5s pilota: %-20s tempo: %-20s", "12345", "Mariolino bu", Nuotatore.formattaDuration(d));





    }//end main





    public static boolean isPowerOf2(int x){
        System.out.println("passaggio... con x: " + x);
        if (x<0) x*=-1;
        if (x==0) return false;
        if (x==1) return true;
        if (x%2==0)
            return isPowerOf2(x/2);
        return false;
    }







}//end class




class TestClass{
    public static void main(String args[]){
        RuntimeException e = null;
        throw e;
    }
}
