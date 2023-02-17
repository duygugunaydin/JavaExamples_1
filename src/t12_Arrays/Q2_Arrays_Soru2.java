package t12_Arrays;

public class Q2_Arrays_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
                sonucu bize donduren bir method yaziniz
         */

        int [] myArray = { 5, 56, 78, 41, 20, 56, 44};

        System.out.println(arrayinElemanSayilariniToplama(myArray));


    }

    public static int arrayinElemanSayilariniToplama (int[] arr){

        int toplam = 0 ;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        return toplam;
    }
}
