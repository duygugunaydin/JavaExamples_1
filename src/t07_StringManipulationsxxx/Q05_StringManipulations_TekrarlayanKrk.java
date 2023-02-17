package t07_StringManipulationsxxx;

import java.util.Scanner;

public class Q05_StringManipulations_TekrarlayanKrk {

    public static void main(String[] args) {

        /*
        Soru 20-) Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
                  Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
                  Dize aynı karakterlere sahipse ;
                  "Dizede yinelenen karakterler var" ;
                  aynı karakterlere sahip degilse ;
                  "String benzersiz karakterlere sahip" yazdırın.
                  İsim 3 karakterden uzunsa ;
                  "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
	            çıkış: Dizede yinelenen karakterler var
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc harfli bir isim giriniz : ");
        String isim = scan.next();

        if (isim.length()>3) {
            System.out.println("Ismin uzunlugu 3 harfli olmalidir");
        }else if (isim.length()==3){
            if (isim.charAt(0) == isim.charAt(1) ||
                    isim.charAt(0) == isim.charAt(2) ||
                    isim.charAt(1) == isim.charAt(2))
                System.out.println("Dizede yinelenen karakterler var");
            else
                System.out.println("String benzersiz karakterlere sahip");
        }else
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");


        System.out.println("************* 2.COZUM *************");

        String str = "duygu";
        boolean kontrol = false;

        for (int i = 0; i <str.length() ; i++) {

            if (!(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))){
                kontrol=true;
                break;
            }
        }
        if (kontrol)
            System.out.println("Dizede yinelenen karakterler var");
        else
            System.out.println("String benzersiz karakterlere sahip");

    }
}

