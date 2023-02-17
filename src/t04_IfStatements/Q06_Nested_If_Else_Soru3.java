package t04_IfStatements;

import java.util.Scanner;

public class Q06_Nested_If_Else_Soru3 {
    public static void main(String[] args) {

        /*
       Soru 3- Kullanicidan bir sayi alin
               Sayi tek ise negatif veya pozitif sayi oldugunu yazdirin,
               cift sayi ise 10'un tam kati olup olmadigini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if ((sayi%2) != 0){
            if (sayi<0) System.out.println("Negatıf tek sayi");
            else if (sayi>0) System.out.println("Pozitif tek sayi");

        } else {
            if (sayi%10 == 0 ) System.out.println("10'un tam katidir");
            else  System.out.println("10'un tam kati degildir");
        }


    }
}
