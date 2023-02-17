package t12_Arrays;

public class Q4_Arrays_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
                ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        */

    String[] arr = {"elma" , "armut" , "muz" , "kivi" , "cilek" , "elma" , "muz"};

    arraydeIstenenElemanBulma(arr,"m");

}

    public static void arraydeIstenenElemanBulma (String [] arr,String aranacakEleman){

        int flag = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(aranacakEleman))
                flag++;
        }
        if (flag>0)
            System.out.println("Aradiginiz eleman listenin icinde " + flag + " tane var");
        else
            System.out.println("Aradiginiz eleman listede yok");

    }
}
