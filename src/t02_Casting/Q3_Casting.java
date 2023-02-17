package t02_Casting;

import java.util.Scanner;

public class Q3_Casting {
    public static void main(String[] args) {

        // Soru 2 - Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char girilenharf = scan.next().charAt(0);

        System.out.println((char)(girilenharf+1)+" "+(char) (girilenharf+2)+" "+(char)(girilenharf+3));
    }
}
