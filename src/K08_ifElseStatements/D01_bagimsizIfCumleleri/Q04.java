package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari: ");
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();

        if (edge1 == edge2 && edge1 == edge3 && edge1 > 0) {
            System.out.println("Eskenar ucgen");
        }
    }
}