package K11_stringManipulations.D05_SoruCozumu;

public class Q07 {

    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €”
        // output : 26.70 €

        String price1 = "15.30 €";
        String price2 = "11.40 €";

        int spaceIndex = price1.indexOf(" "); // 5

        String currency = price1.substring(spaceIndex); //  €

        price1 = price1.replaceAll("\\D", ""); // 1530
        price2 = price2.replaceAll("\\D", ""); // 1140

        double urun1 = Double.parseDouble(price1) / 100;
        double urun2 = Double.parseDouble(price2) / 100;

        System.out.println("Toplam fiyat: " + (urun1 + urun2) + currency);
    }
}