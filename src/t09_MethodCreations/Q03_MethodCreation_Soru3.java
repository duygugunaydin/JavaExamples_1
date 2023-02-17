package t09_MethodCreations;

import java.util.Scanner;

public class Q03_MethodCreation_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
                Girilen sayinin asal sayi olup olmadigini kontrol edip,
                sonuc olarak “asal sayi” veya “asal sayi degil”
                sonuclarini donduren bir method olusturun.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (asalMi(girilenSayi)) System.out.println("Girilen sayi Asal");
        else System.out.println("Girilen sayi Asal degil");


    }

    public static boolean asalMi (int input){

        boolean asalMi = true;

        for (int i = 2; i < input; i++) {
            if (input%i==0) {
                asalMi = false;
                break;
            }
        }

        return asalMi;
    }
}
