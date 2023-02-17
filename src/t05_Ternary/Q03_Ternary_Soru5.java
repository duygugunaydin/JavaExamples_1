package t05_Ternary;

import java.util.Scanner;

public class Q03_Ternary_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);


    }
}
