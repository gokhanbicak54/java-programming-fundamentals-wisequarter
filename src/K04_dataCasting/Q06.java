package K04_dataCasting;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricap: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;

        System.out.println("Cevre: " + (2 * pi * radius) + "\nAlan: " + (pi * radius * radius));
    }
}