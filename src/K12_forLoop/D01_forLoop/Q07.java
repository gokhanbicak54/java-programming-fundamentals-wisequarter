package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = Math.abs(number); i > 0; i = i / 10) {
            sum += i % 10;
        }

        System.out.println("Girilen " + number + " sayisinin rakamlar toplami: " + sum);
    }
}