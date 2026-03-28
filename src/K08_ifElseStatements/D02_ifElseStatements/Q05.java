package K08_ifElseStatements.D02_ifElseStatements;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf: ");
        char letter = scanner.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println(Character.toUpperCase(letter));
        } else {
            System.out.println(letter);
        }
    }
}