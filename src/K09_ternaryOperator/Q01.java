package K09_ternaryOperator;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” veya “Sayi 5’in kati degil” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        System.out.println(number % 5 == 0 ? "Sayi 5’in tam kati" : "Sayi 5’in kati degil");
    }
}