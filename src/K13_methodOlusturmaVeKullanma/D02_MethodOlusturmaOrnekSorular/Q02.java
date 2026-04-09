package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        // isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input: isim: Ali  soyisim: YILMAZ     output: Ali Yilmaz

        System.out.println(isimDuzenleme("gokhan", "bicak"));
    }

    public static String isimDuzenleme(String isim, String soyisim) {

        String arrangedName = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() +
                                " " + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

        return arrangedName; // return'u string kısmına yazıp direkt döndürebilirim
    }
}