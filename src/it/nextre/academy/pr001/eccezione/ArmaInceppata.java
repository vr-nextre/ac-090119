package it.nextre.academy.pr001.eccezione;

public class ArmaInceppata extends RuntimeException {
    public ArmaInceppata(){
        super("ColpiEsauritiException");
    }

    public ArmaInceppata(String msg){
        super(msg);
    }
}//end class
