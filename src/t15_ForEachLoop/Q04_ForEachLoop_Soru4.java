package t15_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_ForEachLoop_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
                harf cumlede kullanilmissa kac kere
                kullanildigini yazdirin,
                kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();
        System.out.println("Lutfen cumlede sorgulamak istediginiz harfi yaziniz");
        String sorgulananHarf = scan.next().substring(0,1);

        String[] cumleArr = girilenCumle.split("");  // burada split ile array olusturduk

        int sayac =0;

        for (String each:cumleArr
             ) {
            if (each.equalsIgnoreCase(sorgulananHarf)){
                sayac++;
            }
        }
        if (sayac==0)
            System.out.println("Harf cumlede kullanilmamis");
        else
            System.out.println(sorgulananHarf + " cumlede " + sayac + " tane kullanilmis");
    }
}
