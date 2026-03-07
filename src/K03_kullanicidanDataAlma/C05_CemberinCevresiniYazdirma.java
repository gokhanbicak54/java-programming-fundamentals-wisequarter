package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C05_CemberinCevresiniYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.
        // cevre = 2* PI * yaricap , alan = PI * yaricap * yaricap

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Yaricapi giriniz: " );
        double radius = scanner.nextDouble();

        System.out.println( "Cevre: " + (2 * 3.14 * radius) );
        System.out.println( "Alan: " + (3.14 * radius * radius) );
    }
}
