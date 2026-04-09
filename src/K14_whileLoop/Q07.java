package K14_whileLoop;

public class Q07 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        usHesaplama(4, 3);
        usHesaplama(3, 6);
    }

    public static void usHesaplama(double sayi, int us) {

        double result = 1;

        while (us > 0) {
            result *= sayi;
            us--;
        }

        System.out.println("Sonuc: " + result);
    }
}