package sampleQuestions;

import java.util.Arrays;

public class Q21_StringiArrayeCevirme {
    public static void main(String[] args) {

        /*
        Soru 35-)
        Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
        Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
        Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
         */

        String isim = "duygu";

        char[] arr = charArrayOlusturma(isim);

        System.out.println("Array'e cevrilmis hali : " + Arrays.toString(arr));

    }

    public static char[] charArrayOlusturma (String isim){

        char [] arr = new char[isim.length()];

        for (int i = 0; i <isim.length() ; i++) {
            arr[i] = isim.charAt(i);
        }
        return arr;
    }
}
