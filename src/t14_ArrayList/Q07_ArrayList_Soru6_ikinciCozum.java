package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_ArrayList_Soru6_ikinciCozum {
    public static void main(String[] args) {

        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen seri için eleman sayisi giriniz");
        int elemanSayisi = scan.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();
        fibonacciSerisi.add(1);
        fibonacciSerisi.add(1);
        int toplam = 0 ;

        for (int i = 2; i <elemanSayisi ; i++) {
            toplam=fibonacciSerisi.get(fibonacciSerisi.size()-2)+ fibonacciSerisi.get( fibonacciSerisi.size()-1);
            fibonacciSerisi.add(toplam);
        }
        System.out.println(fibonacciSerisi);

    }
}
