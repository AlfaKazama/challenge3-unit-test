package challenge3.test;

import java.util.ArrayList;
import java.util.Collections;

public class SeleksiData extends ReadCSV{


    public static int dibawah6 = 0, nilai6 = 0, nilai7 = 0, nilai8 = 0, nilai9 = 0, nilai10 = 0;
    public static  int totalNilai = 0;
    public static int jumlahData = 0;

    public void seleksi() {

        Data.nilaiTerurut = new ArrayList<>();
        for(var nilai : Data.nilai){
            Data.nilaiTerurut.add(Integer.parseInt(nilai));
        }
        Collections.sort(Data.nilaiTerurut);
        dibawah6 = 0; nilai6 = 0; nilai7 = 0; nilai8 = 0; nilai9 = 0; nilai10 = 0;
        totalNilai = 0;
        jumlahData = 0;

        for(int i = 0; i < Data.nilaiTerurut.size(); i++) {
            totalNilai+= Data.nilaiTerurut.get(i);
            jumlahData++;
            if(Data.nilaiTerurut.get(i) < 6 ) {
                dibawah6++;
            } else if (Data.nilaiTerurut.get(i) == 6) {
                nilai6++;
            } else if (Data.nilaiTerurut.get(i) == 7) {
                nilai7++;
            } else if (Data.nilaiTerurut.get(i) == 8) {
                nilai8++;
            } else if (Data.nilaiTerurut.get(i) == 9) {
                nilai9++;
            } else if (Data.nilaiTerurut.get(i) == 10) {
                nilai10++;
            }
        }
    }

}
