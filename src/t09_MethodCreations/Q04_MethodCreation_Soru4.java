package t09_MethodCreations;

import java.util.Scanner;

public class Q04_MethodCreation_Soru4 {
    public static void main(String[] args) {

        /*  Soru 4 -
            Kullanicidan main method icinde bir tamsayi alin.
            Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        String pozitifBolenler = bolenSayisiBulma(girilenSayi);

        System.out.println(pozitifBolenler);

    }

    public static String bolenSayisiBulma (int input){


        String pozitifBolenler = "";
        int flag = 0;

        for (int i = 1; i <= input; i++) {
            if (input%i==0){
                pozitifBolenler += i + " " ;
                flag++;
            }
        }
        System.out.println(flag + " tane boleni var");
        return pozitifBolenler;

    }
}
