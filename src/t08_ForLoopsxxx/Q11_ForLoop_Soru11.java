package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q11_ForLoop_Soru11 {
    public static void main(String[] args) {

        /*
        Soru 11 - Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
                  kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        String asalMi ="Girilen sayi Asal";

        for (int i = 2; i <girilenSayi ; i++) {
            if (girilenSayi%i==0) {
                asalMi = "Girilen sayi Asal Degil";
                break;
            }
        }
        System.out.println(asalMi);



    }
}
