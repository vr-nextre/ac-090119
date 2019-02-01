package it.nextre.academy.pr001;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GaraDiNuoto {
    public static void main(String[] args) {

        List<Nuotatore> partecipanti = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            partecipanti.add(
                    new Nuotatore("Persona "+(i+1),
                            i+1+""
                    ));
        }//end for


        //scatta la gara
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            for(Nuotatore n : partecipanti){
                n.setTempo(n.getTempo().plus(40_000+r.nextInt(6000), ChronoUnit.MILLIS)
                );
            }
        }//end for

        //ordino la lista in base ai tempi
        Collections.sort(partecipanti,(n1,n2)->n1.getTempo().compareTo(n2.getTempo()));

        for(Nuotatore n:partecipanti){
            System.out.println(n);
        }



    }//end main






}//end class



class Nuotatore {
    String nome;
    String numero;
    Duration tempo;

    public Nuotatore(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.tempo = Duration.ZERO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Duration getTempo() {
        return tempo;
    }

    public void setTempo(Duration tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Nuotatore{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", tempo=" + this.formattaDuration(tempo) +
                '}';
    }


    private String formattaDuration(Duration duration){
        return String.format("%s days and %sh %sm %ss %sms",
                duration.toDays(),
                duration.toHours() - TimeUnit.DAYS.toHours(duration.toDays()),
                duration.toMinutes() - TimeUnit.HOURS.toMinutes(duration.toHours()),
                duration.getSeconds() - TimeUnit.MINUTES.toSeconds(duration.toMinutes()),
                duration.toMillis() - TimeUnit.SECONDS.toMillis(duration.getSeconds())
        );

    }
}