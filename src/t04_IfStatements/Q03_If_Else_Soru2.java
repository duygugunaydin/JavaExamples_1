package t04_IfStatements;

import java.util.Scanner;

public class Q03_If_Else_Soru2 {
    public static void main(String[] args) {


        /*
        Soru 2 - Kullanıcıdan notunu alın,
                 50 veya  daha buyukse "Sınıfı gectın",
                 50 den kucukse "Malesef kaldın" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not>=50) System.out.println("Sınıfı gectin");
        else System.out.println("Malesef kaldin");



    }
}
