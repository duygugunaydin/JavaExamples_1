package t18_Collectionsxxx;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan deger alarak iki String liste olusturun.
               Kullanici deger girmeyi birakmak icin 0’a basmalidir.
               Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
               liste1 : …….
               liste2 : …….
               ortak elementler : …….
         */

        Scanner scan = new Scanner(System.in);
        List<String> urunlerList1 = new ArrayList<>();
        String urunler ;

        do {
            System.out.println("Lutfen Listeye yazmak istediginiz urunleri giriniz\nBitirmek icin 0'a basininiz");
            urunler=scan.nextLine();
            if (!urunler.equals("0")) {
                urunlerList1.add(urunler);
            }

        }while (!urunler.equals("0"));
        System.out.println("Urunleriniz kaydedilmistir : ");
        System.out.println("Yeni liste icin ; ");

        List<String> urunlerList2 = new ArrayList<>();
        do {
            System.out.println("Lutfen Listeye yazmak istediginiz urunleri giriniz\nBitirmek icin 0'a basininiz");
            urunler=scan.nextLine();
            if (!urunler.equals("0")) {
                urunlerList2.add(urunler);
            }

        }while (!urunler.equals("0"));
        System.out.println("Urunleriniz kaydedilmistir : ");


        Set<String> benzerizList = new TreeSet<>();

        for (String each:urunlerList1) {
            benzerizList.add(each);
        }
        for (String each:urunlerList2) {
            benzerizList.add(each);
        }

        System.out.println("Liste 1 : " + urunlerList1);
        System.out.println("Liste 2 : " + urunlerList2);
        System.out.println("Ikı listenin birlesmis hali : " + benzerizList);

    }
}
