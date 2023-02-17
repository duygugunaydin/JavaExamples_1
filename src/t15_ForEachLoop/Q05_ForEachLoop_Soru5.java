package t15_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q05_ForEachLoop_Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
                ikisinde ortak olan elementleri
                ayri bir liste olarak veren bir program yazin.
         */

        int[] arr1 = {1,2,3,4,5,6,7,8,9,9,};
        int[] arr2 = {1,22,3,3,44,5,66,7,88,9};


        List<Integer> ortakElemanlar = new ArrayList<>();

        for (int eachArr1:arr1
             ) {
            for (int eachArr2:arr2
                 ) {
                if (eachArr1==eachArr2)
                    if (!ortakElemanlar.contains(eachArr1))
                        ortakElemanlar.add(eachArr1);
            }
        }
        System.out.println(ortakElemanlar);
    }
}
