package it.nextre.academy.pr001.trywithres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class AppTry {


    public static void main(String[] args) {

        //DA NON FARSI MAI
        FileReader fr = null;

        try(FileReader fr1 = new FileReader("./course.txt"){
            @Override
            public void close() throws IOException {
                super.close();
                System.out.println("close FR");
            }
        };
            BufferedReader br = new BufferedReader(fr1){
                @Override
                public void close() throws IOException {
                    super.close();
                    System.out.println("close BR");
                }
            }){
            //fr = fr1; //DA NON FARSI MAI
            //ciclo di lettura della riga
            /*
            String riga=null;
            while( (riga=br.readLine())!=null) {
                System.out.println(riga);
            }*/

            //lettura del carattere
            int c = 0;
            while((c=fr1.read())>=0){
                System.out.print((char)c);
            }
            System.out.println();



        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }

/*
// NON RIUSARE MAI UN Closeable al di fuori del TRY with RESOURCES!!!!
        try {
            System.out.println(fr.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

    }//end main


}//end class
