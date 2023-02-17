package t07_StringManipulationsxxx;

import java.util.Scanner;

public class Q01_StringManipulations_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1 - Kullanicidan bir cumle alin;
                 - Cumlede ev geciyorsa "Home home sweet home" yazdirin,
                 - Cumlede is geciyorsa "Calismak guzeldir" yazdirin,
                 - ikisini de iceriyorsa "Hem ev lazim hem is" ,
                 - Hicbirini icermiyorsa "Cok calisman lazim" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        if (girilenCumle.contains("ev") && girilenCumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (girilenCumle.contains("is")) {
            System.out.println("Calismak guzeldir");
        } else if (girilenCumle.contains("ev")){
            System.out.println("Home home sweet home");
        }else {
            System.out.println("Cok calisman lazim");
        }
    }
}
