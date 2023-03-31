package challenge3.test;

public class ExitInput extends userInput {
    public static void exit() {
        System.out.println("0. Exit");
        System.out.println("1. Kembali Ke Menu Utama");
        var input = input("Pilih");
        boolean ulang = true;
        while (ulang) {
            if(input.equals("1")) {
                Tampilan.menu();
            } else if(input.equals("0")){
                System.exit(0);
            } else {
                System.out.println("Pilihan Yang Anda Masukan Salah\n");
                exit();
            }
        }
    }

}
