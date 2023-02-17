package sampleQuestions;

public class Q20_StringIcindekiRakamlarToplami {
    public static void main(String[] args) {

        /*
        Soru 34-)
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların
        toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu      : Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                     Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */

        String str = "ade1r4d3";

        String strSayilar = str.replaceAll("\\D" , "");

        int toplam =0;

        for (int i = 0; i <strSayilar.length() ; i++) {
            toplam += Integer.parseInt(strSayilar.substring(i,i+1));
        }
        System.out.println(str + " metnindeki sayilarin toplami : " + toplam);
    }
}
