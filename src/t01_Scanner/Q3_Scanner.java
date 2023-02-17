package t01_Scanner;

import java.util.Scanner;

public class Q3_Scanner {
    public static void main(String[] args) {

        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip,
                            ucuncu bir degisken kullanmadan ikisinin degerlerini  degistirin (swap).
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1'i giriniz :");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen sayi2'yi giriniz :");
        int sayi2 = scan.nextInt();

        System.out.println("Sayi1 : " + sayi2 +
                "\nSayi2 : " + sayi1);
    }
}
