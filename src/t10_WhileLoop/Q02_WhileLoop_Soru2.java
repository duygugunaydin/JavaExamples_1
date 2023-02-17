package t10_WhileLoop;

import java.util.Scanner;

public class Q02_WhileLoop_Soru2 {
    public static void main(String[] args) {

        /*
             Soru 2-
             While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int toplam = 0;
        int birlerBas = 0;

        while (sayi > 0) {

            birlerBas = sayi % 10;
            toplam += birlerBas;
            sayi /= 10;

        }
        System.out.println("Girilen sayinin rakamlar toplami : " + toplam);

    }
}
