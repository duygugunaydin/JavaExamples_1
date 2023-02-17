package sampleQuestions;

import java.util.Scanner;

public class Q06_MukemmelSayi {
    public static void main(String[] args) {

        /*
        Soru 26-) Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
            NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse,
                  bu tür sayılar Mükemmel Sayı olabilir.
                  Örnek:
                  Giriş :6
                  Çıkış: 6 Mükemmel Sayıdır
                  Giriş :7
                  Çıkış:7 Mükemmel Sayı Değildir
                  ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kontrol etmek istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();

        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0)
                toplam += i;
        }

        if (sayi==0)
            System.out.println("0 Mukemmel sayi degildir");
        else if (sayi==toplam)
            System.out.println(sayi + " Mukemmel sayidir.");
        else
            System.out.println(sayi + " Mukemmel sayi degildir");


    }
}
