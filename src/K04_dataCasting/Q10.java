package K04_dataCasting;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf: ");
        char letter = scanner.next().charAt(0);

        System.out.println(letter + " sonrası 3 harf: " + (char)(letter + 1) + ", " + (char)(letter + 2) + ", " + (char)(letter + 3));
    }
}