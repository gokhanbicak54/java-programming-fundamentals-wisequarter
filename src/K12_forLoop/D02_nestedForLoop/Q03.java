package K12_forLoop.D02_nestedForLoop;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        /*

         * * * * * * * *
         * * * * * *
         * * * *
         * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = satir; i >= 1; i -= 2) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}