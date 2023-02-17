package t12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Kullanicidan yeni isimler alip, var olan bir array'e ekleyen bir method olusturun
        // Kullanici yeni deger verdigi muddetce C10'daki hazir method'u kullanarak eklemeye devam edin
        // Kullanici Q'ya bastiginda, array'in son halini döndürün

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arraye eklenecek isim giriniz");
        String eklenecekIsim = scan.nextLine();
        String [] str = {eklenecekIsim};

        while (!(eklenecekIsim.equalsIgnoreCase("q"))){

            System.out.println("Lutfen arraye eklenecek yeni ismi giriniz" +
                    "\nBitirmek isterseniz q'ya basiniz.");
            eklenecekIsim=scan.nextLine();
            if (eklenecekIsim.equalsIgnoreCase("q")) {
                System.out.println(Arrays.toString(str));
                break;
            }    else{
                str = arreyeElemanEkleme(str, eklenecekIsim);
            }
        }
    }

    public static String [] arreyeElemanEkleme (String[] arr , String eklenecekEleman){

        String[] yeniArr = new String[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;

        return yeniArr;

    }
}
