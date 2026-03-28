package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("Sayi 5’in tam kati");
        }
    }
}