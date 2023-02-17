package t17_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Q02_Iterator {
    public static void main(String[] args) {

        /*
           Soru 2) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
        */

        List<String> names = new ArrayList<>(Arrays.asList("Ayse","Fatma","Hayriye","Zehra","Elif"));

        ListIterator itr = names.listIterator();

        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        System.out.println("");

        while (itr.hasPrevious()){
            System.out.print(itr.previous()+ " ");
        }

    }
}
