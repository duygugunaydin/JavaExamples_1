package t12_Arrays;

import java.util.Arrays;

public class Q08_Arrays_Soru {
    public static void main(String[] args) {

        /*
         Write a Java program to sort a numeric array and a string array.
         Bir sayısal array ve bir string array sıralamak için bir Java programı yazın.
         */

        String[] str = {"fatma","ayse","duygu","rıdvan"};

        System.out.println(Arrays.toString(str));
        str=stringArrayiSiralamaMethodu(str);
        System.out.println(Arrays.toString(str));

        int[] arr = {23,4,56,9,8,65,32};

        System.out.println(Arrays.toString(arr));
        arr= integerArrayiSiralamaMethodu(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] integerArrayiSiralamaMethodu(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    private static String[] stringArrayiSiralamaMethodu(String[] str) {
        Arrays.sort(str);
        return str;
    }
}
