package it.nextre.academy.pr001.PackA;

import it.nextre.academy.pr001.PackA.InnerPackA.InnerA;
import it.nextre.academy.pr001.Persona;

public class Az {
    public static void main(String[] args) {
        A aa = new A();
        Persona tmp = aa.getP();
        tmp.setNome("Gino");
        tmp.setCognome("Lo Spazzino");

        Object o = new Object();
        System.out.println(o.equals(new Object()));


        System.out.println(tmp.getNome().equals(aa.getP().getNome()));
        System.out.println(tmp.getNome());
        System.out.println(aa.getP().getNome());


        InnerA elef = new InnerA();
        elef.getInfo();

    }//end main
}//end class
