package t10_WhileLoop;

import java.util.Scanner;

public class Q05_WhileLoop_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
                While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
                bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ussunu hesaplamak istediginiz sayiyi giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println("Lutfen ussunu giriniz");
        int girilenUs = scan.nextInt();

        usHesaplama(girilenSayi,girilenUs);
    }

    public static void usHesaplama (int sayi,int us){

        int girilenUs= us;
        int carpim = 1;

        while (us>0){
            carpim *= sayi;
            us--;
        }
        System.out.println(sayi + " ussu " + girilenUs + " : " + carpim);

    }
}
