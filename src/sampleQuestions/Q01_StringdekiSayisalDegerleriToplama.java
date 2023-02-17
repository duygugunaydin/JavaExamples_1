package sampleQuestions;

import java.util.Scanner;

public class Q01_StringdekiSayisalDegerleriToplama {
    public static void main(String[] args) {

        // 1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.next();

        System.out.println("Yazdiginiz kelimenin sayisal deger toplami : " +
                stringIfadeninSayisalDegeriniToplamaMethodu(str));

    }

    public static int stringIfadeninSayisalDegeriniToplamaMethodu (String str){

        int toplam =0;

        for (int i = 0; i <str.length() ; i++) {
            toplam+=str.charAt(i);
        }
        return toplam;
    }
}
