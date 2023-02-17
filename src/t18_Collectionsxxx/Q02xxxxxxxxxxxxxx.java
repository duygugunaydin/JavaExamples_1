package t18_Collectionsxxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02xxxxxxxxxxxxxx {
    public static void main(String[] args) {

        /*
           Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin,
                  not grime islemi bittiginde Q’ya basmalidir.
                  Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin :
                  not ortalamasi : ...
                  ogrenci sayisi : ...
                  ortalama altindaki ogrenci sayisi : ...
                  ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ...
         */

        List<Double> notlarList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        double not ;
        double notOrt = 0 ;
        int ogrSayisi = 0 ;

        try {
            do {
                System.out.println("Lutfen notu giriniz, bitirmek icin q'ya basiniz : ");
                not = scan.nextDouble();
                notlarList.add(not);
                ogrSayisi++;
                notOrt += not/ogrSayisi;


            }while (!(not=='q' || not=='Q'));

        } catch (Exception e) {
            System.out.println("Notlariniz basari ile kaydedilmistir.");
        }
        int ortAltOgrSayi = 0;
        int ort10puanAlt = 0;
        int ort10puanUst = 0;

        for (int i = 0; i <notlarList.size() ; i++) {
            if (notlarList.get(i)<notOrt)
                ortAltOgrSayi++;
            if (notlarList.get(i)<notOrt-10)
                ort10puanAlt++;
            if (notlarList.get(i)<notOrt+10)
                ort10puanUst++;
        }
        System.out.println("Not Ortalamasi : " + (notOrt)
                + "\nOgrenci Sayisi : " + ogrSayisi
                + "\nOrtalama Altindaki Ogrenci Sayisi : " + ortAltOgrSayi
                + "\nOrtalamanin 10 puan altında olan ogrenci sayisi : " + ort10puanAlt
                + "\nOrtalamanin 10 puan altında olan ogrenci sayisi : " + ort10puanUst );

    }
}
