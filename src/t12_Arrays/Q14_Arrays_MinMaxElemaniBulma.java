package t12_Arrays;

import java.util.Arrays;

public class Q14_Arrays_MinMaxElemaniBulma {

    public static void main(String[] args) {

         /*
            Soru-39)
            Bir tamsayı dizisini (Int Array) girdi olarak kabul eden
            ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
            Örnek:
            Input : {3,2,5,4,1,6}
            Output :
            min: 1
            max: 6
         */

        int[] arr1 = {3, 2, 5, 4, 1, 6};

        Arrays.sort(arr1);

        int min1 = arr1[0];
        int max1 = arr1[arr1.length - 1];

        System.out.println("Verilen arrayin en kucuk elemani : " + min1);
        System.out.println("Verilen arrayin en buyuk elemani : " + max1);

        System.out.println("=========== 2.Yontem ===========");

        int[] arr2 = {9, 3, 2, 5, 4, 1, 6, 9, 8};

        int min2 = arr2[0];
        int max2 = arr2[0];

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] < min2) {
                min2 = arr2[i];
            }
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }
        System.out.println("Verilen arrayin en kucuk elemani : " + min2);
        System.out.println("Verilen arrayin en buyuk elemani : " + max2);
    }
}

