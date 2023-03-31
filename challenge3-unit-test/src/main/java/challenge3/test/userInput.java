package challenge3.test;

import java.util.Scanner;

public class userInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

}
