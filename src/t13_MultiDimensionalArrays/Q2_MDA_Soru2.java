package t13_MultiDimensionalArrays;

import java.util.Arrays;

public class Q2_MDA_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
                yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input : int[][] arr = {{3,4,5}, {2,3,6,7}};
                output: [5, 7, 11]
         */

        int[][] arr = {{12, 8, 7}, {5, 2, 10, 91, 28,}, {6, 45, 24}, {22, 19, 23}, {88, 6, 4}};
        int toplam = 0;

        int newArrayLength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (newArrayLength > arr[i].length) {
                newArrayLength = arr[i].length;
            }
        }
        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam += arr[j][i];
            }
            newArray[i] = toplam;
            toplam = 0;
        }
        System.out.println("Olusan yeni Array = " + Arrays.toString(newArray));
    }
}
