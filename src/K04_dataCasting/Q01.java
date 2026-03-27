package K04_dataCasting;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Int giriniz");
        int number1 = scanner.nextInt();

        System.out.println("Double giriniz");
        double number2 = scanner.nextDouble();

        System.out.println("Byte giriniz");
        byte number3 = scanner.nextByte();

        System.out.println("int: " + number1 + "\ndouble: " + number2 + "\nbyte: " + number3);
    }
}