package K10_switchStatements;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
        // 29 ==> yirmi dokuz
        // 87 ==> seksen yedi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        if (number >= 10 && number < 100) {
            int birlerBasamagi = number % 10;
            int onlarBasamagi = number / 10;

            switch (onlarBasamagi) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            System.out.print(" ");

            switch (birlerBasamagi) {
                case 0:
                     break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }
        } else {
            System.out.println("Yanlis sayi girildi");
        }
    }
}