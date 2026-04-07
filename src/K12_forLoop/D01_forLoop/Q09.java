package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin: ");
        String text = scanner.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}