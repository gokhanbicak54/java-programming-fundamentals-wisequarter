package K10_switchStatements;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ay: ");
        int number = scanner.nextInt();

        switch (number) {
            case 12, 1, 2:
                System.out.println("Kis"); break;
            case 3, 4, 5:
                System.out.println("Ilkbahar"); break;
            case 6, 7, 8:
                System.out.println("Yaz"); break;
            case 9, 10, 11:
                System.out.println("Sonbahar"); break;
            default:
                System.out.println("Hatali giris yapildi");
        }
    }
}