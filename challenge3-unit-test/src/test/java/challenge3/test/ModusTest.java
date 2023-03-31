package challenge3.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test untuk modus")
class ModusTest {

    @DisplayName("Test untuk modus dari data")
    @Test
    void cekModusTest(){
        SeleksiData.dibawah6 = 12;
        SeleksiData.nilai6 = 3;
        SeleksiData.nilai7 = 1;
        SeleksiData.nilai8 = 4;
        SeleksiData.nilai9 = 2;
        SeleksiData.nilai10 = 1;

        String expected = "kurang dari 6";
        String actual = Modus.cekModus();

        assertEquals(expected, actual);
    }
}