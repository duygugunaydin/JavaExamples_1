package t10_WhileLoop;

import java.util.Scanner;

public class Q04_WhileLoop_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin.
                Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
                Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
                ve bunlarin toplaminin kac oldugunu yazdirin.
                Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
                bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 1;
        int sayilarinToplami = 0;
        int flag = 0;

        while (girilenSayi!=0){

            System.out.println("Lutfen toplamak istediginiz sayilari giriniz" +
                    "\nBitirmek istediginizde 0'a basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi!=0) {
                sayilarinToplami += girilenSayi;
                flag++;
            }

        }
        System.out.println("Girdiginiz " + flag + " sayinin toplami : " + sayilarinToplami);

    }
}
