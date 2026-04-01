package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle: ");
        String sentence = scanner.nextLine();

        if (sentence.contains("ev") && sentence.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (sentence.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (sentence.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }
    }
}