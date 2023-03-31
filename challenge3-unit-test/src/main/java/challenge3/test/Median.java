package challenge3.test;

import java.util.List;

public class Median extends SeleksiData {

    public static double cekMedian(List<Integer> kumpulanData) {
        double median;
        int data  = kumpulanData.size();
        if((data % 2) == 1) {
            int a = data / 2;
            median = Double.valueOf(kumpulanData.get(a));
        } else {
            int a = data / 2;
            int b = (data / 2) - 1;
            int c = kumpulanData.get(a) +kumpulanData.get(b);
            median = c / 2.0;
        }
        return median;

    }

}
