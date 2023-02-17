package t01_Scanner;

import java.util.Scanner;

public class Q2_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cemberin yari capini alip, cevresini ve alanini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini giriniz");

        double girilenYaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : " + (2*girilenYaricap*3.14) +
                "\nCemberin alani : " + (girilenYaricap*girilenYaricap*3.14));

    }
}
