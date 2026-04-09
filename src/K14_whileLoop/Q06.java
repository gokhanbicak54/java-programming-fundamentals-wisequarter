package K14_whileLoop;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin.
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin.
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
        // bunlarin toplaminin kac oldugunu yazdirin.
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz" yazdirin.
        // Bu negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sayi = -1;
        int count = 0;

        while (!(sayi == 0)) {
            System.out.println("Sayi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > 0) {
                sum += sayi;
                count++;
            } else if (sayi < 0) {
                System.out.println("Negatif sayi giremezsin");
            }
        }

        System.out.println("Girilen sayi adedi: " + count + "\nToplam: " + sum);
    }
}