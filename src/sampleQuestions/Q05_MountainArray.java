package sampleQuestions;

import java.util.Arrays;

public class Q05_MountainArray {
    public static void main(String[] args) {

        /*
          5-MOUNTAIN ARRAY SORUSU : Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için
          bir kod yazınız.
          Not:
          Mountain Array ==> [0, 2, 5, 3, 1]
          Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan
          deger alıyorsa Mountain Array' dir.
          Mountain Array Degil ==> [5, 2, 7, 1, 4]
          Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra
          sürekli artan deger alıyorsa Mountain Array degildir
         */

        int[] arr1 = {0, 2, 5, 3, 1};
        int[] arr2 = {5, 2, 7, 1, 4};

        mountainArrayHesaplamaMethodu(arr1);
        mountainArrayHesaplamaMethodu(arr2);
    }

    private static void mountainArrayHesaplamaMethodu(int[] arr) {

        int enBuyukEleman = arr[0];
        int enBuyukIndex = 0;
        boolean mountainArray = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enBuyukEleman) {
                enBuyukEleman = arr[i];
                enBuyukIndex = i;
            }
        }

        for (int i = enBuyukIndex; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                for (int j = enBuyukIndex; j > 0; j--) {
                    if (arr[j] > arr[j - 1])
                        mountainArray = true;
                    else {
                        mountainArray = false;
                        break;
                    }
                }
            } else
                mountainArray = false;
        }

        if (mountainArray)
            System.out.println(Arrays.toString(arr) + " Arrayi Mountain Arraydir");
        else
            System.out.println(Arrays.toString(arr) + " Arrayi Mountain Array degildir");
    }
}
