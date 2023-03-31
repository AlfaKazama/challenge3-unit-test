package challenge3.test;

public class Tampilan {
    public static void menu() {
        while (true) {
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Aplikasi Pengolah Nilai Siswa");
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Letakan File csv dengan nama file data_sekolah di direktori berikut : C:\\temp\\direktori");

            System.out.println("Pili Menu :");
            System.out.println("1. Generate txt untuk menampilkan modus");
            System.out.println("2. Generate txt untuk menampilkan nilai-rata, dan median");
            System.out.println("3. Generate kedua file");
            System.out.println("0. Exit");

            var input = userInput.input("pilih");

            switch (input) {
                case "1" -> {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Aplikasi Pengolah Nilai Siswa");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    if(ReadCSV.read()) {
                        SeleksiData tes = new SeleksiData();
                        tes.seleksi();
                        Cetak.printFrekeunsiTxt();
                        System.out.println("File telah di generate di : C:\\temp\\direktori\n");
                        System.out.println("Silahkan di cek");
                    } else {
                        System.out.println("File tidak ditemukan");
                        ExitInput.exit();
                    }
                }

                case "2" -> {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Aplikasi Pengolah Nilai Siswa");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    if((ReadCSV.read())) {
                        SeleksiData tes = new SeleksiData();
                        tes.seleksi();
                        Cetak.printModusMedianMean();
                        System.out.println("File telah di generate di : C:\\temp\\direktori\n");
                        System.out.println("Silahkan di cek");
                    } else {
                        System.out.println("File tidak ditemukan");
                        ExitInput.exit();
                    }
                }
                case "3" -> {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Aplikasi Pengolah Nilai Siswa");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    if(ReadCSV.read()) {
                        SeleksiData tes = new SeleksiData();
                        tes.seleksi();
                        Cetak.printFrekeunsiTxt();
                        Cetak.printModusMedianMean();
                        System.out.println("File telah di generate di : C:\\temp\\direktori\n");
                        System.out.println("Silahkan di cek");
                    } else {
                        System.out.println("File tidak ditemukan");
                        ExitInput.exit();
                    }
                }
                case "0" -> {
                    System.exit(0);
                }
                default -> System.out.println("Pilihan Yang Anda Masukan Salah");
            }
            System.out.println("\n\n");
        }
    }
}
