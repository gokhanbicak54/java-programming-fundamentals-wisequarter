package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip
        // asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Isim giriniz: " );
        String name = scanner.nextLine();

        System.out.println( "Soyisim giriniz: " );
        String surname = scanner.nextLine();

        System.out.println( "Yasini giriniz: " );
        int age = scanner.nextInt();

        System.out.println(
                "Girilen bilgiler: " +
                name.charAt(0) + " " +
                surname + ", " +
                age
        );
    }
}
