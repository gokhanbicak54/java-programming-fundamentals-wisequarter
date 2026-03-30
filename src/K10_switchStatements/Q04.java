package K10_switchStatements;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        // I: International  S: Software T: Testing Q: Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().toUpperCase(Locale.ENGLISH).charAt(0);

        switch (letter) {
            case 'I':
                System.out.println("I: International"); break;
            case 'S':
                System.out.println("S: Software"); break;
            case 'T':
                System.out.println("T: Testing"); break;
            case 'Q':
                System.out.println("Q: Qualifications"); break;
            case 'B':
                System.out.println("B: Board"); break;
            default:
                System.out.println("Yanlis harf girisi yapildi");
        }
    }
}