package sampleQuestions;

public class Q30_xxx_Tc {
    public static void main(String[] args) {

        /*
             TC kimlik numarasının son rakamı çift olmak zorundadır.
             0 rakamı ile başlayamaz.
             ilk 10 rakamın toplamının birler basamağı >> 11. rakamı vermektedir.
             Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile
             2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı>>> 10. rakamı;
             1, 3, 5, 7 ve 9. rakamın toplamının
             8 katının birler basamağı 11. rakamı vermektedir.
         */

        int [] tcNo = {4,1,3,9,8,0,6,0,4,5,0};
        int toplam =0;

        for (int i = 0; i <tcNo.length-1 ; i++) {
            toplam+=tcNo[i];
        }
        if (toplam%10== tcNo[tcNo.length-1])
            System.out.println("ok");
        else
            System.out.println("no");

        toplam=0;
        for (int i = 0; i <tcNo.length ; i+=2) {
            toplam+=tcNo[i];
        }
        toplam*=7;


        /*  YARIM KALDI  */







    }
}
