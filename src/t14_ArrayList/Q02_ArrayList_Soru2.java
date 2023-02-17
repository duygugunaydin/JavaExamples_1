package t14_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_ArrayList_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
                Q’ya bastiginda girdigi isimleri bize
                liste olarak dondurecek bir method olusturun.
         */


        String girilenIsimler ="";

        List<String> isimlerListesi =kullanicidanIsimListesiOlusturma(girilenIsimler) ;
        System.out.println(isimlerListesi);
    }
    public static List<String> kullanicidanIsimListesiOlusturma (String isimler){

        Scanner scan = new Scanner(System.in);
        List<String> isimlerListesi = new ArrayList<>();

        while (!isimler.equalsIgnoreCase("q")) {
            System.out.println("Lutfen girmek istediginiz isimleri yaziniz" +
                    "\nBitirmek istediginizde Q'ya basiniz");
            isimler = scan.nextLine();
            if (!isimler.equalsIgnoreCase("q")) {
                isimlerListesi.add(isimler);
            }
        }
        return isimlerListesi;
    }

}
