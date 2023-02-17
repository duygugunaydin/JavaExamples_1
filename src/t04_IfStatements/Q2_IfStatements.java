package t04_IfStatements;

import java.util.Scanner;

public class Q2_IfStatements {
    public static void main(String[] args) {

        /*
        Soru 5 - Kullanicidan notunu alin,
                 50 veya daha buyukse "Sinifi gectin",
                 50'den kucukse "Malesef kaldin" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double girilenNot = scan.nextDouble();

        if (50 <= girilenNot) System.out.println("Sinifi gectin");
        if (50 > girilenNot) System.out.println("Malesef kaldin");

    }
}
