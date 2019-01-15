package it.nextre.academy.pr001.astratto;

public interface Generante {
    //per le interfacce la visibilità è public di standard
    //tutti i metodi sono dichiarati astratti
    //se un metodo dichiara un comportamento allora dovrà essere marcato come default

    String calcola();
    default String getVersion(){
        return "undefined";
    };

    //nelle interfacce tutte le variabili sono: public static final
    public static final int k=0;

}//end class
