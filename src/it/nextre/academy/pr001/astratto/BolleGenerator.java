package it.nextre.academy.pr001.astratto;

public class BolleGenerator implements Generante{
    @Override
    public String calcola() {
        return "Ho generato 3 bolle.";
    }


    public void resetta() {

    }

    public void scoppiaBolle(){
        System.out.println("Pouf!");
    }
}//end class
