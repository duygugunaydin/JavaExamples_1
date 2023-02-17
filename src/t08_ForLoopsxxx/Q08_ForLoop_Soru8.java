package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q08_ForLoop_Soru8 {
    public static void main(String[] args) {

        /*
        Soru 8 - Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
               - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
               - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
               - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%3==0 && i%5==0) System.out.println("fizzBuzz ");
            else if (i%3==0) System.out.print("fizz ");
            else if (i%5==0) System.out.print("buzz ");
            else System.out.print(i + " ");
        }
    }
}
