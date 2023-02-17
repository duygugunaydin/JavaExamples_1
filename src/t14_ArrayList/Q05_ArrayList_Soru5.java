package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_ArrayList_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan pozitif bir tamsayi alip,
                o tamsayidan kucuk Fibonacci sayilarini
                bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        List<Integer> fibonacciListesi = verilenSayidanKucukFibonacciSayilariniBulmaMethodu(girilenSayi);
        System.out.println(fibonacciListesi);
    }

    public static List<Integer> verilenSayidanKucukFibonacciSayilariniBulmaMethodu (int sayi){

        List<Integer> fibonacciListesi = new ArrayList<>();

        if (sayi<1) {
            fibonacciListesi.add(-1);
            return fibonacciListesi;
        }else if (sayi==1) {
            fibonacciListesi.add(0);
            return fibonacciListesi;
        }else if (sayi==2) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            return fibonacciListesi;
        } else {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;
            while (sayi3<sayi) {
                sayi3 = sayi1 + sayi2;
                fibonacciListesi.add(sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
            fibonacciListesi.remove(fibonacciListesi.size()-1);
        }
        return fibonacciListesi;
    }
}
