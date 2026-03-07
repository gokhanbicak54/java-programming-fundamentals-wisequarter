package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formatta yazdirin.
        //		    Isminiz : John
        //		    Soyisminiz : Doe
        //		    Yasiniz : 44
        //		    Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Isminiz: " );
        String name = scanner.nextLine();

        System.out.println( "Soyisminiz: " );
        String surname = scanner.nextLine();

        System.out.println( "Yasiniz: " );
        int age = scanner.nextInt();

        System.out.println(
                        "Isminiz: " + name +
                        "\nSoyisminiz: " + surname +
                        "\nYasiniz: " + age +
                        "\nKaydiniz basariyla tamamlanmistir."
        );
    }
}
