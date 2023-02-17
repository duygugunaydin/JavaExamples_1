package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q10_ForLoop_Soru10 {
    public static void main(String[] args) {

        /*
            Soru 10 - Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersten yazilmasini istediginiz cumleyi giriniz");
        String girilenCumle = scan.nextLine();
        String tersCumle = "";

        for (int i = girilenCumle.length()-1; i >= 0; i--) {
            tersCumle += girilenCumle.substring(i, i + 1);
        }
        System.out.println("Girdiginiz cumlenin tersi : " + tersCumle);

        System.out.println("============2.YONTEM=============");

        String tersCumle2 = "";

        for (int i = girilenCumle.length()-1 ; i >=0 ; i--) {
            tersCumle2 += girilenCumle.charAt(i);
        }
        System.out.println("Girdiginiz cumlenin tersi : " + tersCumle2);


    }
}
