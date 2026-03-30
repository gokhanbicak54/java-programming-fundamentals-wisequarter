package K09_ternaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayilar: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println((number1 == number2) ? "2 sayi esit" : (number1 > number2) ? number2 : number1);
    }
}