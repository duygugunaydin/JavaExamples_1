package sampleQuestions;

import java.util.Scanner;

public class Q09_VarisSuresiniHesaplama {

    public static void main(String[] args) {

        /*
        Soru 18-) Girilen araç hızı ve yol kilometresinden,
                  gidilen yere varış süresini hesaplayan bir method yazalım.
                  Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim
                  ve bize varış süremizi hesaplasın
                  İpucu:
                  yol=Hız*zaman
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz");
        double girilenHiz = scan.nextDouble();
        System.out.println("Lutfen toplam kilometreyi giriniz");
        double girilenKm = scan.nextDouble();

        varisSuresiniHesaplamaMethodu(girilenHiz,girilenKm);

    }
    public static void varisSuresiniHesaplamaMethodu (double hiz,double km){

        double sure = km / hiz ;
        double dakika = sure*60;

        if (sure>=1) {
            sure = (int) sure;
            dakika = dakika % 60;
            if (dakika==0){
                System.out.println("Girdiginiz degerlere gore tahmini varis sureniz : " +
                        (int)sure + " saattir");
            }else{
                System.out.println("Girdiginiz degerlere gore tahmini varis sureniz : " +
                        (int)sure + " saat " + (int)dakika + " dakikadir");}

        } else if (sure<1) {
            System.out.println("Girdiginiz degerlere gore tahmini varis sureniz : " + (int)dakika + " dakikadir");
        }else
            System.out.println("Girdiginiz degerleri kontrol ediniz");

    }
}
