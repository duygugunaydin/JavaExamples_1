package t04_IfStatements;

import java.util.Scanner;

public class Q05_If_Else_If_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4 - Kullanicidan mesafeyi kilometre olarak alin
                 ve cevirmek istedigi birimi sorun,
                 istedigi birim metre veya santimetre ise cevirip yazdirin,
                 degilse "Istediginiz birim sisteme kayitli değil" yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz" +
                "\nve cevırmek istediginiz birimi yaziniz");

        double mesafe = scan.nextDouble();
        String birim = scan.next();

        if (birim.equalsIgnoreCase("santimetre") || birim.equalsIgnoreCase("cm")){
            System.out.println(mesafe*100000);
        } else if (birim.equals("metre") || birim.equals("m")) {
            System.out.println(mesafe*1000);
        }


    }
}
