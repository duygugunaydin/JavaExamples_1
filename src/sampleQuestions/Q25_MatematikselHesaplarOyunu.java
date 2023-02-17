package sampleQuestions;

import java.util.Random;
import java.util.Scanner;

public class Q25_MatematikselHesaplarOyunu {

    static  int sonuc ;
    static  int puan ;
    public static void main(String[] args) {

        /*
     Kullanıcıların matematik hesaplamalarını geliştirmelerine yardımcı olacak bir test uygulaması tasarlayacaksınız.
     Uygulamanın amacı, sınırlı bir süre içinde,
        maksimum sayıda soruyu doğru bir şekilde çözmektir.
     Bu uygulama, rasgele iki ve üç işlemli; yine rasgele birkaç tamsayının matematik hesaplamasını oluşturmalıdır.
        1- ve ardından soruyu yazdırır
        2- ve kullanıcıdan yanıtı alır.
        3- Kullanıcı cevabı doğru yazarsa;
        program, süre bitene kadar bir sonraki rastgele soruyu üretir.
        -- Oyun için iki seviye uygulayın:
        a) Birinci düzey, rasgele oluşturulan maks 2 basamaklı 2 tam sayı
        veya rakamı toplama ve çıkarma işlemlerinden rasgele birine tabi tutup sorun
        ve cevabı isteyin 5 doğru cevapta 2. düzeye geçin
        b) İkinci düzey, rasgele oluşturulan maks 2 basamaklı 3 tam sayı
        veya rakamı birbiriyle toplama , çıkarma , çarpma , bölme  işlemlerinden rasgele birine
        ve ya birkaçına tabi tutup sorun ve cevabı isteyin 5 doğru ya da program
        boyunca toplam 3 yanlış cevapta programı sonlandırın
        4. Programın sonunda doğru cevaplanan toplam işlem sayısını puanlayarak puanınını gösterin.
        Puanlar: ilk düzey soru başına puan : 5
                 ikinci düzey soru başına puan 10
         */

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int countYanlisCevap=0 ;
        boolean devam = true;
        int girilensonuc ;

        do {
            System.out.println("Sorunuz olusturuluyor ...");
            int soruSayisi = rnd.nextInt(1,5);

            if (count<6) {
                basitSoruUretmeMethodu(soruSayisi);
                girilensonuc = scan.nextInt();
                if (girilensonuc == sonuc) {
                    count++;
                    puan +=5;
                    System.out.println("Tebrikler, bildiniz ");
                }
                else {
                    countYanlisCevap++;
                    System.out.println("XXX cevabiniz yanlis! Dogru cevap : " + sonuc +
                            "\nKalan yanlis cevap hakkiniz : " + (3-countYanlisCevap));
                }
            }else{
                zorSoruUretmeMethodu(soruSayisi);
                girilensonuc = scan.nextInt();
                if (girilensonuc == sonuc) {
                    count++;
                    puan +=10;
                    System.out.println("Tebrikler, bildiniz ");
                }
                else {
                    countYanlisCevap++;
                    System.out.println("!!! cevabiniz yanlis  !!!  Dogru cevap : " + sonuc +
                            "\nKalan yanlis cevap hakkiniz : " + (3-countYanlisCevap));
                }
            }
            sonuc=0;

        }while (countYanlisCevap<=3 || count>=10);

        if (count>=10) {
            System.out.println("Tebrikler hic yanlissiz oyunu tamamladiniz! Puaniniz : " + puan);
        } else if (countYanlisCevap>=3) {
            System.out.println("3 yanlis cevapla "+ count + ". soruda elendiniz. Puaniniz : " + puan);
        }



    }

