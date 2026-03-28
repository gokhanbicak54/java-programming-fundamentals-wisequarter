package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Uc ile bolunebilen sayi");
        }
        if (number % 5 == 0) {
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}