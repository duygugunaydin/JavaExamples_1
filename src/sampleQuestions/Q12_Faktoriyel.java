package sampleQuestions;

import java.util.Scanner;

public class Q12_Faktoriyel {
    public static void main(String[] args) {

        /*
        Soru 23-) Girdi olarak bir tamsayı kabul eden
                  ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
                  Method bize çıktıyı döndürsün.
                  Örnek:
                  Girdi: 6
                  Çıktı: 6!=65432*1=720
                  ipucu: Aldıgınız sayıyı methoda gönderin.
                  Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        faktoriyelHesaplama(sayi);

        }
    public static void faktoriyelHesaplama (int sayi){

        int faktoriyel = 1;
        String str = "";

        for (int i = sayi; i > 0 ; i--) {
            faktoriyel *= i;
            str += i + "*";
        }
        System.out.println(sayi + "!=" + str.substring(0,str.length()-1) + "=" + faktoriyel);
    }
}
