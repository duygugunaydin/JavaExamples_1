package t04_IfStatements;

import java.util.Scanner;

public class Q1_IfStatements {
    public static void main(String[] args) {

        /*
        Soru 1 - Kullanicidan bir sayi isteyin,
                 sayiyi kontrol edip 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi%5==0) System.out.println("Sayi 5'in tam kati");
    }
}
