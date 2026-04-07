package K12_forLoop.D02_nestedForLoop;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        /*

         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= satir * 2; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}