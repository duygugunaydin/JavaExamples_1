package t01_Scanner;

import java.util.Scanner;

public class Q1_Scanner {
    public static void main(String[] args) {

         /*
        Kullanicidan ismini, soyismini, ve yasini alip asagidaki formatta yazdirin

        girilen bilgiler : J Doe, 44
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char isim = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.next();
        soyisim = soyisim.toUpperCase().charAt(0) + soyisim.toLowerCase().substring(1);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Girilen bilgiler : " + isim + " " + soyisim + ", " + yas);
    }
}
