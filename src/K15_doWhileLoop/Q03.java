package K15_doWhileLoop;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek :  input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int karekok = 1;
        boolean tamKareMi = false;

        do {
            if (karekok * karekok == sayi) {
                tamKareMi = true;
            }
            karekok++;

        } while (karekok * karekok <= sayi);
        System.out.println(tamKareMi);
    }
}