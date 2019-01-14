package it.nextre.academy.pr001.PackB;

import  it.nextre.academy.pr001.PackA.A;

public class B extends A {



    int k = this.prot;
    int y = A.s_prot;

    public B() {
        System.out.println("Classe B");
    }

    void m(){
        A aa = new A();

        B bb = new B();
        System.out.println(bb.prot);

    }



}//end class
