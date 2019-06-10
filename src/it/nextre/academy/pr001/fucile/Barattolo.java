package it.nextre.academy.pr001.fucile;

public class Barattolo {

    private int punteggio;
    private boolean intatto; //non serve perchè rimuovo già dai premi
    public Barattolo(int punteggio){
        this.punteggio=punteggio;
        this.intatto=true;
    }

    public int getPunteggio() {
        return punteggio;
    }
//
//    public void setPunteggio(int punteggio) {
//        this.punteggio = punteggio;
//    }

    public boolean isIntatto() {
        return intatto;
    }

    public void setIntatto(boolean intatto) {
        this.intatto = intatto;
    }

    @Override
    public String toString() {
        return "Barattolo{" +
                "punteggio=" + punteggio +
                ", intatto=" + intatto +
                '}';
    }
}//end class
