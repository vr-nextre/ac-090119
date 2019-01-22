package it.nextre.academy.pr001.generici;

import java.util.Arrays;

public class ListaDinamicaGen<T>{

    private T[] mem;
    //private int idx=0;

    public ListaDinamicaGen() {
        this.mem = (T[])new Object[0];
    }

    public void add(T x){
        //if (mem.length==idx){
            T[] swap = (T[])new Object[this.mem.length+1];
            for(int i = 0;i<this.mem.length;i++){
                swap[i]=this.mem[i];
            }
            swap[this.mem.length]=x;
        this.mem=swap;
        //}
    }

    public T get(int pos) {
        if(pos>=0 && pos<this.mem.length){
            return this.mem[pos];
        }
        throw new RuntimeException("Invalid position in ListaDinamica");
        //throw new RuntimeException("Invalid position");
        //return null;  //perchè torno un oggetto
    }

    public T[] getAll(){
        return this.mem;
    }

    public void remove(int pos){
        if(pos>=0 && pos<this.mem.length){
            T[] swap = (T[])new Object[this.mem.length+1];
            for (int i = 0; i < this.mem.length; i++) {
                if(i<pos){
                    swap[i]=this.mem[i];
                }else if (i==pos){
                    continue;
                }else{
                    swap[i-1]=this.mem[i];
                }
            }//end for
            this.mem=swap;
        }
    }

    public int size(){
        return this.mem.length;
    }

    @Override
    public String toString() {
        return "ListaDinamicaGen{" +
                "mem=" + Arrays.toString(mem) +
                '}';
    }
}//end class
