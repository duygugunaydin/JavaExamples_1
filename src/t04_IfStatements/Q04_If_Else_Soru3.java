package t04_IfStatements;

import java.util.Scanner;

public class Q04_If_Else_Soru3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen uc sayi");
        int kenar1 =  scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3) System.out.println("eskenar");
        else System.out.println("degil");

        System.out.println("yas");
        int yas = scan.nextInt();
        if (yas>=65) System.out.println("emeklilik ok");
        else System.out.println(65-yas + "yil calis");

        System.out.println("bir karakter");
        char krk = scan.next().charAt(0);
        if (krk>=65 && krk<=90) System.out.println("buyuk");
        else System.out.println("buyuk harf degil");

        System.out.println("bir bir harf");
        char harf = scan.next().charAt(0);
        if (harf>=97 && harf<=122) System.out.println((char)(harf-32));
        else System.out.println(harf);

    }
}
