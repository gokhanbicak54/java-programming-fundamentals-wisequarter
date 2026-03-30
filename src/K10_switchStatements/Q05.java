package K10_switchStatements;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlis sayi girildi");
        }
    }
}