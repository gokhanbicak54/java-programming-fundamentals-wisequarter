package K08_ifElseStatements.D04_nestedIfElseStatements;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun: ");
        String day = scanner.nextLine();

        if (day.equals("Pazartesi")) {
            System.out.println("Simdi calisma zamani tatile " + (6 - 1) + " gun var");
        } else if (day.equals("Sali")) {
            System.out.println("Simdi calisma zamani tatile " + (6 - 2) + " gun var");
        } else if (day.equals("Carsamba")) {
            System.out.println("Simdi calisma zamani tatile " + (6 - 3) + " gun var");
        } else if (day.equals("Persembe")) {
            System.out.println("Simdi calisma zamani tatile " + (6 - 4) + " gun var");
        } else if (day.equals("Cuma")) {
            System.out.println("Simdi calisma zamani tatile " + (6 - 5) + " gun var");
        } else if (day.equals("Cumartesi") || day.equals("Pazar")) {
            System.out.println("Simdi dinlenme zamani");
        } else {
            System.out.println("Yanlis gun yazimi yapildi");
        }
    }
}