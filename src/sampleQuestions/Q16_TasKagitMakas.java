package sampleQuestions;

import java.util.Random;
import java.util.Scanner;

public class Q16_TasKagitMakas {
    public static void main(String[] args) {

        /*
        bilgisayarla kendinizin arasında oynayabiliceginiz bir taş kağıt makas oyunu kodlayın
        taraflardan biri 3 kazanma sayısına varana kadar oyun devam etsin
        oyun sonunda outputta
        *oyunu kazanan (yani  ilk önce 3 sayı alan)
        *sizin kazandıgınız el sayısı
        *bilgisayarın kazandıgı el sayısı
        yazsın
         bilgisayarla sizin seciminizin aynı olabiliceği durumları unutmayın
         aynı oldugu durumlarda tekrar secim sunulsun size
         */

        Scanner scan = new Scanner(System.in);
        int compChoise;
        int userChoise;

        int compScore = 0;
        int userScore = 0;


        while (compScore < 3 && userScore < 3) {

            Random rnd = new Random();
            compChoise = rnd.nextInt(1, 3);

            System.out.println("Asagidakilerden birini seciniz : " +
                    "\n1 - Tas \n2 - Kagit  \n3 - Makas");
            userChoise = scan.nextInt();


            if (userChoise > 3 || userChoise < 1){
                System.out.println("Girilen deger hatali, lutfen sayiyi 1, 2 veya 3  giriniz");
            }else {
                if (compChoise == 1) {
                    System.out.println("===== Bilgisayar tas =====");

                    if (userChoise == 1) {

                        System.out.println("===== Oyuncu tas =====");
                        System.out.println("Berabere!");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    } else if (userChoise == 2) {

                        userScore++;
                        System.out.println("===== Oyuncu Kagit =====");
                        System.out.println("Kagit Tasi sarar! -- Oyuncu +1 ");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);


                    } else if (userChoise == 3) {

                        compScore++;
                        System.out.println("===== Oyuncu Makas =====");
                        System.out.println("Tas Makasi kirar! -- Bilgisayar +1");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    }
                } else if (compChoise == 2) {
                    System.out.println("===== Bilgisayar Kagit =====");

                    if (userChoise == 1) {
                        compScore++;
                        System.out.println("===== Oyuncu tas =====");
                        System.out.println("Kagit Tasi sarar! -- Bilgisayar +1 ");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    } else if (userChoise == 2) {
                        System.out.println("===== Oyuncu Kagit =====");
                        System.out.println("Berabere!");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    } else if (userChoise == 3) {

                        userScore++;
                        System.out.println("===== Oyuncu Makas =====");
                        System.out.println("Makas Kagidi keser! -- Oyuncu +1");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    }
                } else if (compChoise == 3) {

                    System.out.println("===== Bilgisayar Makas =====");

                    if (userChoise == 1) {

                        userScore++;
                        System.out.println("===== Oyuncu tas =====");
                        System.out.println("Tas Makasi kirar! -- Oyuncu +1");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    } else if (userChoise == 2) {

                        compScore++;
                        System.out.println("===== Oyuncu Kagit =====");
                        System.out.println("Makas Kagidi keser! -- Bilgisayar +1");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);

                    } else if (userChoise == 3) {

                        System.out.println("===== Oyuncu Makas =====");
                        System.out.println("Berabere!");
                        System.out.println("Oyuncu : " + userScore + " // Bilgisayar : " + compScore);
                    }
                }
            }
            System.out.println("Pc'nin girdigi deger : " + compChoise);
            System.out.println("Senin girdigin deger : " +userChoise);
        }


        if(userScore>compScore) {
            System.out.println("Pc puani : " + compScore);
            System.out.println("Tebrikler " + userScore + " puanla siz kazandiniz");
        }else {
            System.out.println("Sizin puani : " + userScore);
            System.out.println("Malesef kaybettiniz " + compScore + " puanla pc kazandi");
        }
    }
}
