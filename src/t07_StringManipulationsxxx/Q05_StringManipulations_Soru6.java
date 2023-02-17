package t07_StringManipulationsxxx;

import java.util.Scanner;

public class Q05_StringManipulations_Soru6 {
    public static void main(String[] args) {

        /*
        Soru 6 - Kullanicidan bir String alin,
                 String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                 String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birseyler yazın");
        String girilenCumle = scan.nextLine();

        if (girilenCumle.length()%2==0){
            String ilkyarisi= girilenCumle.substring(0,girilenCumle.length()/2);
            String sonyarisi= girilenCumle.substring(girilenCumle.length()/2,girilenCumle.length());
            String yenicumle= ilkyarisi + ":)" + sonyarisi;
            System.out.println(yenicumle);
        }else {
            String yeniCumle = girilenCumle.replace(girilenCumle.substring(girilenCumle.length()/2,
                    girilenCumle.length()/2+1),":(");
            System.out.println(yeniCumle);
        }


    }
}
