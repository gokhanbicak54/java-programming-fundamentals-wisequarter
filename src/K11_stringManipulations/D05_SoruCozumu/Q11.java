package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        // Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin: ");
        String text = scanner.nextLine();

        if (text.length() % 2 == 0) {
            System.out.println(text.substring(0, text.length() / 2) + ":)" + text.substring(text.length() / 2));
        } else {
            System.out.println(text.substring(0, text.length() / 2) + ":(" + text.substring(text.length() / 2 + 1));
        }
    }
}