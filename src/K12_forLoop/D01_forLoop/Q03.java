package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic: ");
        int startingValue = scanner.nextInt();
        System.out.println("Bitis: ");
        int endingValue = scanner.nextInt();

        int sum = 0;

        if (endingValue <= startingValue) {
            System.out.println("Bitis degeri, baslangic degerine esit veya kucuk olamaz");
        } else {
            for (int i = startingValue; i <= endingValue; i++) {
                sum += i;
            }
            System.out.println("Toplam: " + sum);
        }
    }
}