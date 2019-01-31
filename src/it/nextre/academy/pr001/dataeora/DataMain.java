package it.nextre.academy.pr001.dataeora;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.stream.Collectors;

public class DataMain {

    List<Persona> db = new ArrayList<>();

    class Persona {
        String nominativo;
        LocalDate compleanno;

        public Persona(String nominativo, LocalDate compleanno) {
            this.nominativo = nominativo;
            this.compleanno = compleanno;
        }

        public String getNominativo() {
            return nominativo;
        }

        public void setNominativo(String nominativo) {
            this.nominativo = nominativo;
        }

        public LocalDate getCompleanno() {
            return compleanno;
        }

        public void setCompleanno(LocalDate compleanno) {
            this.compleanno = compleanno;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nominativo='" + nominativo + '\'' +
                    ", compleanno=" + compleanno +
                    '}';
        }
    }


    public static void main(String[] args) {


        long millis = System.currentTimeMillis();

        Date d1 = new Date();
        d1.setTime(millis);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss:SSS [EEEE] ");
        System.out.println(sdf.format(d1));

        // la Date è meglio evitarla, usare piuttosto il package di java.time


        System.out.println(Instant.ofEpochMilli(millis));

        LocalDate ld1 = LocalDate.of(0, Month.JULY, 7);
        System.out.println(ld1);
        System.out.println(
                ld1
                        .getDayOfWeek()
                        .getDisplayName(
                                TextStyle.FULL, Locale.ITALY
                        )
        );


        System.out.println(
                ld1.format(
                        DateTimeFormatter.ofPattern("EEEE", Locale.ITALY)
                )
        );


        //System.out.println(d1);
        DataMain prog = new DataMain();
        prog.init();
        //ordino la lista
        Collections.sort(prog.db, (o1, o2) -> {
            LocalDate p1 = o1.getCompleanno().withYear(0);
            LocalDate p2 = o2.getCompleanno().withYear(0);
            /*
            if (p1.isEqual(p2)) {
                return 0;
            }else if(p1.isBefore(p2)){
                return -1;
            }else{
                return 1;
            }
            */
            return p1.compareTo(p2);
        });

        prog.db.stream().forEach(System.out::println);
        System.out.println("##################");
        //prog.db.stream().forEach(p->System.out.println(p));
        prog.db.stream()
                .filter(p->p.getCompleanno().withYear(0).isAfter(LocalDate.now().withYear(0)))
                .filter(p->p.getCompleanno().withYear(0).isBefore(LocalDate.now().plusDays(2).withYear(0)))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("##################");

        //Year tmp = Year.of(0);
        for (int i = 0; i <= 2019; i++) {
            //if( (tmp=tmp.plus(1, ChronoUnit.YEARS)).isLeap()){
            if(Year.of(i).isLeap()){
                System.out.println(i + " è bisestile");
            }
        }//end for


    }//end main

    private void init() {
        db.add(new Persona("Febelli Federico", LocalDate.of(1995, 2, 1)));
        db.add(new Persona("Bagalà Francesco", LocalDate.of(1995, 2, 1)));
        db.add(new Persona("Sblendido Nicolas", LocalDate.of(1998, 9, 30)));
        db.add(new Persona("Maccioni Federico", LocalDate.of(1990, 5, 25)));
        db.add(new Persona("Pestoni Simone", LocalDate.of(1993, 9, 8)));
        db.add(new Persona("Miron Iraida", LocalDate.of(1994, 10, 7)));
        db.add(new Persona("Velati Riccardo", LocalDate.of(1998, 6, 3)));
        db.add(new Persona("Casiero Nicolas", LocalDate.of(1998, 12, 7)));
        db.add(new Persona("Mazzucchetti Patrick", LocalDate.of(1997, 9, 1)));
        db.add(new Persona("Radice Valerio", LocalDate.of(1985, 7, 7)));
    }
}//end class
