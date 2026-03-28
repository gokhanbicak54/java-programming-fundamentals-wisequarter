package K08_ifElseStatements.D02_ifElseStatements;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Not: ");
        double note = scanner.nextDouble();

        if (note >= 50) {
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
    }
}