package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Isim: ");
        String name = scanner.nextLine();
        System.out.println("Soyad: ");
        String surname = scanner.nextLine();

        if (name.length() > surname.length()) {
            System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
                    + " " + surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());
        } else if (surname.length() > name.length()) {
            System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
                    + " " + surname.toUpperCase());
        }
    }
}