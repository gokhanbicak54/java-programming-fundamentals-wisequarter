package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class Q06 {

    public static void main(String[] args) {

        // Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"aliş", "ece", "ayse", "gokhan", "zeynep", "tugce", "abdullah"};

        enKisaEnUzunKelimeYazdirma(isimler);
    }

    public static void enKisaEnUzunKelimeYazdirma(String[] isimler) {

        String enKisa = isimler[0];
        String enUzun = isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length() < enKisa.length()) {
                enKisa = isimler[i];
            }

            if (isimler[i].length() > enUzun.length()) {
                enUzun = isimler[i];
            }
        }

        System.out.println("En kisa kelime: " + enKisa);
        System.out.println("En uzun kelime: " + enUzun);
    }
}