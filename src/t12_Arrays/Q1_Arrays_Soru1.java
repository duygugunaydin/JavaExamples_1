package t12_Arrays;

import java.util.Arrays;

public class Q1_Arrays_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
                Eski array’i yeni haliyle kaydedin.
         */

        int [] myArray = { 4, 8, 45, 34, 27, 62, 94, 90};


        myArray=arrayinElemanSayisiniArttirma(myArray,2);

        System.out.println(Arrays.toString(myArray));

    }

    public static int[] arrayinElemanSayisiniArttirma (int[] arr, int eklenecekSayi){

        int[] yeniArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = arr[i]+eklenecekSayi;
        }

        return yeniArray;
    }
}
