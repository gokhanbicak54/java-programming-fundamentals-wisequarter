package K04_dataCasting;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // Girilen bilgiler: J Doe, 44

        Scanner scanner = new Scanner(System.in);
        System.out.println("Isim: ");
        char name = scanner.next().charAt(0);

        System.out.println("Soyisim: ");
        String surname = scanner.nextLine();

        System.out.println("Yas: ");
        int age = scanner.nextInt();

        System.out.println("Girilen bilgiler: " + name + " " + surname + ", " + age);
    }
}