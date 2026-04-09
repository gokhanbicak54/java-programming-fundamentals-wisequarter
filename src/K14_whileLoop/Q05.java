package K14_whileLoop;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin girim: ");
        String str = scanner.nextLine();

        String tersKelime = "";
        int indeks = str.length() - 1;

        while (indeks >= 0) {
            tersKelime += str.charAt(indeks);
            indeks--;
        }

        System.out.println("Kelimenin tersi: " + tersKelime);
    }
}