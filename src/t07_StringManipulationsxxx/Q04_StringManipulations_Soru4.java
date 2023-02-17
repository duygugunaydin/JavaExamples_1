package t07_StringManipulationsxxx;

import java.util.Scanner;

public class Q04_StringManipulations_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4 - Kullanicidan isim ve soyismini ayri ayri alin.
               - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin;
               - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
               soyismi buyukharflerle yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        if (isim.length()>soyisim.length()){
            isim = isim.toUpperCase().charAt(0) + isim.substring(1,isim.length()).toLowerCase();
            soyisim = soyisim.toUpperCase().charAt(0) + soyisim.substring(1,soyisim.length()).toLowerCase();
            System.out.println(isim.concat(" ").concat(soyisim));
        } else {
            isim = isim.toUpperCase().charAt(0) + isim.substring(1,isim.length()).toLowerCase();
            soyisim = soyisim.toUpperCase();
            System.out.println(isim.concat(" ").concat(soyisim));
        }

    }
}
