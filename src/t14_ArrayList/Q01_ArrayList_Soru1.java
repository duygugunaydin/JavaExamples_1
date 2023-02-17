package t14_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_ArrayList_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
                mukerrer olanlari silip,
                tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

        int[] sayilar = {5,23,4,6,4,15,18,2,4,3,6,15,8,15,45,23,9,4,6,6,7,5,6};

        sayilar = tekrarEdenElementleriSilmeMethodu(sayilar);
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] tekrarEdenElementleriSilmeMethodu (int[] arr){

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int[] tekrarsizArr = new int[list.size()];

        for (int i = 0; i <list.size() ; i++) {
            tekrarsizArr[i]=list.get(i);
        }
        return tekrarsizArr;
    }
}
