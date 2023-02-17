package t13_MultiDimensionalArrays;

public class Q1_MDA_Soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
                sonucu yazdiran birmethod olusturun.
         */

        int[][] arr = {{12,8,7},{5,2,10,91,28,},{6,45,24},{22,19,23},{88,6,4}};
        int toplam = 0 ;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Cİft sayilarin toplami : " + toplam);

    }
}
