package t08_ForLoopsxxx;

import java.util.Scanner;

public class Q04_ForLoop_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplanacak sayilarin bslangic ve bitis degerini giriniz");
        int baslangicSayi = scan.nextInt();
        int bitisSayisi = scan.nextInt();
        int toplam = 0;

        if (baslangicSayi<bitisSayisi) {
            for (int i = baslangicSayi; i <= bitisSayisi; i++) {
                toplam += i;
            }
            System.out.println("Verdiginiz araliktaki rakamlarin toplami : " + toplam);
        }else if (baslangicSayi>bitisSayisi){
            for (int i = bitisSayisi; i <= baslangicSayi; i++) {
                toplam += i;
            }
            System.out.println("Verdiginiz araliktaki rakamlarin toplami : " + toplam);
        }


    }
}
