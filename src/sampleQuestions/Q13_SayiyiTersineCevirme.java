package sampleQuestions;

import java.util.Scanner;

public class Q13_SayiyiTersineCevirme {

    public static void main(String[] args) {

        /*
            Soru-28)
            Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
            Örnek:
            Sayı: 1238
            Sayının Tersi: 8321
            İpucu:  Loop kullanabilirsiniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersine cevirmek istediginiz rakami giriniz : ");
        String girilenSayi= scan.next();
        String tersSayi = "";

        for (int i = girilenSayi.length()-1; i >=0 ; i--) {
            tersSayi += girilenSayi.charAt(i);
        }
        System.out.println("Sayi : " + girilenSayi);
        System.out.println("Sayinin Tersi : " + tersSayi);

    }
}
