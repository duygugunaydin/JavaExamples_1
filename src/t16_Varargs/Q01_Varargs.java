package t16_Varargs;

public class Q01_Varargs {

    public static void main(String[] args) {

        /*
               Soru 42-)
               Parametre olarak birden fazla tamsayı (integer) kabul eden
               ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
               Method name=sum
               eğer metodu bu şekilde çağırırsanız
                 toplam(1,2,3) çıktı =6
                 toplam(1,2,3,4,5) çıktı =15
               	 sum(1,2) output=3
               Ipucu:  varargs sorusu, varargs olusturalım
            */

        sum(1,2,3);
        sum(1,2,3,4,5);
        sum(1,2);

    }

    private static void sum (int ...sayilar){

        int toplam =0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Giirilen sayilarin toplami : "+toplam);

    }
}
