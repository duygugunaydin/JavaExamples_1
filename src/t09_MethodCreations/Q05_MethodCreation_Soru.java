package t09_MethodCreations;

import java.util.Scanner;

public class Q05_MethodCreation_Soru {
    public static void main(String[] args) {

        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cevirmek istediginiz birimi giriniz : \n(saat, mil, kg)");
        String birim = scan.next();
        System.out.println("Lutfen cevirmek istediginiz sayiyi giriniz :");
        double sayi = scan.nextInt();

        birimDonusturmeMethodu(birim,sayi);
        birimDonusturmeMethodu("saat",5);
        birimDonusturmeMethodu("mil",5);
        birimDonusturmeMethodu("Kg",3.2);

    }

    private static void birimDonusturmeMethodu (String birim, double sayi) {

        switch (birim.toLowerCase()){
            case "saat" :
                System.out.println(sayi + " saat " + sayi*60 + " dakikadir");
                break;
            case "mil" :
                System.out.println(sayi + " mil " + sayi*1.6 + " km'dir");
                break;
            case "kg" :
                System.out.println(sayi + " kg " + sayi*1000 + " gramdir");
                break;
            default :
                System.out.println("Girilen bilgiler hatalidir");
        }

    }
}

