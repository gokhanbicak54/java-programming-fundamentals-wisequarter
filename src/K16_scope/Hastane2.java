package K16_scope;

public class Hastane2 {

    static String hastaneIsmi  = "Yildiz Hastanesi";
    static String hastaneAdresi = "Yenimahalle";
    static String bashekim = "Doktor Ali";
    String perIsmi = "Isim atanmadi";
    String perAdres = "Adres atanmadi";
    String perTel ="Telefon atanmadi";

    public static void main(String[] args) {

        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(hastaneAdresi); // Yenimahalle
        System.out.println(bashekim); // Doktor Ali

        Hastane2 per1 = new Hastane2();

        per1.perIsmi = "Hatice";
        per1.perTel = "5443454545";
        per1.perAdres = "Balgat";
        System.out.println(per1.hastaneAdresi); // Yildiz Hastanesi
        System.out.println(per1.bashekim); // Yenimahalle

        Hastane2 per2 = new Hastane2();

        per2.perIsmi = "Cansu";
        per2.perTel = "5343423221";
        per2.perAdres = "Yenimahalle";
        per2.hastaneAdresi = "Kizilay";
        per2.bashekim = "Dr. Kemal";

        Hastane2 per3 = new Hastane2();

        per3.perAdres = "Cankaya";
        per2.bashekim = "Dr. Leyla";
        System.out.println(per1.hastaneAdresi); // Kizilay
        System.out.println(per2.bashekim); // Dr. Leyla
        System.out.println(per3.hastaneAdresi); // Kizilay
    }
}