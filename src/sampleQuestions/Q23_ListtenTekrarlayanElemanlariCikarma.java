package sampleQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q23_ListtenTekrarlayanElemanlariCikarma {
    public static void main(String[] args) {

        /*
        Soru 37-)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values
        in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        TR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */

        int [] arr = {1,2,3,2,1,6,3,4,5,2,2,5,6,5,6,5};

        List<Integer> tekrarsizList = eliminateDuplicates(arr);


        System.out.println(tekrarsizList);
    }

    public static List<Integer> eliminateDuplicates(int[] list){

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < list.length ; i++) {
            if (!tekrarsizList.contains(list[i]))
                tekrarsizList.add(list[i]);
        }
        return tekrarsizList;
    }

}
