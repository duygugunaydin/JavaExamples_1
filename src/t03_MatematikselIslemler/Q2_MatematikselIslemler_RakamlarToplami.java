package t03_MatematikselIslemler;

import java.util.Scanner;

public class Q2_MatematikselIslemler_RakamlarToplami {
    public static void main(String[] args) {

        //  Kullanicidan 4 basamakli pozitif bir tamsayi alin
        // sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        int rakamlarToplami = 0 ;
        int birlerBasamagi = 0 ;

        birlerBasamagi = girilenSayi%10 ;
        rakamlarToplami = rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        birlerBasamagi = girilenSayi%10 ;
        rakamlarToplami = rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        birlerBasamagi = girilenSayi%10 ;
        rakamlarToplami = rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        birlerBasamagi = girilenSayi%10 ;
        rakamlarToplami = rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
