package t12_Arrays;

import java.util.Arrays;

public class Q3_Arrays_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
                sondaki elementi de basa tasiyacak bir method olusturun,
                array’i yeni haliyle kaydedin.
                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        int [] arr = { 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        arr=arraydeElementKaydirmaMethodu(arr);

        System.out.println(Arrays.toString(arr));



    }


    public static int[] arraydeElementKaydirmaMethodu (int[] arr){

        int bosKova=0;
        bosKova=arr[arr.length-1];

        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=bosKova;

        return arr;
    }
}
