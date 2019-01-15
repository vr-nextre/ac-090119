package it.nextre.academy.pr001.PackA;

import it.nextre.academy.pr001.PackB.B;
import it.nextre.academy.pr001.Persona;

public class A {

    protected String nome="animale";

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

    private Persona p;


    public A() {
        System.out.println("Classe A");
        p = new Persona("Mario","Rossi","93457934857934","undefined", 33);
    }

    public Persona getP() {
        //return p; //male espongo aree di memoria private liberamente accessibili all'esterno
        //return new Persona(p.getNome(), p.getCognome(), p.getTelefono(), p.getEmail(), p.getEta());

            return p.clone();


    }


    public String getNome() {
        return nome;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "A{" +
                "nome='" + getNome() + '\'' +
                '}';
    }


    protected void getInfo(){
        System.out.println("Sono classe animale");
    }
}//end class
