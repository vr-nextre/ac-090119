package it.nextre.academy.pr001.renamer;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class RenMain {


    public final static String nomi =
            "" +
                    "1.1 Introduction\t\n" +
                    "1.2 Implement Encapsulation\t\n" +
                    "1.3 Implement inheritance including visibility modifiers and composition\t\n" +
                    "1.4 Implement Polymorphism\t\n" +
                    "1.5 Override hashCode, equals, and toString methods from Object class\t\n" +
                    "1.6 Create and use singleton classes and immutable classes\t\n" +
                    "1.7 Develop code that uses static keyword on initialize blocks, variables, methods\t\n" +
                    "2.1 Develop code that uses abstract classes and methods\t\n" +
                    "2.2 Develop code that uses the final keyword\t\n" +
                    "2.3 Create inner classes including static inner class, local class, nested class\t\n" +
                    "2.4 Use enumerated types including methods, and constructors in an enum type\t\n" +
                    "2.5 Develop code that declares, implements and/or extends interfaces\t\n" +
                    "2.6 Create and use Lambda expressions\t\n" +
                    "3.1 Create and use a generic class\t\n" +
                    "3.2 Create and use ArrayList, TreeSet, TreeMap, and ArrayDeque objects\t\n" +
                    "3.3 Use java.util.Comparator and java.lang.Comparable interfaces\t\n" +
                    "3.4 Collections Streams and Filters\t\n" +
                    "3.5 Iterate using forEach methods of Streams and List\t\n" +
                    "3.6 Describe Stream interface and Stream pipeline\t\n" +
                    "3.7 Filter a collection by using lambda expressions\t\n" +
                    "3.8 Use method references with Streams\t\n" +
                    "4.1 Use the built-in interfaces included in the java.util.function package such\t\n" +
                    "4.2 Develop code that uses primitive versions of functional interfaces\t\n" +
                    "4.3 Develop code that uses binary versions of functional interfaces\t\n" +
                    "4.4 Develop code that uses the UnaryOperator interface\t\n" +
                    "5.1 Develop code to extract data from an object using peek() and map() methods\t\n" +
                    "5.2 Search for data by using search methods of the Stream classes including find\t\n" +
                    "5.3 Develop code that uses the Optional class\t\n" +
                    "5.4 Develop code that uses Stream data methods and calculation methods\t\n" +
                    "5.5 Sort a collection using Stream API\t\n" +
                    "5.6 Save results to a collection using the collect method and group/partition da\t\n" +
                    "5.7 Use flatMap() methods in the Stream API\t\n" +
                    "6.1 Use try-catch and throw statements\t\n" +
                    "6.2 Use catch, multi-catch, and finally clauses\t\n" +
                    "6.3 Use Autoclose resources with a try-with-resources statement\t\n" +
                    "6.4 Create custom exceptions and Auto-closeable resources\t\n" +
                    "6.5 Test invariants by using assertions\t\n" +
                    "7.1 Create and manage date-based and time-based events\t\n" +
                    "7.2 Work with dates and times across timezones\t\n" +
                    "7.3 Define and create and manage date-based and time-based events using Instant\t\n" +
                    "8.1 Read and write data from the console\t\n" +
                    "8.2 Use BufferedReader, BufferedWriter, File, FileReader and others in java\t\n" +
                    "9.1 Use Path interface to operate on file and directory paths\t\n" +
                    "9.2 Use Files class to check, read, delete, copy, move, manage metadata of a file\t\n" +
                    "9.3 Use Stream API with NIO.2\t\n" +
                    "10.1 Create worker threads using Runnable, Callable and use an ExecutorService\t\n" +
                    "10.2 Identify potential threading problems among deadlock, starvation, livelock\t\n" +
                    "10.3 Use synchronized keyword and java.util.concurrent.atomic package to control\t\n" +
                    "10.4 Use java.util.concurrent collections and classes including CyclicBarrier\t\n" +
                    "10.5 Use parallel Fork/Join Framework\t\n" +
                    "10.6 Use parallel Streams including reduction, decomposition, merging processes\t\n" +
                    "11.2 Identify the components required to connect to a database using the DriverManager\t\n" +
                    "11.1 Describe the interfaces that make up the core of the JDBC API including the\t\n" +
                    "11.3 Submit queries and read results from the database\t\n" +
                    "12.1 Read and set the locale by using the Locale object\t\n" +
                    "12.2 Create and read a Properties file\t\n" +
                    "12.3 Build a resource bundle for each locale and load a resource bundle in an app\t\n" +
                    "";


    /*
     *
     * Creare in una cartella tanti file quante le lezioni di ogni capitolo chiamandoli
     * S{numeroArgomento}L{numeroLezione}.mp4
     * esempio: S1L1.mp4
     *
     * leggendo il contenuto dalla stringa nomi
     *
     * Poi rinominare i file con il numero dell'argomento e della lezione relativa.
     *
     * */

    /*
    Relativo
        ./cartella/sootocartella/file.ext

    Assoluto
        C:\Academy\academy5\pr001\cartella\sottocartella\file.ext
    */


    public static void main(String[] args) {

        RenMain app = new RenMain();

        boolean fase1 = true;
        boolean fase2 = true;

        final Map<String, String> db = new HashMap<>();
        app.popolaDb(db, nomi);
        //System.out.println(db);
        Path baseFolder = Paths.get("C:", "Users", "Valerio", "Desktop", "Videos(Java)");

        //System.out.println(baseFolder);

        //PREMESSA fase1 e fase2 sono a scopi didattici, potrebbero diventare dei metodi e posso controllare
        //solo il comando per l'effetiva modifica sul disco
        // !!! spetterà a voi separarli negli opportuni metodi !!!


        /***********************/
        /******* FASE 1 ********/
        /***********************/
        //FASE 1: preparazione ambiente
        if (fase1) {
            try {
                Set<String> keys = db.keySet();
                //System.out.println(keys);
                for (String key : keys) {
                    File mayExist = new File(baseFolder+File.separator+key);
                    if (mayExist.exists()){
                        //sono già a posto
                    }else{
                        File mayExistWithDesc = new File(baseFolder+File.separator+db.get(key)+".mp4");
                        if (mayExistWithDesc.exists()){
                            //sono già a posto, salto al prox
                            System.out.println("Skippo, già elaborato: "+key);
                        }else{
                            app.creaFile(baseFolder, key, "");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //FASE 1: preparazione ambiente completata


        /***********************/
        /******* FASE 2 ********/
        /***********************/
        //FASE 2: lettura della cartella e gestione del contenuto
        //estraggo il contenuto della cartella
        if (fase2) {
            //classe anonima, convertibile in futuro con le lambda
            FilenameFilter mp4 = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".mp4");
                }
            };

            File[] files = baseFolder.toFile().listFiles(mp4);
            for(File f : files){
                System.out.println(f);
                //se il nome del file esiste nella mappa dovrò cambiargli il nome,
                //altrimenti ignorarlo
                String nomeFileTmp = f.toPath().getFileName().toString();
                //System.out.println(nomeFileTmp + " in mappa: " + db.containsKey(nomeFileTmp));
                if (db.containsKey(nomeFileTmp) ){
                    //ok rinomino
                    f.renameTo(new File(baseFolder + File.separator + db.get(nomeFileTmp) + ".mp4"));
                }


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }



        }//end if
        //FASE 2: lettura della cartella e gestione del contenuto


    }//end main

    private void popolaDb(Map<String, String> db, String nomi) {
        StringTokenizer st = new StringTokenizer(nomi, "\n");
        while (st.hasMoreTokens()) {
            //per ogni riga dovrò estrarre il codice (chiave) e
            //la descrizione (valore)
            String tmp = st.nextToken().trim();
            //System.out.println("----> "+tmp);
            String codice = tmp.substring(0, tmp.indexOf(" ")).trim();
            String descrizione = tmp.substring(0).trim();
            //sistemo il codice come da specifica
            codice = "S" + codice.replace(".", "L") + ".mp4"; //ci metto anche l'estensione per facilitarmi la vita dopo nel recuperare il nome del file
            //pulisco la descrizione rimuovendo i caratteri non concessi
            descrizione = descrizione.replace("/", "-");
            descrizione = descrizione.replace(".", "_");
            descrizione = descrizione.replace("!", "_");
            descrizione = descrizione.replace("?", "_");
            descrizione = descrizione.replace("<", "_");
            descrizione = descrizione.replace(">", "_");
            descrizione = descrizione.replace(",", " ");
            descrizione = descrizione.replace("  ", " ");
            //System.out.println("[code]= "+codice+"\t  [descrizione]= "+descrizione );

            //popolo la mappa
            db.put(codice, descrizione);

        }
    }


    public void creaFile(Path baseDir, String filename, String extension) throws IOException {
        boolean check1 = false;
        if (baseDir.toFile().exists() && baseDir.toFile().isDirectory()) {
            //controllo se è scrivibile
            check1 = baseDir.toFile().canWrite();
        } else {
            //provo a crearla
            check1 = baseDir.toFile().mkdir();
            //Files.createDirectory(baseDir);
        }
        //ipotizzo la pulizia del filename da caratteri non concessi dal fileSystem
        //todo...

        if (check1 && filename != null && filename.length() > 0) {
            //è scrivibile e non esiste allora creo il file
            File f = new File(baseDir + File.separator + filename + extension);
            if (!f.exists())
                f.createNewFile();

        }


    }


}//end class
