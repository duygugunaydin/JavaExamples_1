package sampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q24_AtmMenu {

    static Scanner scan = new Scanner(System.in);
    static double bakiye = 500;
    static String kartNo = "123654";
    static String sifre = "1236";


    public static void main(String[] args){
        /*
        ATM Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.

        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme
        ve cikis islemleri olacaktır.
                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekraninageri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
         */

        girisMethodu();

    }
    private static void girisMethodu(){

        String girilenKartNo ;
        String girilenSifre ;
        boolean kontrol = true;

        do {
            System.out.println("Lutfen kart numaranizi giriniz");
            girilenKartNo = scan.nextLine().replace(" ","");
            System.out.println("Lutfen sifrenizi giriniz");
            girilenSifre = scan.next();

            if (!sifre.equals(girilenSifre) || !kartNo.equals(girilenKartNo)){
                System.out.println("Girilen bilgiler yanlis lutfen tekrar deneyiniz :");
                kontrol = false;
                scan.nextLine();  // Dummy---> ard arda kullanılan scanner objelerinde olusan hatayi onlemek icin kullanilir..
            }else {
                kontrol=true;
                break;
            }
        }while (!kontrol);

        if (kontrol)
            atmMenu();
    }
    private static void atmMenu () {

        List<String> menuListesi = new ArrayList<>();
        menuListesi.add("1 - Bakiye Sorgula");
        menuListesi.add("2 - Para Yatirma");
        menuListesi.add("3 - Para Cekme");
        menuListesi.add("4 - Para Gonderme");
        menuListesi.add("5 - Sifre Degistirme");
        menuListesi.add("6 - Cikis");

        System.out.println("Lutfen Hangi islemi yapmak istiyorsaniz o rakami seciniz");
        for (int i = 0; i <menuListesi.size() ; i++) {
            System.out.println(menuListesi.get(i));
        }

        int no = scan.nextInt();
        switch (no){
            case 1 :
                bakiyeSorgulamaMethodu();
                islemeDevamMi();
                break;
            case 2 :
                paraYatirmaMethodu();
                islemeDevamMi();
                break;
            case 3 :
                paraCekmeMethodu();
                islemeDevamMi();
                    break;
            case 4 :
                paraGondermeMethodu();
                islemeDevamMi();
                    break;
            case 5 :
                sifreDegistirmeMethodu();
                islemeDevamMi();
                    break;
            case 6 :
                System.out.println("Guvenli sekilde cikis yapilmistir ");
                break;
            default:
                System.out.println("Hatali giris..");
                atmMenu();
        }

    }
    private static void islemeDevamMi(){

        System.out.println("Baska islem yapmak istiyor musunuz ? E/H");
        String kontrol = scan.next().substring(0,1);
        if (kontrol.equalsIgnoreCase("e")){
            atmMenu();
        }else {
            System.out.println("Lutfen kartinizi aliniz");
        }
    }
    private static void bakiyeSorgulamaMethodu(){

        System.out.println("***** 1 - Bakiye Sorgula *****");
        System.out.println("Bakiyeniz : " + bakiye + " TL");
    }
    private static void paraYatirmaMethodu(){
        System.out.println("***** 2 - Para Yatirma *****");
        System.out.println("Lutfen yatirmak istediginiz miktari giriniz : ");
        double yatirilacakPara = scan.nextDouble();
        bakiye += yatirilacakPara;
        System.out.println("Yeni bakiyeniz : " + bakiye + " TL");
    }
    private static void paraCekmeMethodu(){
        System.out.println("***** 3 - Para Cekme *****");
        System.out.println("Lutfen cekmek istediginiz miktari giriniz : ");
        double cekilecekPara = scan.nextDouble();
        if (cekilecekPara>bakiye) {
            System.out.println("Yetersiz Bakiye. \nHesabinizda " + bakiye + " TL bulunmaktadir.");
        }else {
            bakiye -= cekilecekPara;
            System.out.println("Kalan Bakiye : " + bakiye);
        }
    }
    private static void paraGondermeMethodu(){
        System.out.println("Gondermek istediginiz miktari giriniz :");
        int gonderilecekPara = scan.nextInt();
        scan.nextLine();
        if (gonderilecekPara>bakiye) {
            System.out.println("Yetersiz Bakiye. \nHesabinizda " + bakiye + " TL bulunmaktadir.");
            paraGondermeMethodu();
        }else {
            System.out.println("Lutfen gondermek istediginiz iban no giriniz :");
            String paraGonderilecekIbanNo = scan.nextLine().toUpperCase().replace(" ","");
            if (!(paraGonderilecekIbanNo.startsWith("TR")) || paraGonderilecekIbanNo.length()!=26) {
                System.out.println("Hatali Iban Numarasi " +
                        "\nIban no TR ile baslamalidir ve 26 karakter olmalidir.");
                atmMenu();
            }else {
                bakiye -= gonderilecekPara;
                System.out.println(paraGonderilecekIbanNo + " numarali hesaba " + gonderilecekPara +
                        " turatinda para gonderilmistir. " + " \nKalan Bakiye : " + bakiye);
            }
        }
    }
    private static void sifreDegistirmeMethodu(){
        System.out.println("Lutfen eski sifrenizi giriniz : ");
        String teyitSifre = scan.next();
        if (teyitSifre.equals(sifre)){
            System.out.println("Lutfen yeni sifrenizi giriniz :");
            String yeniSifre1 = scan.next();
            System.out.println("Lutfen yeni sifrenizi tekrar giriniz : ");
            String yeniSifre2 = scan.next();
            if (yeniSifre1.equals(yeniSifre2)){
                sifre = yeniSifre1;
                System.out.println("Yeni sifreniz basari ile kaydedilmistir. ");
            }else {
                System.out.println("Sifreler birbiri ile ayni olmalidir.. ");
            }
        }else {
            System.out.println("Eski sifrenizi hatali girdiniz : ");
        }
    }
}
