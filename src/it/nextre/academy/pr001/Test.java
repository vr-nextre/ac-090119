package it.nextre.academy.pr001;

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

        System.out.println(isPowerOf2(10));

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
