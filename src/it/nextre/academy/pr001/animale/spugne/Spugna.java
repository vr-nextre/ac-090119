package it.nextre.academy.pr001.animale.spugne;

import it.nextre.academy.pr001.animale.Animale;

public class Spugna extends Animale {

    private String colore;
    private boolean velenosa;


    public Spugna() {
        // super(); //super automatico dal compilatore
        System.out.println("Sono una spugna");
        //inizializzo tutti i parametri di default
        this.colore = "non definito";
        this.velenosa = false;
    }

    public Spugna(String colore) {
        this();
        this.colore = colore;
    }

    public Spugna(boolean velenosa) {
        this();
        this.velenosa = velenosa;
    }

    public Spugna(String colore, boolean velenosa) {
        this();
        this.colore = colore;
        this.velenosa = velenosa;
    }


    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isVelenosa() {
        return velenosa;
    }

    public void setVelenosa(boolean velenosa) {
        this.velenosa = velenosa;
    }

    @Override
    public String toString() {
        return "Spugna [" +
                "colore='" + colore + '\'' +
                ", velenosa=" + velenosa +
                "]" +
                "\n\t>" + super.toString();
    }


}//end class
