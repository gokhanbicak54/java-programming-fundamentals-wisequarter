package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(fibonacciSerisiOlusturma(sayi));
    }

    public static List<Integer> fibonacciSerisiOlusturma(int sayi) {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (sayi < 0) {
            System.out.println("ust sinir negatif olamaz");
        } else if (sayi == 0) {
            fibonacciSerisi.add(0);
        } else if (sayi == 1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int i = 3;
            int birOncekiEleman = fibonacciSerisi.get(i - 1);
            int ikiOncekiEleman = fibonacciSerisi.get(i - 2);

            while (birOncekiEleman + ikiOncekiEleman <= sayi) {
                fibonacciSerisi.add(birOncekiEleman + ikiOncekiEleman);
                i++;
                birOncekiEleman = fibonacciSerisi.get(i - 1);
                ikiOncekiEleman = fibonacciSerisi.get(i - 2);
            }
        }

        return fibonacciSerisi;
    }
}