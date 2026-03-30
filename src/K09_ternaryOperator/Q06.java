package K09_ternaryOperator;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        System.out.println((number < 0) ? (-number) : number);
    }
}