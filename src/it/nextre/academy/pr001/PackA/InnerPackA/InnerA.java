package it.nextre.academy.pr001.PackA.InnerPackA;

import it.nextre.academy.pr001.PackA.A;

public class InnerA extends A {

    public InnerA(){
        nome = "Elefante";
    }

    void m(){
        A varA = new A();
        System.out.println(varA.pub);
        //System.out.println(varA.prot);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void getInfo() {
        super.getInfo();
    }
}//end class
