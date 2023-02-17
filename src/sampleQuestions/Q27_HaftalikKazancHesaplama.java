package sampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q27_HaftalikKazancHesaplama {

    public static void main(String[] args) {

        /*
            Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
            Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
            Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
            Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.

        1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
                  for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                  ortalama kazançtan yüksekse o günleri return yap.
        6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
                  for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                  ortalama kazançtan aşağıysa o günleri return yap.
         */

        Scanner scan = new Scanner(System.in);

        List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));

        List<Double> gunlukKazanclar = new ArrayList<>();
        int index =0 ;

        while (index<7){
            System.out.println("Lutfen " + gunler.get(index) + " gunu kazancinizi yaziniz :");
            gunlukKazanclar.add(scan.nextDouble());
            index++;
        }
        System.out.println("7 gunluk kazancinizin ortalamasi : "+getOrtalamaKazanc(gunlukKazanclar) + " TL");

        System.out.println("Ortalamanin ustunde kazanilan gunler : "+ getOrtalamaninUstundeKazancGunleri(gunlukKazanclar,gunler));

        System.out.println("Ortalamanin altinda kazanilan gunler : "+getOrtalamaninAltindaKazancGunleri(gunlukKazanclar,gunler));

    }
    private static double getOrtalamaKazanc(List<Double> list){

        double ort = 0;

        for (int i = 0; i <list.size() ; i++) {
            ort +=list.get(i);
        }
        ort /=7;

        return ort;
    }
    private static List<String> getOrtalamaninUstundeKazancGunleri(List<Double> list,List<String> gun){

        double ortalamaKazanc = getOrtalamaKazanc(list);
        List<String> ortalamaninUstundeKazancGunleri = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>ortalamaKazanc) {
                ortalamaninUstundeKazancGunleri.add(gun.get(i));
            }
        }
        return ortalamaninUstundeKazancGunleri;
    }
    private static List<String> getOrtalamaninAltindaKazancGunleri(List<Double> list,List<String>gun){

        double ortalamaKazanc = getOrtalamaKazanc(list);
        List<String> ortalamaninAltindaKazancGunleri = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<ortalamaKazanc) {
                ortalamaninAltindaKazancGunleri.add(gun.get(i));
            }
        }
        return ortalamaninAltindaKazancGunleri;
    }
}
