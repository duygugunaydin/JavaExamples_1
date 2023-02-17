package t12_Arrays;

public class Q6_Arrays_Soru6 {
    public static void main(String[] args) {

        /*
        Soru 6-
        Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
         */


        String[] input = {"Duygu","Miray","Ebru","Yasemin","Adus","Arda","Ceren"};

        enKisaveEnUzunKelimeleriYaz(input);
    }

    public static void enKisaveEnUzunKelimeleriYaz (String [] arr){

        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (enKisaKelime.length()>arr[i].length()){
                enKisaKelime=arr[i];
            }
            if (enUzunKelime.length()<arr[i].length()){
                enUzunKelime=arr[i];
            }
        }
        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kisa kelime : " + enKisaKelime);
    }
}
