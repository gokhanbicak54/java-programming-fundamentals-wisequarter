package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        int sum = 0;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;

        System.out.println("Toplam: " + sum);
    }
}