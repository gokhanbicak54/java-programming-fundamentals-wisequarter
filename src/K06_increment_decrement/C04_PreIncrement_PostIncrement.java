package K06_increment_decrement;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

          /*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa,
            ikisi de ayni islevi gorur, a'nin degerini bir artirirlar.

            ayni sekilde bir satirda sadece --a veya a-- varsa
            ayni islevi yapip a'yi bir azaltirlar.

            Farklari ++ ve -- kullanilan satirda
            baska bir islem daha yapilirsa ortaya cikar

            ++ veya -- 'nin diger islemden once mi sonra mi yapilacagina
            ++ veya -- 'nin variable'dan once veya sonra yazilmasina
            gore karar veririz.

            --a , ++b   ++ veya -- variable'dan once yazilmissa
                        once artirma veya azaltma yapilir, sonra diger islem yapilir

            a++ , b--   ++ veya -- variable'dan sonra yazilmissa
                        artirma veya azaltma sonra yapilir, once diger islem yapilir

         */

        int a = 20;
        int b = 40;

        a++;
        b--;
        System.out.println("35.satirda a: " + a + ", b: " + b); // a: 21, b : 39

        ++a;
        --b;
        System.out.println("39.satirda a: " + a + ", b: " + b); // a: 22, b : 38

        System.out.println(a++);//22

        System.out.println("43.satirda a: " + a + ", b: " + b); // a: 23, b: 38

        System.out.println(++a);// 24

        System.out.println("47.satirda a: " + a + ", b: " + b); // a: 24, b: 38

        System.out.println(b--);// 38

        System.out.println("51.satirda a: " + a + ", b: " + b); // a: 24, b: 37

        System.out.println(--b);// 36

        System.out.println("55.satirda a: " + a + ", b: " + b); // a: 24, b: 36

        a = b++;
        System.out.println("58.satirda a: " + a + ", b: " + b); // a: 36, b: 37

        a= ++b;
        System.out.println("61.satirda a: " + a + ", b: " + b); // a: 38, b: 38

        b = a++ / 2;
        System.out.println("64.satirda a: " + a + ", b: " + b); // a: 39, b: 19

        b = ++a / 2;
        System.out.println("67.satirda a: " + a + ", b: " + b); // a: 40, b: 20
    }
}
