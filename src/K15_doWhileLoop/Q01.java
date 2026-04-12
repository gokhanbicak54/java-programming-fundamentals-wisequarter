package K15_doWhileLoop;

public class Q01 {

    public static void main(String[] args) {

        // ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char letter = 'k';

        do {
            System.out.print(letter + " ");
            letter++;
        } while (letter <= 't');
    }
}