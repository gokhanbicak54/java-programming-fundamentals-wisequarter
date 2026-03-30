package K09_ternaryOperator;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf: ");
        char letter = scanner.next().charAt(0);

        System.out.println(!Character.isLetter(letter) ? "Gecersiz karakter girisi" : Character.isLowerCase(letter) ? Character.toUpperCase(letter) : letter);
    }
}