package K08_ifElseStatements.D02_ifElseStatements;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf: ");
        char letter = scanner.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Buyuk harf degil");
        }
    }
}