package t12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_Arrays_Soru5_ikinciCozum {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
                ve bize donduren bir method olusturun.
         */

        int [] olusturulanArray= yeniArrayOlusturmaMethodu();
        System.out.println(Arrays.toString(olusturulanArray));

    }
    public static int[] yeniArrayOlusturmaMethodu (){

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Array boyutunu  giriniz :");
        int arrayBoyut= scan.nextInt();
        int [] yeniarray= new int[arrayBoyut];

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("Lutfen yazilacak elementleri giriniz :");
            yeniarray[i] = scan.nextInt();
        }
        return yeniarray;
    }
}
