package it.nextre.academy.pr001.astratto;

import java.util.Random;

public class CreditCardGenerator extends Generatore implements Generante{

    String number;
    String cvv;
    String expiry; //replace with LocalDate in next time
    final private static int REVISIONE=1;

    @Override
    public String genera() {
        Random r = new Random();

        String tmp = "";
        for (int i = 0 ; i<16 ; i++)
            tmp+=r.nextInt(10);
        this.number=tmp;

        tmp="";
        for(int i=0;i<3;i++)
            tmp+=r.nextInt(10);
        this.cvv=tmp;


        int month =1+r.nextInt(12);
        this.expiry = ( month<10 ? "0"+month : month ) + "/" + (19+r.nextInt(5));



        return "{\"number\":\""+this.number+"\",\"expiry\":\""+this.expiry +"\",\"cvv\":\""+this.cvv+"\"}";
    }


    @Override
    public String getVersion() {
        return ""+REVISIONE;
    }

    @Override
    public String calcola() {
        return this.genera();
    }
}//end class
