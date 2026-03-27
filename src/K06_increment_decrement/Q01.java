package K06_increment_decrement;

public class Q01 {

    public static void main(String[] args) {

        // Asagidaki kod calistirilirsa konsolda gorunecek sonuclar neler olur?

        int a = 10;
        System.out.println("a: " + ++a); // 11

        int b = a++;
        System.out.println("b: " + b); // 11

        int c = b++ + a;
        System.out.println("c: " + c); // 23

        System.out.println("Toplam: " + (a + b + c)); // 47
    }
}