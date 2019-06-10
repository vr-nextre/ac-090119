package it.nextre.academy.pr001.fucile;

public class FucileCaricatoreVuoto extends Exception {
    public FucileCaricatoreVuoto() {
        super("ColpiEsauritiException");
    }
    public FucileCaricatoreVuoto(String msg) {
        super(msg);
    }
}//end class
