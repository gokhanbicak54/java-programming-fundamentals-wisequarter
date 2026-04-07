package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                System.out.println("Sayi asal degil");
                break;
            }
            if (i == number - 1) {
                System.out.println("Sayi asal");
            }
        }
    }
}