package K08_ifElseStatements.D03_ifElseIfStatements;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        // 4 ile bolunemeyen yillar artik yil degildir
        // 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        // 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yil: ");
        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.println("Artik yil degildir");
        } else if (year % 100 != 0) {
            System.out.println("Artik yil");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degildir");
        }
    }
}