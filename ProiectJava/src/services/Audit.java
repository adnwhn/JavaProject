package services;

import java.io.*;
import java.sql.Timestamp;

public final class Audit {
    static File csvFile = new File("C:\\Users\\uni\\ProiectJava\\resources\\log.csv");
    String file;

    Audit() {file = "log.csv";}

    public static void log(String actionName) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        try(FileWriter pw = new FileWriter(csvFile, true)){
            pw.write(timestamp + "," + actionName + "\n");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getFile() {
        return file;
    }

}