    private static int basitSoruUretmeMethodu (int soruSayisi){

        Random rnd = new Random();
        int sayi1 ;
        int sayi2 ;

        switch (soruSayisi){
            case 1 :
                sayi1 = rnd.nextInt(1,100);
                sayi2 = rnd.nextInt(1,100);
                sonuc = sayi1+sayi2;
                System.out.println(sayi1 + " + " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 2 :
                sonuc = 1;
                sayi1 = rnd.nextInt(1,10);
                sayi2 = rnd.nextInt(1,10);
                sonuc  = sayi1*sayi2;
                System.out.println(sayi1 + " * " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 3 :
                sayi1 = rnd.nextInt(50,100);
                sayi2 = rnd.nextInt(1,50);
                sonuc = sayi1-sayi2;
                System.out.println(sayi1 + " - " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 4 :
                sayi1 = rnd.nextInt(50,100);
                sayi2 = rnd.nextInt(1,50);
                sonuc = sayi1/sayi2;
                System.out.println(sayi1 + " / " + sayi2 + " isleminin sonucu NEDİR ? : (sadece tam sayi kismi) ");
                break;
            default:
                System.out.println("opps birseyler ters gitti.");
        }
        return sonuc;
    }
    private static int zorSoruUretmeMethodu (int soruSayisi) {

        Random rnd = new Random();
        int sayi1;
        int sayi2;

        switch (soruSayisi) {
            case 1:
                sayi1 = rnd.nextInt(100, 1000);
                sayi2 = rnd.nextInt(100, 1000);
                sonuc = sayi1 + sayi2;
                System.out.println(sayi1 + " + " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 2:
                sonuc = 1;
                sayi1 = rnd.nextInt(10, 100);
                sayi2 = rnd.nextInt(10, 100);
                sonuc = sayi1 * sayi2;
                System.out.println(sayi1 + " * " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 3:
                sayi1 = rnd.nextInt(500, 1000);
                sayi2 = rnd.nextInt(100, 500);
                sonuc = sayi1 - sayi2;
                System.out.println(sayi1 + " - " + sayi2 + " isleminin sonucu NEDİR ? : ");
                break;
            case 4:
                sayi1 = rnd.nextInt(500, 1000);
                sayi2 = rnd.nextInt(100, 500);
                sonuc = sayi1 / sayi2;
                System.out.println(sayi1 + " / " + sayi2 + " isleminin sonucu NEDİR ? : (sadece tam sayi kismi) ");
                break;
            default:
                System.out.println("opps birseyler ters gitti.");
        }
        return sonuc;
    }

    /*
    Kullanıcıların matematik hesaplamalarını geliştirmelerine yardımcı olacak bir test uygulaması tasarlayacaksınız.
Uygulamanın amacı, sınırlı bir süre içinde maksimum sayıda soruyu doğru bir şekilde çözmektir.
Bu uygulama, rasgele iki ve üç işlemli yine rasgele birkaç tamsayının matematik hesaplamasını oluşturmalıdır.
1- ve ardından soruyu yazdırır ve
2- kullanıcıdan yanıtı alır.
3- Kullanıcı cevabı doğru yazarsa; program, süre bitene kadar bir sonraki rastgele soruyu üretir.

1. Başlangıç ​​süresi olarak 1,5 dakika verin ve arka arkaya 5 soru doğruysa toplam süreyi 5 saniye artırın
2. Süre bitince oyunu sonlandırın.
3. Oyun için iki seviye uygulayın:
a) Birinci düzey, rasgele oluşturulan maks 2 basamaklı 2 tam sayı veya rakamı toplama ve çıkarma işlemlerinden rasgele birine tabi tutup sorun ve cevabı isteyin 5 doğru cevapta 2. düzeye geçin
b) İkinci düzey, rasgele oluşturulan maks 2 basamaklı 3 tam sayı veya rakamı birbiriyle toplama , çıkarma , çarpma , bölme  işlemlerinden rasgele birine ve ya birkaçına tabi tutup sorun ve cevabı isteyin 5 doğru ya da program boyunca toplam 3 yanlış cevapta programı sonlandırın

4. Programın sonunda doğru cevaplanan toplam işlem sayısını puanlayarak puanınını gösterin.
Puanlar: ilk düzey soru başına puan : 5
ikinci düzey soru başına puan 10

Soru normalde cok daha kapsamlıydı süre sınırı falan vardı ama
henüz süre oluşturmayla ilgili bir method görmediğimizden soruyu tekrar düzenledim son hali bu

baya if else ler looplar scannerlar sayaçlar falan var
çözmeye çalışıp akşamda bu soru üzerinmde konuşursak süper olur diye düşündüm

1 ve 2 deki başlangıç süresi falan olan kısımlara takılmayın
     */
}
