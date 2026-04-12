package K15_doWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true, değilse false yazdırınız.
        //	Ornek :  input : 16 (4*4) , output: true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int baslangic = 1;
        boolean tamKareMi = false;

        do {
            // Eğer sayının karekökü tam sayı ise (örn: 4*4 == 16)
            if (baslangic * baslangic == sayi) {
                tamKareMi = true;
                break; // Sonucu bulduğumuz için döngüden çıkabiliriz
            }

            baslangic++;

        } while (baslangic * baslangic <= sayi); // Kare sayıdan küçük olduğu sürece dene

        System.out.println(tamKareMi);
    }
}