package K04_dataCasting;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz: John
        // Soyisminiz: Doe
        // Yasiniz: 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Isim: ");
        String name = scanner.next();

        System.out.println("Soyisim: ");
        String surname = scanner.next();

        System.out.println("Yas: ");
        int age = scanner.nextInt();

        System.out.println("Isminiz: " + name + "\nSoyisminiz: "
                            + surname + "\nYasiniz: "
                            + age + "\nKaydiniz basariyla tamamlanmistir.");
    }
}