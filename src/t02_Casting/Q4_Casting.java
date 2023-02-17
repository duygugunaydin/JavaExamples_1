package t02_Casting;

import java.util.Scanner;

public class Q4_Casting {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        //         o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double girilenSayi = scan.nextDouble();

        byte cevrilensayi = (byte) girilenSayi;

        System.out.println("Sayinin cevrilmis hali : " + cevrilensayi);

    }
}
