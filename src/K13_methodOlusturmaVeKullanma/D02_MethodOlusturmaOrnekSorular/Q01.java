package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index'i dahil,
        // bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        // - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        // - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

        String str = "Java candir";
        int starting = 1;
        int ending = 8;

        if (starting < 0 || ending < 0 || starting >= str.length() || ending >= str.length()) {
            System.out.println("Hatali indeks girisi yaptiniz");
        } else if (starting > ending) {
            System.out.println("Baslangic indeksi bitis indeksinden buyuk olamaz");
        } else {
            for (int i = starting; i < ending; i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}