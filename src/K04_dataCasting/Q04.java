package K04_dataCasting;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar1: ");
        double edge1 = scanner.nextDouble();

        System.out.println("Kenar2: ");
        double edge2 = scanner.nextDouble();

        System.out.println("Alan: " + (edge1 * edge2));
    }
}