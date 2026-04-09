package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int sayi = scanner.nextInt();

        int sonuc = getPozitifBolenSayisi(sayi);
        if (sonuc == -1) {
            System.out.println("Geçersiz giriş yaptınız");
        } else {
            System.out.println("Bölen sayısı: " + sonuc);
        }
    }

    public static int getPozitifBolenSayisi(int sayi) {

        int count = 0;

        if (sayi < 0) {
            System.out.println("Sayi negatif olamaz");
            return -1;
        } else {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    count++;
                }
            }
        }
            return count;
    }
}