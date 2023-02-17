package t15_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q03_ForEachLoop_Soru3 {

    public static void main(String[] args) {

        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
                - Kelimenin uzunlugu cift sayi ise ilk yarisini
                - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                  yeni bir listeye ekleyip yazdirin.
         */

        String[] isimler = {"ayse", "fatma", "yavuz", "ayse", "miray", "fatma" , "duygu", "yavuz"};
        List<String> yeniListe = new ArrayList<>();

        for (String each:isimler
             ) {
            if (each.length()%2==0){
                yeniListe.add(each.substring(0,each.length()/2));
            }else{
                yeniListe.add(each.substring(each.length()/2,each.length()));
            }
        }
        System.out.println(yeniListe);
    }
}
