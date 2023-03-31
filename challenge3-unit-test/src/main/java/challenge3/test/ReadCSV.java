package challenge3.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadCSV {

    public static boolean read() {
        Data.nilai = new ArrayList<>();
        String file = "C:\\temp\\direktori\\data_sekolah.csv";

        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            int baris = 0;
            while ((line = reader.readLine()) != null) {

                String[] row =  line.split(";");

                for(int i = 0; i < row.length; i++) {
                    if (i == 0) {
                        continue;
                    }
                    Data.nilai.add(row[i]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
