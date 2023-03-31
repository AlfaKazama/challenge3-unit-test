package challenge3.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test untuk median")
public class MedianTest {


    @DisplayName("Mengecek jika jumlah datanya genap")
    @Test
    public void cekMedianTestGenap() {
        int[] Kumpulandata = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        int data = Kumpulandata.length;
        double median;
        if((data % 2) == 1) {
            int a = data / 2;
            median = Double.valueOf(Kumpulandata[a]);
        } else {
            int a = data / 2;
            int b = (data / 2) - 1;
            int c = Kumpulandata[a] + Kumpulandata[b];
            median = c / 2.0;
        }

        var result = median;
        assertEquals(5.5, result);
    }

    @DisplayName("Mengecek jika jumlah datanya ganjil")
    @Test
    public void cekMedianTestGanjil() {
        int[] Kumpulandata = {
                1, 2, 3, 4, 5, 6, 7
        };

        int data = Kumpulandata.length;
        double median;
        if((data % 2) == 1) {
            int a = data / 2;
            median = Double.valueOf(Kumpulandata[a]);
        } else {
            int a = data / 2;
            int b = (data / 2) - 1;
            int c = Kumpulandata[a] + Kumpulandata[b];
            median = c / 2.0;
        }

        var result = median;
        assertEquals(4, result);
    }

}
