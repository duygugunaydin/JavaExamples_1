package t09_MethodCreations;

import java.util.Scanner;

public class Q02_MethodCreation_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin,
                Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        isimDuzenleme(isim , soyisim);

        System.out.println(isimDuzenleme(isim,soyisim));




    }


    public static String isimDuzenleme (String isim, String soyisim){


        String duzenlenmisIsim = "";
        String duzenlenmisSoyIsim = "";

        if (isim.contains(" ")){
            int boslukIndexIsim= isim.indexOf(" ");
            duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1,boslukIndexIsim).toLowerCase()+ " " +
                    isim.substring(boslukIndexIsim+1,boslukIndexIsim+2).toUpperCase()+
                    isim.substring(boslukIndexIsim+2,isim.length());
        }else {
            duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1,isim.length()).toLowerCase() ;
        }


        if (soyisim.contains(" ")){
            int boslukIndexSoyisim = soyisim.indexOf(" ");
            duzenlenmisSoyIsim =soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1,boslukIndexSoyisim).toLowerCase()+ " " +
                    soyisim.substring(boslukIndexSoyisim+1,boslukIndexSoyisim+2).toUpperCase()+
                    soyisim.substring(boslukIndexSoyisim+2,soyisim.length());
        }else {
            duzenlenmisSoyIsim = soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1,soyisim.length()).toLowerCase();
        }

        String isimDuzenleme = duzenlenmisIsim + " " + duzenlenmisSoyIsim;

        return isimDuzenleme;
    }
}
