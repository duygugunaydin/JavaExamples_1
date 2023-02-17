package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q09_ForLoop_Soru9 {
    public static void main(String[] args) {

        /*
            Soru 9 - Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersten yazilmasini istediginiz cumleyi giriniz");
        String girilenCumle = scan.nextLine();

        for (int i = girilenCumle.length()-1; i >= 0; i--) {
            System.out.print(girilenCumle.substring(i, i + 1));
        }

        System.out.println();
        System.out.println("============2.YONTEM=============");

        for (int i = girilenCumle.length()-1 ; i >=0 ; i--) {
            System.out.print(girilenCumle.charAt(i));
        }


    }
}
