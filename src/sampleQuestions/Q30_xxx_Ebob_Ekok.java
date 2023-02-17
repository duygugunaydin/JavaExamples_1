package sampleQuestions;

import java.util.Scanner;

public class Q30_xxx_Ebob_Ekok {
    public static void main(String[] args) {

        /*
        Soru 22-) Kullanıcıdan 2 tamsayı girmesini isteyin,
                  ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
                  Giriş :
                  30 ve 40
                  Beklenen Çıktı:
                  30 ve 40 için EBOB= 10
                  30 ve 40 için EKOK= 120
                  ipucu:
                  Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların
                  EBOB'una bölünerek bulunabilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int ebob = 1;
        int ekok = 1;
        int kucukSayi = sayi1<sayi2 ? sayi1 : sayi2;
        int buyukSayi = sayi1<sayi2 ? sayi2 : sayi1;

        for (int i = 1; i < kucukSayi; i++) {
            if (sayi1%i==0 && sayi2%i==0)
                ebob = i;
        }

        System.out.println( sayi1 + " ve " + sayi2 + " için EBOB= " + ebob);
        System.out.println( sayi1 + " ve " + sayi2 + " için EKOK= " + (sayi1*sayi2/ebob) );


        System.out.println("=========2.Yontem========");

        if (sayi1<sayi2) {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        for (int i = kucukSayi; i > 1 ; i--) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
                break;
            }
        }
        for (int i = buyukSayi; i <= sayi1*sayi2 ; i+=buyukSayi) {
            if (i%sayi1==0 && i%sayi2==0){
                ekok=i;
                break;
            }
        }
        System.out.println("ekok = " + ekok);
        System.out.println("ebob = " + ebob);


    }

}
