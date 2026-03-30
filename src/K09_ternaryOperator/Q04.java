package K09_ternaryOperator;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Not: ");
        double note = scanner.nextDouble();

        System.out.println((note > 100) || (note < 0) ? "Yanlis not girisi" : (note >= 50) ? "Sinifi gectin" : "Maalesef kaldin");
    }
}