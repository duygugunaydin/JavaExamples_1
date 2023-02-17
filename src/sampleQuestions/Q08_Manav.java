package sampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q08_Manav {

    static double fiyat ;

    public static void main(String[] args) {

        /*
           Basit bir 5 ürünlü manav alisveris programi yaziniz.

        1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        2. Adim : Baska bir urun almak isteyip istemedigini sor.
                  istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                  Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
         */


        System.out.println("***** GUNAYDIN MARKET'E HOSGELDİNİZ *****");
        menu();

    }
    private static void menu() {

        Scanner scan = new Scanner(System.in);

        List<String> urunListesi = new ArrayList<>(Arrays.asList("cilek","muz","cagla","erik","seftali"));

        List<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(40,35,50,50,35));

        char choose;

        do {
            for (int i = 0; i <urunListesi.size() ; i++) {
                System.out.println(i+1 + ". urun : "+urunListesi.get(i)+ " - Fiyati : " + fiyatListesi.get(i)+ " TL");
            }
            System.out.println("Lutfen almak istediginiz urunun numarasini giriniz : ");
            int urunNo = scan.nextInt()-1;

            while (!(0<=urunNo && urunNo<5)){
                System.out.println("Hatali urun no girişi! \nLutfen almak istediginiz urunun numarasini tekrar giriniz");
                urunNo = scan.nextInt()-1;
            }

            System.out.println("Kac kilo almak istiyorsunuz : ");
            double kilo = scan.nextDouble();

            while (kilo<=0) {
                System.out.println("Hatali kilo girişi! \nLutfen kilo bilgisini tekrar giriniz");
                kilo = scan.nextDouble();
            }
            fiyat += kilo*fiyatListesi.get(urunNo);

            System.out.println("Baska urun almak istiyor musunuz? E/H ");
            choose = scan.next().charAt(0);

        }while (choose=='e' || choose=='E');

        System.out.println("Aldiginiz urunlerin toplam fiyati : " + fiyat + " TL");
    }
}
