package sampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q17_KullanicidanArrayOlusturma {
    public static void main(String[] args) {

        /*
        -------------------------------------------------------------------------------------------------------------
        Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        -------------------------------------------------------------------------------------------------------------
         */


        int[] kullaniciArrayi = kullanicidanArrayOlusturma();

        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    private static int[] kullanicidanArrayOlusturma() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturulacak arrayin uzunlugunu giriniz");
        int arrLenght = scan.nextInt();

        int [] arr = new int[arrLenght];

        for (int i = 0; i <arrLenght ; i++) {
            System.out.println("Lutfen icine yazmak istediginiz elemani giriniz");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
