package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

        asalSayiBulma(7);
        asalSayiBulma(57);
    }

    public static void asalSayiBulma(int number) {

        if (number < 2) {
            System.out.println("Verilen " + number + " sayisi asal degil");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Verilen " + number + " sayisi asal degil");
                break;
            }

            if (i == number - 1) {
                System.out.println("Verilen " + number + " sayisi asal");
            }
        }
    }
}