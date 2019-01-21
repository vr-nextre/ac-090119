package it.nextre.academy.pr001;

public class TargaUtils {

    private static char l1='a';
    private static char l2='a';
    private static int n=0;

    public static void main(String[] args) throws InterruptedException {



        for (int i = 0; i < 1005; i++) {
            Thread.sleep(80);
            System.out.println(getTarga());
        }//end for


    }//end main

    public static String getTarga(){
        for(;l1<='z';l1++){
            for (;l2<='z';l2++) {
                for (; n <= 999; ) {
                    String tmp = (l1 + formattaNumero(n)+l2);
                    n++;
                    return tmp;
                }
                n = 0;
            }
            l2='a';
        }
        return null;
    }

    private static String formattaNumero(int n) {
        if (n<100){
            if (n<10){
                return "00"+n;
            }else{
                return "0"+n;
            }

        }
        return ""+n;
    }

}//end class
