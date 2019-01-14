package it.nextre.academy.pr001.PackA;

import it.nextre.academy.pr001.PackA.A;

public class InnerA extends A {
    void m(){
        A varA = new A();
        System.out.println(varA.pub);
        System.out.println(varA.prot);
    }

}//end class
