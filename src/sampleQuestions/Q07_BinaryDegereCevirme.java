package sampleQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q07_BinaryDegereCevirme {
    public static void main(String[] args) {

        //  Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        //  Örnek: 12 = 1 1 0 0

        int sayi =12;

        List<Integer> tersBinaryDeger = new ArrayList<>();

        while (sayi>=1){

            tersBinaryDeger.add(sayi%2);
            sayi /=2;

        }

        List<Integer> binaryDeger = new ArrayList<>();

        for (int i = tersBinaryDeger.size()-1 ; i >=0 ; i--) {
            binaryDeger.add(tersBinaryDeger.get(i));
        }
        System.out.println( sayi +" sayisinin binary karsiligi : " + binaryDeger);

    }
}
