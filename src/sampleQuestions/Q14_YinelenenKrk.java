package sampleQuestions;

import java.util.Arrays;

public class Q14_YinelenenKrk {
    public static void main(String[] args) {

        /*
        --------------------------------------------------------------------------------------------------------------
        Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın. ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
               Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
               bu yüzden iç içe loop kullanmak mantıklı duruyor
        -----------------------------------------------------------------------------------------------------------------
         */


        String str = "JavacokkolayJ";

        System.out.println(Arrays.toString(yinelenenKarakterleriYazdirMethodu(str)));
    }
    public static String[] yinelenenKarakterleriYazdirMethodu(String str) {

        String yinelenenKrk = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) &&
                    !(yinelenenKrk.contains(str.substring(i,i+1)))) {
                yinelenenKrk += str.charAt(i);
            }
        }
        String[] arr = yinelenenKrk.split("");

        return arr;
    }
}
