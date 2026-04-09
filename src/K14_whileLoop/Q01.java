package K14_whileLoop;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse toplami yazdirin.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sayi = 0;

        while (sum <= 500) {
            System.out.println("Sayi girin: ");
            sayi = scanner.nextInt();
            sum += sayi;
        }

        System.out.println("Toplam: " + sum);
    }
}