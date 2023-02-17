package t15_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_ForEachLoop_Soru1 {
    public static void main(String[] args) {
        
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, 
                tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
         */
        
        String[] isimler = {"ayse", "fatma", "yavuz", "ayse", "miray", "fatma" , "duygu", "yavuz"};

        List<String> benzersizList = new ArrayList<>();

        for (String each:isimler
             ) {
            if (!benzersizList.contains(each))
                benzersizList.add(each);
        }
        isimler = new String[benzersizList.size()];

        for (int i = 0; i <isimler.length ; i++) {
            isimler[i]=benzersizList.get(i);
        }
        System.out.println("Array'in yeni hali : " + Arrays.toString(isimler));
    }
}
