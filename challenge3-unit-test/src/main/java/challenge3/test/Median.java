package challenge3.test;

public class Median extends SeleksiData {
    public static double cekMedian() {
        double median;
        int data  = jumlahData;
        if((data % 2) == 1) {
            int a = data / 2;
            median = Data.nilaiTerurut.get(a);
        } else {
            int a = data / 2;
            int b = (data / 2) - 1;
            int c = (a + b) / 2;
            median = Double.valueOf(Data.nilaiTerurut.get(c));
        }
        return median;

    }

}
