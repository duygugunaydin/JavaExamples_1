package t01_Scanner;

import java.util.Scanner;

public class Q3_Scanner_IkinciCozum {
    public static void main(String[] args) {

        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip,
                            ucuncu bir degisken kullanmadan ikisinin degerlerini  degistirin (swap).
         */

        // >> ikinci yontem

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi1'i giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("lutfen sayi2'yi giriniz");
        int sayi2 = scan.nextInt();


        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;


        System.out.println("swap'tan sonra sayi1:" + sayi1);
        System.out.println("swap'tan sonra sayi2:" + sayi2);
    }
}
