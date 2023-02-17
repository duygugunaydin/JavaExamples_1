package t17_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Q03_Iterator {
    public static void main(String[] args) {

        /*
        Soru 3)    Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
                   (iterator ile index kullanimina ornek)
                   Orn : list : [2,13,56,23,45,14,40]
                   artirilmasi istenen eleman sayisi : 3
                   output: [7,18,61,23,45,14,40]
         */

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        System.out.println(sayilar); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator itr = sayilar.listIterator();

        while (itr.hasNext()){
            Integer sayi = (Integer) itr.next();

            itr.set(sayi+3);
        }
        System.out.println(sayilar); // [5, 16, 59, 26, 48, 17, 43]
    }
}
