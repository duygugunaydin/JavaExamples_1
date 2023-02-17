package t11_DoWhileLoop;

import java.util.Scanner;

public class Q03_DoWhileLoop_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
                tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int karekok = 1 ;
        boolean karekokMu = false ;


        do {
            if (karekok*karekok==sayi){
                karekokMu=true;
                System.out.println("Girilen sayi " + karekok + "'un karesidir.");
                break;
            }else{
                karekok++;
                karekokMu=false;
            }

        }while (karekok*karekok<=sayi);
        System.out.println(karekokMu);

    }
}
