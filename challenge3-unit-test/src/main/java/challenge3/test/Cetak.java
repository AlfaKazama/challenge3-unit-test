package challenge3.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cetak {

    public static void printFrekeunsiTxt() {

        try {

            FileWriter fileWriter = new FileWriter("C:\\temp\\direktori\\Modus.txt");

            // buat objek PrintWriter
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Data Nilai = ");
            printWriter.println("--------------------------------------------------");
            printWriter.println("Nilai           |\t\t\tFrekuensi");
            printWriter.println("==================================================");
            printWriter.println("Kurang dari 6\t|\t\t\t\t" + SeleksiData.dibawah6);
            printWriter.println("--------------------------------------------------");
            printWriter.println("6\t        |\t\t\t\t" + SeleksiData.nilai6);
            printWriter.println("--------------------------------------------------");
            printWriter.println("7\t        |\t\t\t\t" + SeleksiData.nilai7);
            printWriter.println("--------------------------------------------------");
            printWriter.println("8\t        |\t\t\t\t" + SeleksiData.nilai8 );
            printWriter.println("--------------------------------------------------");
            printWriter.println("9\t        |\t\t\t\t" + SeleksiData.nilai9);
            printWriter.println("--------------------------------------------------");
            printWriter.println("10\t        |\t\t\t\t" + SeleksiData.nilai10);
            printWriter.println("--------------------------------------------------");

            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }


    public static void printModusMedianMean(){
        double mean = (double) SeleksiData.totalNilai / SeleksiData.jumlahData;
        String modus = Modus.cekModus();
        double median = Median.cekMedian(Data.nilaiTerurut);
        try {
            FileWriter fileWriter = new FileWriter("C:\\temp\\direktori\\MeanMedianModus.txt");

            // buat objek PrintWriter
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Berikut Hasil Pengolahan Nilai : ");
            printWriter.println();
            printWriter.println("Berikut Hasil hasil sebaran data nilai");
            printWriter.println("Mean    : " + mean);
            printWriter.println("Median  : " + median);
            printWriter.println("Modus   : " + modus);


            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

}
