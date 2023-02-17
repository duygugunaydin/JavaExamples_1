package t07_StringManipulationsxxx;

public class Q03_StringManipulations_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan alinan metindeki istenmeyeen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler buyuk yapan bir program yazin.

                input : javæa 1ogRe€2@nMek3 #ne +Gu=zel n%e gßuz£el
                output : Java ogrenmek ne guzel
         */

        String input = "javæa 1ogRe€2@nMek3 #ne +Gu=zel n%e gßuz£el";

        String yeniInput = input.replaceAll("\\d","");
        yeniInput = yeniInput.replace(" ", "0");
        yeniInput = yeniInput.replaceAll("\\W","");
        yeniInput = yeniInput.replace("0"," " );

        yeniInput= yeniInput.toUpperCase().charAt(0) + yeniInput.substring(1, yeniInput.length()).toLowerCase();

        System.out.println(yeniInput);





    }
}
