package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q02_ForLoop_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar
                (girilen sayi dahil) 7 ile bolunebilen sayilari yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            if ((i%7)==0) System.out.print( i + " ");
        }
    }
}
