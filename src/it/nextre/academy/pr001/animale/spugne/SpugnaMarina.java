package it.nextre.academy.pr001.animale.spugne;

public class SpugnaMarina extends Spugna {

    private String tipoAcqua;

    public SpugnaMarina(){
        this.tipoAcqua = "salata";
    }

    public SpugnaMarina(String colore, boolean velenosa){
        super(colore, velenosa);
        this.tipoAcqua = "salata";
    }

    public SpugnaMarina(String colore, boolean velenosa, String tipoAcqua){
        super(colore, velenosa);
        this.tipoAcqua = tipoAcqua;
    }

    public String getTipoAcqua() {
        return tipoAcqua;
    }

    public void setTipoAcqua(String tipoAcqua) {
        this.tipoAcqua = tipoAcqua;
    }


    @Override
    public String toString() {
        return "SpugnaMarina [tipoAcqua='"+tipoAcqua+"']"+
                "\n\t>"+super.toString();
    }
}//end class
