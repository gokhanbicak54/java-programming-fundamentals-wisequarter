package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun.

        List<String> isimler = stringListOlustur();
        System.out.println("Girilen isimler: " + isimler);
    }

    public static List<String> stringListOlustur() {

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String girilenIsim = "";

        do {
            System.out.println("Isim giriniz: ");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")) {
                isimler.add(girilenIsim);
            }

        } while (!girilenIsim.equalsIgnoreCase("q"));

        return isimler;
    }
}