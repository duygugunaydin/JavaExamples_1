package t15_ForEachLoop;

public class Q02_ForEachLoop_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
                karelerinin toplamini yazdiran bir method olusturun.
         */

        int[] arr = {2,6,3,8,7,5};

        arraydekiHerbirElemaninKareleriniToplamaMethodu(arr);
    }

    public static int arraydekiHerbirElemaninKareleriniToplamaMethodu (int[] arr){

        int toplam =0;

        for (int each:arr
             ) {
            toplam += each*each;
        }
        System.out.println("Arraydeki elemanlarin kareleri toplami : " + toplam);

        return toplam;
    }
}
