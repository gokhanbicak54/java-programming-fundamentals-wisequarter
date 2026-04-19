package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class Q01 {

    public static void main(String[] args) {

        // What is the result of the following?

        int[] random = {6, -4, 12, 0, -10};

        int x = 12;
        int y = Arrays.binarySearch(random, x);

        System.out.println(y); // 2
    }
}