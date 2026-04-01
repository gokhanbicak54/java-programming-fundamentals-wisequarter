package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sifre: ");
        String password = scanner.nextLine();

        int flag = 0;

        char firstLetter = password.charAt(0);
        if (!Character.isLowerCase(firstLetter)) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }

        char lastLetter = password.charAt(password.length() - 1);
        if (!Character.isDigit(lastLetter)) {
            System.out.println("son karakter rakam olmali");
            flag++;
        }

        if (password.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

        if (!(password.length() >= 10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
        }

        if (flag == 0) {
            System.out.println("sifre basariyla kaydedildi");
        }
    }
}