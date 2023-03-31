package challenge3.test;

public class Modus extends SeleksiData {

    public static String cekModus() {
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
        return max;
    }

}
