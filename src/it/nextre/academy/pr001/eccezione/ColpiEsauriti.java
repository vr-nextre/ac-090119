package it.nextre.academy.pr001.eccezione;

public class ColpiEsauriti extends Exception{

    public ColpiEsauriti(){
        super("ColpiEsauritiException");
    }

    public ColpiEsauriti(String msg){
        super(msg);
    }

}//end class
