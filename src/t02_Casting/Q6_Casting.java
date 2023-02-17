package t02_Casting;

import java.util.Scanner;

public class Q6_Casting {
    public static void main(String[] args) {

    // Soru 5 - Kullanicidan bir double, bir tam sayi alin.
    //          double sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tam sayi kismini yazdirin.

    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen bir ondalikli, bir tam sayi giriniz");
    double sayi1 = scan.nextDouble();
    int sayi2 = scan.nextInt();

    System.out.println((int)(sayi1/sayi2));

}
}
