package sampleQuestions;

import java.util.Scanner;

public class Q26_HesapMakinesi {

         /*
            30 Aralik 2023 saat 22.00
            Problem Tanımı :
            Basit 4 işlem yapan bir hesap makinesi kodlayınız....
            Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
            Kullanicidan iki sayi girmesini isteyiniz.
            Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

            ***cikan sonucla yeni bi islem yaptirmayi sectirip isleme devam ettirin
            ***hesap makinesi ve islemler methodla calissin.
         */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String islem ;
        double sayi1 ;
        double sayi2 ;
        String devamMi ;

        do {
            System.out.println("Lutfen yapmak istediginiz islemin sembolunu giriniz : \n[ +  -  *  / ]");
            islem  = scan.next().substring(0,1);
            while (!"+-*/".contains(islem)){
                System.out.println("Bu hesap makinesi sadece 4 islem yapabilmektedir.. " +
                        "\nLutfen bu islemlerden birini seciniz : [ +  -  *  / ]");
                islem  = scan.next().substring(0,1);
            }
            System.out.println("Lutfen islem yapmak istediginiz iki sayiyi giriniz : ");
            sayi1 = scan.nextDouble();
            sayi2 = scan.nextDouble();
            hesapMakinesi(sayi1,sayi2,islem);
            System.out.println("Yeni bir islem yapmak istiyor musunuz ? Devam etmek icin E/e'ye basiniz..");
            devamMi = scan.next().substring(0,1);

        }while (devamMi.equalsIgnoreCase("e"));

    }

    private static void hesapMakinesi (double sayi1 , double sayi2 , String islem) {

        switch (islem){
            case "+" :
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
                break;
            case "-" :
                System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
                break;
            case "*" :
                System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1*sayi2));
                break;
            case "/" :
                if (sayi1==0 && sayi2==0) System.out.println("Sonuc Tanimsiz!!");
                else if (sayi2==0) System.out.println("Sifira Bolunemez..");
                else System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Bu hesap makinesi sadece 4 islem yapabilmektedir..[ +  -  *  / ]");
        }

    }
}