package t11_DoWhileLoop;

import java.util.Scanner;

public class Q02_DoWhileLoop_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
                kontrol edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
                sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan = new Scanner(System.in);
        String girilenSifre ;
        int flag = 0 ;

        do {
            System.out.println("Lutfen gecerli bir sifre giriniz");
            girilenSifre = scan.next();

            if (kucukHarfIceriyorMu(girilenSifre)!=0) { // sifira esit degilse icermiyordur
                flag++;                                 // bir ceza puan eklenecek
                System.out.println("Sifre kucuk harf icermelidir");
            }

            if (buyukHarfIceriyorMu(girilenSifre)!=0){ // sifira esit degilse icermiyordur
                flag++;
                System.out.println("Sifre buyuk harf icermelidir");
            }

            if (ozelKarakterIceriyorMu(girilenSifre)!=0){ // sifira esit degilse icermiyordur
                flag++;
                System.out.println("Sifre ozel karakter icermelidir");
            }

            if (girilenSifre.length()<8){
                flag++;
                System.out.println("Sifre en az 8 karakter olmalidir.");
            }
        }while (flag!=0);
        System.out.println("Sifreniz kabul edilmistir");

    }
    public static int kucukHarfIceriyorMu (String sifre){

        int sayac = 0 ;

        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                sayac++;
                break;
            }
        }
        if (sayac==0)
            return 1; // sayac sifirsa,kucuk harf icermiyor demektir, 1 ceza puani yuklenecek
        else
            return 0;  // sayac sifirsa, iceriyor, sorun yok
    }

    public static int buyukHarfIceriyorMu (String sifre){
        int sayac = 0 ;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                sayac++;
                break;
            }
        }
        if (sayac==0)
            return 1; // sayac sifirsa,buyuk harf icermiyor demektir, 1 ceza puani yuklenecek
        else
            return 0; // sayac sifirsa, iceriyor, sorun yok
    }

    public static int ozelKarakterIceriyorMu (String sifre){
        int sayac = 0 ;
        String ozelKarakterler = "!'^+%&/()=?_>£#$½{[]}|@</*-+,;:.´¨~";
        for (int i = 0; i <sifre.length() ; i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                sayac++;
                break;
            }
        }
        if (sayac==0)
            return 1; // sayac sifirsa,ozel krk icermiyor demektir, 1 ceza puani yuklenecek
        else
            return 0; // sayac sifirsa, iceriyor, sorun yok
    }
}
