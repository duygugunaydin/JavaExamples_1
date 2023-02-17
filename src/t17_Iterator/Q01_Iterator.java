package t17_Iterator;

import java.util.*;

public class Q01_Iterator {
    public static void main(String[] args) {

        /*
        Soru 1) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz.
                (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
                Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil degil)
                output: [23,40]
         */

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        ListIterator itr = sayilar.listIterator();

        while(itr.hasNext()){

            Integer sayi = (Integer) itr.next();

            if (!(20<=sayi && sayi<=40)){
                itr.remove();
            }
        }
        System.out.println(sayilar);

    }
}
