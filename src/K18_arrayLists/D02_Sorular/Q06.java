package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Verilen pozitif bir tamsayiyi, tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int number = scanner.nextInt();

        System.out.println(pozitifBolenler(number));
    }

    public static List<Integer> pozitifBolenler(int sayi) {

        List<Integer> pozitifBolenlerSerisi = new ArrayList<>();

        if (sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    pozitifBolenlerSerisi.add(i);
                }
            }
        } else {
            System.out.println("Negatif sayi girdiniz");
        }

        return pozitifBolenlerSerisi;
    }
}