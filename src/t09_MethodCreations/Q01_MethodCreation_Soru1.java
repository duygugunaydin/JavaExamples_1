package t09_MethodCreations;

import java.util.Scanner;

public class Q01_MethodCreation_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
                baslangic index'i dahil, bitis index'i haric olacak sekilde
                aradaki harfleri yazdiran bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
                hata mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */

        aradakiHarleriYazdir();


    }

    public static void aradakiHarleriYazdir (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String girilenstr = scan.nextLine();
        System.out.println("Lutfen baslangic ve bitis indexlerini giriniz");
        int baslangicIndex = scan.nextInt();
        int bitisIndex = scan.nextInt();

        if (baslangicIndex>bitisIndex)
            System.out.println("Baslangic indexi bitis index'inden kucuk olmali");
        else if (baslangicIndex>=girilenstr.length() || bitisIndex>girilenstr.length())
            System.out.println("Girediginiz index metnin uzunlugundan daha buyuk");
        else
            System.out.println(girilenstr.substring(baslangicIndex,bitisIndex));



    }
}
