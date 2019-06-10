package it.nextre.academy.pr001.fucile;

import java.util.Random;

public class Fucile {

    private static Random r = new Random();

    private int colpi;
    private int caricatore;

    public Fucile(int caricatore,int colpi){
        this.colpi=colpi;
        this.caricatore=caricatore;
    }

    public int getColpi() {
        return colpi;
    }

    public void setColpi(int colpi) {
        this.colpi = colpi;
    }

    public int getCaricatore() {
        return caricatore;
    }

    public void setCaricatore(int caricatore) {
        this.caricatore = caricatore;
    }

    @Override
    public String toString() {
        return "Fucile{" +
                "colpi=" + colpi +
                ", caricatore=" + caricatore +
                '}';
    }


    /**
     *
     * @return boolean colpo_a_segno
     */
    public boolean spara() throws FucileCaricatoreVuoto{
        //provare a sparare, ma se non ho colpi devo avvisare per essere ricaraicato (se possibile)
        if(colpi<=0){
            throw new FucileCaricatoreVuoto("We ricaricare prego!");
        }

        //calcolo probabilità di incepparsi
        if (r.nextInt(100)<FireShotConfig.PROBABILITA_INCEPPO){
            //se si inceppa, sollevo eccezione
            colpi--;
            throw new FucileInceppatoException("Fucile bloccato");
        }


        //altrimenti calcolo la probabilità di aver centrato il bersaglio e ritorno il risultato
        colpi--;
        return r.nextInt(100)<FireShotConfig.PROBABILITA_COLPO_A_SEGNO ? true : false;
    }


    public void ricarica(){
        this.colpi=caricatore;
    }



}//end class
