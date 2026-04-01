package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

        // Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel
        // output : Java ogrenmek ne guzel.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin girin: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("\\d", ""); // java ogRe@nMek #ne +Gu=zel

        sentence = sentence.replaceAll(" ", "1"); // java1ogRe@nMek1#ne1+Gu=zel

        sentence = sentence.replaceAll("\\W", ""); // java1ogRenMek1ne1Guzel

        sentence = sentence.replaceAll("_", ""); // java1ogRenMek1ne1Guzel

        sentence = sentence.replaceAll("1", " "); // java ogRenMek ne Guzel

        sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase(); // Java ogrenmek ne guzel

        System.out.println(sentence);
    }
}