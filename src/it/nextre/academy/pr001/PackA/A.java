package it.nextre.academy.pr001.PackA;

import it.nextre.academy.pr001.PackB.B;

public class A {

    // https://i.stack.imgur.com/ENgP4.jpg
    public int pub = 100;
    protected int prot = 50;
    int def = 25;
    private int pvt = 0;

    // statiche
    static public int s_pub = 100;
    static protected int s_prot = 50;
    static int s_def = 25;
    static private int s_pvt = 0;

    public A() {
        System.out.println("Classe A");
    }
}//end class
