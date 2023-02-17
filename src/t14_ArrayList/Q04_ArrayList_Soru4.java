package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_ArrayList_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
                bize ilk n tane tane Fibonacci sayisini
                bir list olarak donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet fibonacci sayisi yazdirmak istiyorsunuz");
        int adet = scan.nextInt();

        List<Integer> fibonacciSayilari = nTaneFibonacciSayisiniHesaplama(adet);
        System.out.println(fibonacciSayilari);
    }
    public static List<Integer> nTaneFibonacciSayisiniHesaplama (int sayi){

        List<Integer> fibonacciSayilari = new ArrayList<>();

        if (sayi<1){
            fibonacciSayilari.add(-1);
            return fibonacciSayilari;
        } else if (sayi==1) {
            fibonacciSayilari.add(0);
            return fibonacciSayilari;
        }else if (sayi==2){
            fibonacciSayilari.add(0);
            fibonacciSayilari.add(1);
            fibonacciSayilari.add(1);
            return fibonacciSayilari;
        }else {
            fibonacciSayilari.add(0);
            fibonacciSayilari.add(1);
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;
            for (int i = 3; i <=sayi ; i++) {
                sayi3=sayi1+sayi2;
                fibonacciSayilari.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
        }
        return fibonacciSayilari;
    }
}
