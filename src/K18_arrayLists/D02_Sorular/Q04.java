package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Verilen pozitif bir n tamsayisini alarak, bize ilk n tane
        // Fibonacci sayisini bir list olarak donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int number = scanner.nextInt();

        System.out.println(fibonacciSerisiOlusturma(number));
    }

    public static List<Integer> fibonacciSerisiOlusturma(int sayi) {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (sayi <= 0) {
            System.out.println("Pozitif bir deger girmelisiniz...");
        } else if (sayi == 1) {
            fibonacciSerisi.add(0);
        } else if (sayi == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);

            for (int i = 2; i < sayi; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));
            }
        }

        return fibonacciSerisi;
    }
}