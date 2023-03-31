package challenge3.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.Media;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test untuk median")
class MedianTest {

    @DisplayName("Mengecek jika jumlah datanya genap")
    @Test
    void cekMedianGenapTest() {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assertEquals(5.5, Median.cekMedian(data));
    }

    @DisplayName("Mengecek jika jumlah datanya ganjil")
    @Test
    void cekMedianGanjilTest() {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6, 7);

        assertEquals(4, Median.cekMedian(data));
    }


}