package challenge3.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tes untuk modus")
public class ModusTest {

    static int dibawah6 = 1, nilai6 = 10, nilai7 = 20, nilai8 = 9, nilai9 = 24, nilai10 = 13;

    @DisplayName("Mengecek frekuensi data terbanyak")
    @Test
    public void cekModus() {
        String max;
        if((dibawah6 > nilai6) && (dibawah6 > nilai7) && (dibawah6 > nilai8) && (dibawah6 > nilai9) && (dibawah6 > nilai10)) {
            max = "kurang dari 6";
        } else if((nilai6 > nilai7) && (nilai6 > nilai8) && (nilai6 > nilai9) && (nilai6 > nilai10)) {
            max = "6";
        } else if((nilai7 > nilai8) && (nilai7 > nilai9) && (nilai7 > nilai10)) {
            max = "7";
        } else if((nilai8 > nilai9) && (nilai8 > nilai10)) {
            max = "8";
        } else if((nilai9 > nilai10)) {
            max = "9";
        } else {
            max = "10";
        }

        var result = max;
        assertEquals("9", result);


    }

}
