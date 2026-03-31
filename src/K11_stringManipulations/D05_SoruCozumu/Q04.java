package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan bir String ve aranacak metin alin.
        // String’in aranan metni icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle: ");
        String sentence = scanner.nextLine();
        System.out.println("Metin: ");
        String text = scanner.nextLine();

        int isWhere = sentence.lastIndexOf(text);

        if (isWhere == -1) {
            System.out.println("Metin cümle içinde yok");
        } else {
            System.out.println("Cumle icerisinde metin var");
        }
    }
}