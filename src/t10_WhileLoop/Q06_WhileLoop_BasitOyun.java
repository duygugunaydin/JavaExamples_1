package t10_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Q06_WhileLoop_BasitOyun {
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
        int pcTutulanSayi=rnd.nextInt(1,100);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-100 arasi bir sayi tutun ve yazin");
        int tutulanSayi=scan.nextInt();

        boolean sonuc = false;
        int flag =1;

        while (sonuc==false){

            if (!(tutulanSayi==pcTutulanSayi)){

                if (pcTutulanSayi>tutulanSayi) {
                    System.out.println("Lutfen sayinizi buyultun");
                    tutulanSayi=scan.nextInt();
                    flag++;
                }
                else{
                    System.out.println("Lutfen sayinizi kucultun");
                    tutulanSayi=scan.nextInt();
                    flag++;
                }
            }else {
                sonuc=true;
                if (flag<=3) System.out.println("Vaowww, " + flag + " denemede sayiyi tahmin ettiniz");
                else if (flag<=8) System.out.println("Aferin, " + flag + " denemede sayiyi tahmin ettiniz");
                else System.out.println("Basarisiz, ancak " + flag + " denemede sayiyi tahmin edebildiniz");
            }
        }
    }
}
