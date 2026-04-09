package K14_whileLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int sum = 0;

        while (sayi > 0) {
            sum += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Girilen sayi: " + girilenSayi + "\nToplam: " + sum);
    }
}