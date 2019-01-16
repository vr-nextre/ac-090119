package it.nextre.academy.pr001.es4_4;

import java.util.Arrays;

public class ListaDinamicaInt {

    private int[] mem;
    //private int idx=0;

    public ListaDinamicaInt() {
        this.mem = new int[0];
    }

    public void add(int x){
        //if (mem.length==idx){
            int[] swap = new int[this.mem.length+1];
            for(int i = 0;i<this.mem.length;i++){
                swap[i]=this.mem[i];
            }
            swap[this.mem.length]=x;
        this.mem=swap;
        //}
    }

    public Integer get(int pos){
        if(pos>=0 && pos<this.mem.length){
            return this.mem[pos];
        }
        //todo rivedere con eccezione
        //throw new RuntimeException("Invalid position");
        return null;  //perchè torno un oggetto
    }

    public int[] getAll(){
        return this.mem;
    }

    public void remove(int pos){
        if(pos>=0 && pos<this.mem.length){
            int[] swap = new int[this.mem.length-1];
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
        return "ListaDinamicaInt{" +
                "mem=" + Arrays.toString(mem) +
                '}';
    }
}//end class
