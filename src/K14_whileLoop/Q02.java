package K14_whileLoop;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan sifre isteyin. Asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesini isteyin.
        // Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin.
        // Gecerli sifre yazilinca “Sifreniz basari ile kaydedildi” yazdirin

        // sartlar: - sifrenin ilk karakteri kucuk harf olmali
        //          - sifrenin son karakteri sayi olmali

        Scanner scanner = new Scanner(System.in);

        boolean sifreDogruMu = false;
        String sifre = "";
        char ilkHarf;
        char sonHarf;

        while (!sifreDogruMu) {
            System.out.println("Sifre girin: ");
            sifre = scanner.nextLine();
            ilkHarf = sifre.charAt(0);
            sonHarf = sifre.charAt(sifre.length() - 1);

            if (ilkHarf < 'a' || ilkHarf > 'z') {
                System.out.println("Sifrenin ilk karakteri kucuk harf olmali");
            } else if (sonHarf < '0' || sonHarf > '9') {
                System.out.println("Sifrenin son karakteri rakam olmali");
            } else {
                System.out.println("Sifreniz basari ile kaydedildi");
                sifreDogruMu = true;
            }
        }
    }
}