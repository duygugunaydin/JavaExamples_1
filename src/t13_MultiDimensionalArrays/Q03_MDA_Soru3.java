package t13_MultiDimensionalArrays;

import java.util.Arrays;

public class Q03_MDA_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
                yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
                output: [10, 3, 12, 10, 9]
         */

        int[][] arr = {{12, 8, 7}, {5, 2, 10, 91, 28,}, {6, 45, 24}, {22, 19, 23}, {88, 6, 4}};

        int toplam = 0 ;
        int[] newArray = new int[arr.length];


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            newArray[i]=toplam;
            toplam=0;
        }
        System.out.println("Yeni olusturdugumuz Array = " + Arrays.toString(newArray));

    }
}
