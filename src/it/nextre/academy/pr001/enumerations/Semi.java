package it.nextre.academy.pr001.enumerations;

import it.nextre.academy.pr001.astratto.Generante;

import java.util.Random;

public enum Semi implements Generante {
    CUORI("rosso"){
        @Override
        String getColonrEng() {
            return "red";
        }
    },
    QUADRI("rosso"){
        @Override
        String getColonrEng() {
            return "red";
        }
    },
    FIORI("nero"){
        @Override
        String getColonrEng() {
            return "black";
        }
    },
    PICCHE("nero"){
        @Override
        String getColonrEng() {
            return "black";
        }

        @Override
        public String calcola() {
            return "2 di "+ super.name() ;
        }
    };
    public static int n_semmi=4;
    private String color;
    public static String mazzo="ITALIANO";
    //private Semi(){}
    private Semi(String color){
        this.color=color;
    }
    String getColore(){
        return this.color;
    }
    String getColonrEng(){
        return "undefined";
    }

    @Override
    public String calcola() {
        Random r = new Random();
        return ""+(r.nextInt(10)+1) +" di "+ super.name() ;
    }



    /*
    void setColore(String colore){
        this.color=colore;
    }
    */

}
