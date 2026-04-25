package K19_forEachLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “Harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle giriniz: ");
        String sentence = scanner.nextLine();
        System.out.println("Harf giriniz: ");
        String letter = scanner.nextLine();

        String[] karakterler = sentence.split("");
        int count = 0;

        for (String each : karakterler) {
            if (letter.equals(each)) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Harf cumlede kullanilmamis");
        }
        if (count > 0) {
            System.out.println("Kullanim sayisi: " + count);
        }
    }
}