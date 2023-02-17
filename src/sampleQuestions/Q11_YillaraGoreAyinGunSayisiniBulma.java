package sampleQuestions;

import java.util.Scanner;

public class Q11_YillaraGoreAyinGunSayisiniBulma {
    public static void main(String[] args) {

        /*
        Soru 21-) Bir aydaki gün sayısını bulmak için bir Java programı yazın
                  Mülakat Sorusu / Interview Sorusu / Leak Year
                  Örnek:
                  Bir ay numarası girin: 2
                  Bir yıl girin: 2016

                  Şubat 2016'da 29 gün vardır
                  ipucu:
                  Switch Case kullanarak çözebiliriz.
                  Şubat ayı senelere göre farklılık gösterir.
                  Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz");
        int ayNo = scan.nextInt();
        System.out.println("Lutfen bir yil giriniz");
        int yilNo = scan.nextInt();

        switch (ayNo){
            case 1 :
                    System.out.println("Ocak " + yilNo+ " yilinda 31 gün vardır");
                break;
            case 2 :
                if (artikYilMi(yilNo))
                    System.out.println("Subat " + yilNo + " yilinda 29 gün vardır");
                else
                    System.out.println("Subat " + yilNo + " yilinda 28 gün vardır");
                break;
            case 3 :
                    System.out.println("Mart " + yilNo + " yilinda 31 gün vardır");
                break;
            case 4 :
                    System.out.println("Nisan " + yilNo + " yilinda 30 gün vardır");
                break;
            case 5 :
                    System.out.println("Mayis " + yilNo + " yilinda 31 gün vardır");
                break;
            case 6 :
                    System.out.println("Haziran " + yilNo + " yilinda 30 gün vardır");
                break;
            case 7 :
                    System.out.println("Temmuz " + yilNo + " yilinda 31 gün vardır");
                break;
            case 8 :
                    System.out.println("Agustos " + yilNo + " yilinda 31 gün vardır");
                break;
            case 9 :
                    System.out.println("Eylul " + yilNo + " yilinda 30 gün vardır");
                break;
            case 10 :
                    System.out.println("Ekim " + yilNo + " yilinda 31 gün vardır");
                break;
            case 11 :
                    System.out.println("Kasim " + yilNo + " yilinda 30 gün vardır");
                break;
            case 12 :
                    System.out.println("Aralik " + yilNo + " yilinda 31 gün vardır");
                break;
            default:
                System.out.println("Girdiginiz ay numarasini kontrol ediniz");
        }
    }
    public static boolean artikYilMi (int yilNo){
        boolean artikYilMi;

        if (yilNo%4==0) {
            if (yilNo % 100 == 0) {
                if (yilNo % 400 == 0)
                    artikYilMi = true;
                else
                    artikYilMi = false;
            } else
                artikYilMi=true;
        }else
            artikYilMi=false;

        return artikYilMi;
    }
}
