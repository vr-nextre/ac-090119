package it.nextre.academy.pr001;

import java.util.Random;

public class PersonaUtils {
    static Random r = new Random();
    static String[] names = {"Mario","Gino","Antonio","Paolo","Luigi","Luca","Marco"};
    static String[] surnames = {"Rossi","Verdi","Neri","Verga","Mazza","Lentini","Marconi"};
    static String[] hobbies = {"golf","spaccio","gaming"};

    private PersonaUtils(){};

    public static String getRandomName() {
        return names[r.nextInt(names.length)];
    }

    public static String getRandomSurname() {
        return surnames[r.nextInt(surnames.length)];
    }

    public static int getRandomNumero(int minIn, int maxOut){
        return minIn+ r.nextInt(maxOut-minIn);
    }

    public static String getRandomTelefono(int size){
        String tmp="";
        //while(size-->0)
        for(;size>0;size--)
            tmp += r.nextInt(10);
        return tmp;
    }

    public static String generaMail(Persona persona) {
        return persona.getNome()+"."+
                persona.getCognome()+"_"+
                PersonaUtils.getRandomNumero(100,999)+"@gmail.com";
    }
}//end class
