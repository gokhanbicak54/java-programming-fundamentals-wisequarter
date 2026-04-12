package K15_doWhileLoop;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan bir sifre girmesini isteyin.
        // Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        // Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        // gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        // - Sifre kucuk harf icermelidir
        // - Sifre buyuk harf icermelidir
        // - Sifre ozel karakter icermelidir
        // - Sifre en az 8 karakter olmalidir

        Scanner scanner = new Scanner(System.in);
        String sifre;
        boolean sifreGecerliMi = false;

        do {
            System.out.println("Sifre giriniz: ");
            sifre = scanner.nextLine();

            boolean kucukHarfVar = false;
            boolean buyukHarfVar = false;
            boolean ozelKarakterVar = false;
            boolean uzunlukYeterli = sifre.length() >= 8;

            for (int i = 0; i < sifre.length(); i++) {
                char karakter = sifre.charAt(i);

                if (Character.isLowerCase(karakter)) {
                    kucukHarfVar = true;
                } else if (Character.isUpperCase(karakter)) {
                    buyukHarfVar = true;
                } else if (!Character.isLetterOrDigit(karakter)) {
                    ozelKarakterVar = true;
                }
            }

            if (!kucukHarfVar) {
                System.out.println("sifre kucuk harf icermelidir");
            }
            if (!buyukHarfVar) {
                System.out.println("sifre buyuk harf icermelidir");
            }
            if (!ozelKarakterVar) {
                System.out.println("sifre ozel karakter icermelidir");
            }
            if (!uzunlukYeterli) {
                System.out.println("sifre en az 8 harf icermelidir");
            }

            if (kucukHarfVar && buyukHarfVar && ozelKarakterVar && uzunlukYeterli) {
                sifreGecerliMi = true;
                System.out.println("Sifre gecerlidir");
            } else {
                System.out.println("Sifre gecersizdir, tekrardan deneyiniz");
            }

        } while (!sifreGecerliMi);
    }
}