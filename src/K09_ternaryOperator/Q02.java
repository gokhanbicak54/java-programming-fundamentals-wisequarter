package K09_ternaryOperator;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenarlar: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();

        System.out.println((edge1 <= 0 || edge2 <= 0 || edge3 <= 0) ? "Geçersiz kenar uzunluğu" :
                (edge1 == edge2 && edge2 == edge3) ? "Eşkenar üçgen" : "Eşkenar değil");
    }
}