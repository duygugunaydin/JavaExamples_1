package t12_Arrays;

import java.util.Arrays;

public class Q15_Arrays_IkıArrayiBirlestirme {
    public static void main(String[] args) {

        /*
            Soru 41-)
            Parametre olarak 2 Int Array kabul eden ve
            2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}

          */

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr = ikiArrayiTekeDousturmeMethodu(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] ikiArrayiTekeDousturmeMethodu (int[] arr1 , int[] arr2){

        int[] yeniArr = new int[arr1.length+arr2.length];

        for (int i = 0; i <arr1.length ; i++) {
            yeniArr[i]=arr1[i];
        }
        int index=0;
        for (int i = arr1.length ; i <yeniArr.length ; i++) {
            yeniArr[i]=arr2[index];
            index++;
        }
        return yeniArr;
    }

    private static void birlesikArray(int[] input1, int[] input2) {

        System.out.println("***** 2.YONTEM *****");

        int[] newArr = new int[input1.length + input2.length];

        for (int i = 0; i < input1.length; i++) {
            newArr[i] = input1[i];
        }
        for (int j = 0; j < input2.length; j++) {
            newArr[input1.length + j] = input2[j];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
