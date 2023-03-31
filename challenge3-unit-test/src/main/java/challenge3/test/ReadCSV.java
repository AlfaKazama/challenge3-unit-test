package challenge3.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadCSV {

    public static boolean read() {
        Data.nilai = new ArrayList<>();
        String file = "C:\\temp\\direktori\\data_sekolah.csv";

        // Java Lambda Expression
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.lines()
                    .map(line -> line.split(";"))
                    .flatMap(row -> Arrays.stream(row).skip(1))
                    .forEach(Data.nilai::add);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
