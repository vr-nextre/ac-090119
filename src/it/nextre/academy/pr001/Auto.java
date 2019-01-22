package it.nextre.academy.pr001;

public class Auto {

    private String targa;
    private String marca;
    private String modello;

    public Auto(){
        this.targa="undefined";
        this.modello="undefined";
        this.marca="undefined";

    }
    public Auto(String targa, String marca, String modello) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}//end class
