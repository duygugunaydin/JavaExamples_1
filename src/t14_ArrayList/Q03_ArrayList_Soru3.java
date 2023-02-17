package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_ArrayList_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
                kalan kismini list olarak bize donduren bir method olusturun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ismin icinde olmasini istemediginiz harfi giriniz");
        String harf = scan.next().substring(0,1);

        List<String> isimlerListesi = new ArrayList<>();
        isimlerListesi.add("yasemin");
        isimlerListesi.add("ahmet");
        isimlerListesi.add("ruya");
        isimlerListesi.add("defne");
        isimlerListesi.add("deniz");
        isimlerListesi.add("isik");
        isimlerListesi.add("yasar");
        isimlerListesi.add("harun");

        isimlerListesi=istenmeyenKelimeSilmeMethodu(isimlerListesi,harf);
        System.out.println(isimlerListesi);
    }
    public static List<String> istenmeyenKelimeSilmeMethodu (List<String> list,String harf){

        List<String> yeniListe = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (!list.get(i).contains(harf)){
                yeniListe.add(list.get(i));
            }
        }
        return yeniListe;
    }
}
