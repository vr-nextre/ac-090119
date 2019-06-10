package it.nextre.academy.pr001.fucile;

import java.util.Random;

public class FireShotMain {

    static Random r= new Random();

    private int n_caricatori=0;
    private ListaDinamicaBarattolo premi, premiVinti;
    private Fucile f;

    private FireShotMain(){}

    //scrivo le regole del gioco
    public static void main(String[] args) {

    FireShotMain partita = new FireShotMain();


        try {
            partita.gioca();
        } catch (CaricatoriFinitiException e) {
            System.out.println(e.getMessage());
            System.out.println("PARTITA TERMINATA...calcolo del punteggio");
        }

        partita.calcolaPunteggio();


    }//end main

    private void calcolaPunteggio() {
        System.out.println("Sommo i punti");
        System.out.println(premiVinti);
        int tot = 0;
        while(this.premiVinti.size()>0){
            tot += this.premi.get(0).getPunteggio();
            this.premiVinti.remove(0);
        }
        System.out.println("HAI TOTALIZZATO "+tot+" PUNTI");
    }


    private void init(){
        //inizializzo tutto il necessario per la partita
        this.n_caricatori = FireShotConfig.N_CARICATORI_FUCILE;
        //creo i premi
        this.premi = new ListaDinamicaBarattolo();
        this.premiVinti = new ListaDinamicaBarattolo();
        for (int i = 0; i<FireShotConfig.CARICATORE_FUCILE*FireShotConfig.N_CARICATORI_FUCILE; i++){
            premi.add(new Barattolo(5*(1+r.nextInt(5))));
        }

        f = new Fucile(FireShotConfig.CARICATORE_FUCILE,FireShotConfig.CARICATORE_FUCILE);
    }

    private void gioca() throws CaricatoriFinitiException{
        init();
        //gioco fintantochè ho caricatori con colpi
        while(this.n_caricatori>0){
            try {
                if(f.spara()){
                    //colpo a segno prendo un premio a caso tra i possibili
                    //visto che i premi sono già casuali nella lista, prendo sempre quello in prima posizione
                    System.out.println("Colpo a segno");
                    premi.get(0).setIntatto(false);
                    premiVinti.add(premi.get(0));
                    premi.remove(0);
                }else{
                    System.out.println("Colpo a vuoto, OUT");
                }
            } catch (FucileCaricatoreVuoto e) {
                System.out.println(e.getMessage());
                if(n_caricatori>1){
                    System.out.println("RICARICO IL FUCILE");
                    f.ricarica();
                    n_caricatori--;
                }else{
                    throw new CaricatoriFinitiException("Caricatori esauriti");
                }
            } catch (FucileInceppatoException e){
                System.out.println(e.getMessage());
            }
        }


    }


}//end class
