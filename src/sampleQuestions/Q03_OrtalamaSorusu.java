package sampleQuestions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q03_OrtalamaSorusu {
    public static void main(String[] args) {

        /*
        3-kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçını
          ortalamanın altında,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dizini hangi buuklukte olacagini giriniz : ");
        int buyukluk = scan.nextInt();

        int[] arr = new int[buyukluk];
        int toplam = 0;
        Random rnd = new Random(100);


        for (int i = 0; i <buyukluk ; i++) {
            arr[i]=rnd.nextInt(100);
            toplam += arr[i];
        }
        double ortalama = toplam/buyukluk;
        int altsayac = 0;
        int ustsayac =0;
        int esitsayac =0;
        for (int i = 0; i <buyukluk ; i++) {
            if (arr[i]>ortalama){
                ustsayac++;
            }else if (arr[i]==ortalama){
                esitsayac++;
            }else {
                altsayac++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Ortalama : " + ortalama);
        System.out.println(altsayac + "tane sayi ortalama altindadir");
        System.out.println(ustsayac + "tane sayi ortalama ustundedir");
        System.out.println(esitsayac + "tane sayi ortalamaya esittir");



    }
}
