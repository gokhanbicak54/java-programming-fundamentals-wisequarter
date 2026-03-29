package K08_ifElseStatements.D04_nestedIfElseStatements;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun adedi: ");
        int numberOfProducts = scanner.nextInt();

        System.out.println("Indirimsiz fiyat: ");
        int priceWithoutDiscount = scanner.nextInt();

        System.out.println("Kartin var mı?: ");
        char cardOwnership = scanner.next().toUpperCase().charAt(0);

        if (cardOwnership == 'E') {
            if (numberOfProducts >= 10) {
                System.out.println("Urun fiyati: " + (priceWithoutDiscount * 0.80));
            } else if (numberOfProducts > 0) {
                System.out.println("Urun fiyati: " + (priceWithoutDiscount * 0.85));
            } else {
                System.out.println("Urun adedi sifir veya negatif olamaz");
            }
        } else if (cardOwnership == 'H') {
            if (numberOfProducts >= 10) {
                System.out.println("Urun fiyati: " + (priceWithoutDiscount * 0.85));
            } else if (numberOfProducts > 0) {
                System.out.println("Urun fiyati: " + (priceWithoutDiscount * 0.90));
            } else {
                System.out.println("Urun adedi sifir veya negatif olamaz");
            }
        } else {
            System.out.println("Kart var mi icin E veya H girmelisiniz");
        }
    }
}