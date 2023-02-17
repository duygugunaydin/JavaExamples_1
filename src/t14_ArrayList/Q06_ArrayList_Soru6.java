package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList_Soru6 {
    public static void main(String[] args) {

        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip,
                o tamsayiyi tam bolebilen tum pozitif
                tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        List<Integer> bolenlerListesi = sayininBolenleriniBulmaMetodu(girilenSayi);
        System.out.println(bolenlerListesi);
    }

    public static List<Integer> sayininBolenleriniBulmaMetodu(int sayi) {

        List<Integer> bolenlerListesi = new ArrayList<>();

        if (sayi <= 0) {
            System.out.println("Gecersiz sayi");
        } else {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    bolenlerListesi.add(i);
                }
            }
        }
        return bolenlerListesi;
    }
}
