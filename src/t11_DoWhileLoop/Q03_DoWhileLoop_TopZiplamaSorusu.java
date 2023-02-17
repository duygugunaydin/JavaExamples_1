package t11_DoWhileLoop;

public class Q03_DoWhileLoop_TopZiplamaSorusu {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {

        double yukseklik = 3;
        double toplamYol= 0;
        int sekmeSayisi=0;

        do {
            toplamYol +=yukseklik;
            yukseklik = (yukseklik*3)/4;
            toplamYol += yukseklik;
            sekmeSayisi++;

        }while (yukseklik>1);

        System.out.println(toplamYol);
        System.out.println(sekmeSayisi);
    }

}
