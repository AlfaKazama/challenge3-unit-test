package challenge3.test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SeleksiData extends ReadCSV{

    public static int dibawah6 = 0, nilai6 = 0, nilai7 = 0, nilai8 = 0, nilai9 = 0, nilai10 = 0;
    public static  int totalNilai = 0;
    public static int jumlahData = 0;

    public void seleksi() {
        // Java Stream
        Data.nilaiTerurut = new ArrayList<>();
        Data.nilaiTerurut = Data.nilai.stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        dibawah6 = 0; nilai6 = 0; nilai7 = 0; nilai8 = 0; nilai9 = 0; nilai10 = 0;
        totalNilai = 0;
        jumlahData = 0;

        for(int i = 0; i < Data.nilaiTerurut.size(); i++) {
            totalNilai+= Data.nilaiTerurut.get(i);
            jumlahData++;
            int nilai = Data.nilaiTerurut.get(i);
            if (nilai < 6) {
                dibawah6++;
            } else if (nilai == 6) {
                nilai6++;
            } else if (nilai == 7) {
                nilai7++;
            } else if (nilai == 8) {
                nilai8++;
            } else if (nilai == 9) {
                nilai9++;
            } else if (nilai == 10) {
                nilai10++;
            }
        }
    }
}
