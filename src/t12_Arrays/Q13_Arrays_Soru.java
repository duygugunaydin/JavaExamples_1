package t12_Arrays;

public class Q13_Arrays_Soru {

    public static void main(String[] args) {

        /*
      4 - String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
          o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
          Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */

        String[] strArr={"Kemal","Jonathan","Mark","Jackson","Ali"};
        String ilkHarfler = "";

        for (int i = 0; i <strArr.length ; i++) {
            if (strArr[i].endsWith("k") ||  strArr[i].endsWith("n")) {
                ilkHarfler += strArr[i].charAt(0);
                System.out.println(strArr[i]);
            }
        }
        System.out.println("Ilk harler : " + ilkHarfler);
    }
}
