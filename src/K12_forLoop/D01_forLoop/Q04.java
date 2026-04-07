package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic: ");
        int startingValue = scanner.nextInt();
        System.out.println("Bitis: ");
        int endingValue = scanner.nextInt();

        int sum = 0;

        if (startingValue < endingValue) {
            for (int i = startingValue; i <= endingValue; i++) {
                sum += i;
            }
            System.out.println("Toplam: " + sum);
        } else if (endingValue < startingValue) {
            for (int i = endingValue; i <= startingValue; i++) {
                sum += i;
            }
            System.out.println("Toplam: " + sum);
        } else {
            System.out.println("2 deger esit olamaz");
        }
    }
}