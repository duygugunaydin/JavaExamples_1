package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q06_ForLoop_Soru6 {
    public static void main(String[] args) {

        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
                bu sayinin faktoryel degerini hesaplayin.
                Konsolda faktoryel hesabinin yapilisini da yazdirin.
                Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
                     6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi girirniz");
        int girilenSayi = scan.nextInt();

        int faktoriyel =1;
        String str = "";

        for (int i = girilenSayi; i >= 1 ; i--) {
            faktoriyel *= i ;
            str += i + " * ";
        }
        System.out.println(girilenSayi + "! = " + str.substring(0,str.length()-2) + "= " + faktoriyel );


    }
}
