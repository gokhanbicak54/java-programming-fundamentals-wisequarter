package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan bir String ve aranacak metin alin.
        // Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.--
        // String aranan metni icermiyor
        // Aranan metin String’de sadece 1 kere kullanilmis
        // Aranan metin String’de sadece 1’den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle: ");
        String sentence = scanner.nextLine();
        System.out.println("Metin: ");
        String text = scanner.nextLine();

        int textFirstIndex = sentence.indexOf(text); // 1. metin indeksi
        int textSecondIndex = sentence.indexOf(text, textFirstIndex + 1); // 2. metin indeksi

        if (textFirstIndex == -1) {
            System.out.println("Cumle metini icermiyor");
        } else if (textSecondIndex == -1) {
            System.out.println("Cumle metini 1 kere iceriyor");
        } else {
            System.out.println("Cumle metini 1'den fazla iceriyor");
        }
    }
}