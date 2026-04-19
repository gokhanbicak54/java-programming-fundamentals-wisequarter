package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class Q04 {

    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1, 2, 3, 3, 4, 4, 3, 2, 1, 1, 0};
        int aranacakSayi = 5;

        kullanimSayisi(arr, aranacakSayi);

    }

    public static void kullanimSayisi(int[] arr, int aranacakSayi) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == aranacakSayi) {
                count++;
            }
        }

        System.out.println(aranacakSayi + " sayisi dizide " + count + " tane var");
    }
}