package t12_Arrays;

import java.util.Arrays;

public class Q7_Arrays_Soru7 {
    public static void main(String[] args) {

        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
                eski array’e yeni degeri atayin.
         */

        String[] vegetables = {"carrot","potato","tomato","cabbage","onion","beetroot","brinjal"};
        System.out.println(Arrays.toString(vegetables));

        String newVegetable = "capsicum";

        vegetables=elemanEklemeMethodu(vegetables,newVegetable);
        System.out.println(Arrays.toString(vegetables));

    }

    public static String [] elemanEklemeMethodu (String [] arr, String eklenecekeleman){

        String [] elemanEklenmisArray = new String[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            elemanEklenmisArray[i]=arr[i];
        }
        elemanEklenmisArray[elemanEklenmisArray.length-1]=eklenecekeleman;

        return elemanEklenmisArray;
    }

}
