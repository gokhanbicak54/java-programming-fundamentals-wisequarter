package K08_ifElseStatements.D03_ifElseIfStatements;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafe(km): ");
        double distance = scanner.nextDouble();

        System.out.println("Cevrilecek mesafe: ");
        char unit = scanner.next().toUpperCase().charAt(0);

        if (unit == 'M') {
            System.out.println("Mesafe: " + (distance * 1000) + " metre");
        } else if (unit == 'S') {
            System.out.println("Mesafe: " + (distance * 100000) + " santimetre");
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}