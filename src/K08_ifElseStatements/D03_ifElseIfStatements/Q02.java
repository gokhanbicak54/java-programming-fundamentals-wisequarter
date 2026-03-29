package K08_ifElseStatements.D03_ifElseIfStatements;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilo: ");
        double weight = scanner.nextDouble();

        System.out.println("Boy(cm): ");
        double height = scanner.nextDouble();

        double vki = (weight * 10000) / (height * height);

        if (vki > 30) {
            System.out.println("Obez");
        } else if (vki > 25) {
            System.out.println("Kilolu");
        } else if (vki > 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayif");
        }
    }
}