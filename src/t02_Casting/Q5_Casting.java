package t02_Casting;

import java.util.Scanner;

public class Q5_Casting {
    public static void main(String[] args) {

        // Soru 4 - Kullanicidan iki double sayi alin
        //          ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tam sayi kismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek iki ondalikli sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        int bolum = (int) (sayi1 / sayi2) ;

        System.out.println(bolum);
    }
}
