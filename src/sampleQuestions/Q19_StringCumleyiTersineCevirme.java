package sampleQuestions;

import java.util.Arrays;

public class Q19_StringCumleyiTersineCevirme {
    public static void main(String[] args) {

        /*
   -----------------------------------------------------------------------------------------------------------------
        Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
   ------------------------------------------------------------------------------------------------------------------
         */

        String str= "Kodlama harika.";

        String[] arr = str.split("");

        String[] tersArr = new String[str.length()];
        int index =0;

        for (int i = str.length()-1 ; i>=0; i--) {
            tersArr[index] = arr[i];
            index++;
        }
        System.out.println(str);
        System.out.println(Arrays.toString(tersArr));

    }
}
