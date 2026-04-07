package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin: ");
        String text = scanner.nextLine();

        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }

        System.out.println(reverseText);

        if (reverseText.equalsIgnoreCase(text)) {
            System.out.println("Girilen metin palindrome");
        } else {
            System.out.println("Girilen metin palindrome degil");
        }
    }
}