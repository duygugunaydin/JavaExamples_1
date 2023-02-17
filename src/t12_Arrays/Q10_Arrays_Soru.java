package t12_Arrays;

public class Q10_Arrays_Soru {
    public static void main(String[] args) {

        /*
          Write a Java program to calculate the average value of array elements
          Array elemanlarinin ortalama değerini hesaplayan bir Java programı yazın
         */

        int[] arr = {3,5,64,21,9,8,36};

        double ortalamaDeger = arraydeOrtalamaDegerHesaplamaMethodu(arr);
        System.out.println("Verilen Arrayin ortalama degeri : " + ortalamaDeger);

    }
    private static double arraydeOrtalamaDegerHesaplamaMethodu(int[] arr) {

        int toplam =0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        double ortalamaDeger=(double) toplam/arr.length;

        return ortalamaDeger;
    }
}
