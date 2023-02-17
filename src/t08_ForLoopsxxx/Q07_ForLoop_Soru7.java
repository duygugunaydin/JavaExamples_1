package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q07_ForLoop_Soru7 {
    public static void main(String[] args) {

        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String girilenSayiStr = scan.next();
        int girilenSayi = Integer.parseInt(girilenSayiStr);
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= girilenSayiStr.length() ; i++) {

            birlerBasamagi = girilenSayi%10 ;
            rakamlarToplami += birlerBasamagi;
            girilenSayi = girilenSayi/10;

        }

        System.out.println("Girilen sayisinin rakamlar toplami : " + rakamlarToplami);


        System.out.println("=========2.YONTEM=========");

        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi2 = scan.nextInt();
        String girilenSayiStr2 = ""+girilenSayi2;

        int birlerBasamagi2 = 0;
        int rakamlarToplami2= 0;

        for (int i = 1; i <= girilenSayiStr2.length() ; i++) {
            birlerBasamagi2=girilenSayi2%10;
            rakamlarToplami2=rakamlarToplami2+birlerBasamagi2;
            girilenSayi2=girilenSayi2/10;
        }
        System.out.println("Girilen sayisinin rakamlar toplami : " + rakamlarToplami2);

    }
}
