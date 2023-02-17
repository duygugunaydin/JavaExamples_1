package sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q18_KullanicidanOlusturulanArrayiTerstenYazdirma {
    public static void main(String[] args) {

        /*
   ---------------------------------------------------------------------------------------------------------
     Soru 32-)
     Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
   ---------------------------------------------------------------------------------------------------------
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturacaginiz arrayin boyutunu giriniz");
        int boyut= scan.nextInt();

        int [] kullaniciArr = new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.println("Lutfen array'a yazmak istediginiz elementleri giriniz");
            kullaniciArr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(kullaniciArr));

        int[] tersArr = new int[boyut];
        int index=0;

        for (int i = boyut-1; i >=0 ; i--) {
            tersArr[index] = kullaniciArr[i];
            index++;
        }
        System.out.println(Arrays.toString(tersArr));

    }
}
