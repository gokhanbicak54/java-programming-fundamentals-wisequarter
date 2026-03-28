package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf: ");
        char letter = scanner.next().toUpperCase().charAt(0);

        if (letter == 'O') {
            System.out.println("Ocak");
        }
        if (letter == 'S') {
            System.out.println("Subat");
        }
        if (letter == 'M') {
            System.out.println("Mart veya Mayis");
        }
        if (letter == 'N') {
            System.out.println("Nisan");
        }
        if (letter == 'H') {
            System.out.println("Haziran");
        }
        if (letter == 'T') {
            System.out.println("Temmuz");
        }
        if (letter == 'A') {
            System.out.println("Agustos veya Aralik");
        }
        if (letter == 'E') {
            System.out.println("Eylül ve Ekim");
        }
        if (letter == 'K') {
            System.out.println("Kasim");
        }
    }
}