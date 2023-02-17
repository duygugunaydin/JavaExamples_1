package t12_Arrays;

public class Q09_Array_Soru {
    public static void main(String[] args) {

        /*
             Write a Java program to sum values of an array.
             Bir arrayin değerlerini toplayan bir Java programı yazın.
         */

        int [] arr = {2,6,4,8,5};

        int toplam = intArrayinElemanlariniToplamaMethodu(arr);

        System.out.println("Arrayin elemanlari toplami : " + toplam);

    }

    private static int intArrayinElemanlariniToplamaMethodu(int[] arr) {

        int toplam =0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        return toplam;

    }
}
