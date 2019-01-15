package it.nextre.academy.pr001.animale;

public class Animale {

    public Animale(){
        //super();  // richiamo del costruttore di Object, comportamento di default del compilatore
        System.out.println("Sono un animale");
    }

    @Override
    public String toString() {
        return "Animale[]";
    }
}//end class
