package t12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_Arrays_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
                ve bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz listenin boyutunu giriniz");
        int boyut = scan.nextInt();
        String yazilacakEleman=scan.nextLine();

        String[] arr =kullanicidanArrayOlusturma(boyut,yazilacakEleman);

        System.out.println(Arrays.toString(arr));

    }
    public static String[] kullanicidanArrayOlusturma (int boyut, String yazilacakEleman){

        Scanner scan = new Scanner(System.in);
        String[] olustrulanArray = new String[boyut];
        int index = 0;

        while (index<boyut){
            System.out.println("Lutfen listeye yazmak istediginiz elementleri giriniz");
            olustrulanArray[index] = scan.nextLine();
            index++;
        }
        return olustrulanArray;
    }
}
