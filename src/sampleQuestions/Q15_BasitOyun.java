package sampleQuestions;

import java.util.Random;
import java.util.Scanner;

public class Q15_BasitOyun {
    public static void main(String[] args) {

        /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */

        Random rnd = new Random();
        int pcTahmin=rnd.nextInt(1,100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-100 arasi bir sayi tutun ve yazin");
        int kisiTahmin;

        boolean sonuc = false;
        int flag =0;

        while (sonuc==false){

            kisiTahmin=scan.nextInt();

            if (!(kisiTahmin==pcTahmin)){

                if (pcTahmin>kisiTahmin) {
                    flag++;
                    System.out.println("Lutfen sayinizi arttirin");
                }
                else{
                    flag++;
                    System.out.println("Lutfen sayinizi azaltin");
                }
            }else {
                flag++;
                sonuc=true;
            }
        }
        if (flag<=3) System.out.println("Vaowww, " + flag + " denemede sayiyi tahmin ettiniz");
        else if (flag<=8) System.out.println("Aferin, " + flag + " denemede sayiyi tahmin ettiniz");
        else System.out.println("Basarisiz, ancak " + flag + " denemede sayiyi tahmin edebildiniz");
    }
}
