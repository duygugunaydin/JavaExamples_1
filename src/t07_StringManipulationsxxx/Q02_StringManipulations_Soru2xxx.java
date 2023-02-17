package t07_StringManipulationsxxx;

import org.w3c.dom.html.HTMLOptGroupElement;

public class Q02_StringManipulations_Soru2xxx {
    public static void main(String[] args) {

        /*
        Soru 2 - Kullanicidan belirli bir formatta verdigi String fiyatlari toplayip yazdirin
                 input 1 : "15.30 €" ,
                 input 2 : "11.40 €" ,
                 output  : "36.70 €"
         */

        String fiyat1= "15.30 €";
        String fiyat2 = "11.40 €" ;
        fiyat1 = fiyat1.replaceAll("\\D","");
        fiyat2 = fiyat2.replaceAll("\\D","");

        int toplam = Integer.parseInt(fiyat1)+Integer.parseInt(fiyat2);
        System.out.println("yarım kaldı");



    }
}
