package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q05_ForLoop_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5-
                Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi girirniz");
        int girilenSayi = scan.nextInt();

        int faktoriyel =1;

        for (int i = 1; i <= girilenSayi ; i++) {
            faktoriyel *= i ;
        }
        System.out.println("Girdiginiz sayinin faktoriyeli : " + faktoriyel);

    }
}
