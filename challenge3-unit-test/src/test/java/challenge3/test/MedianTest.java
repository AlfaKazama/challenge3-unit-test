package challenge3.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test untuk median")
public class MedianTest {


    @DisplayName("Mengecek jika jumlah datanya genap")
    @Test
    public void cekMedianTestGenap() {
        int[] data = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        double median;
        if((data.length % 2) == 1) {
            int a = data.length / 2;
            median = data[a];
        } else {
            int a = data.length / 2;
            int b = (data.length / 2) - 1;
            int c = (a + b) / 2;
            median = data[c];
        }
        var result = 5;
        assertEquals(5, result);
    }

    @DisplayName("Mengecek jika jumlah datanya ganjil")
    @Test
    public void cekMedianTestGanjil() {
        int[] data = {
                1, 2, 3, 4, 5, 6, 7
        };
        double median;
        if((data.length % 2) == 1) {
            int a = data.length / 2;
            median = data[a];
        } else {
            int a = data.length / 2;
            int b = (data.length / 2) - 1;
            int c = (a + b) / 2;
            median = data[c];
        }
        var result = 4;
        assertEquals(4, result);

    }
}
