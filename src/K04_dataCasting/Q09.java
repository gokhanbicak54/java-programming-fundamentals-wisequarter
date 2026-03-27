package K04_dataCasting;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

        // Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        double sum = number1 + number2 + number3;

        System.out.println("Toplam: " + sum);
    }
}