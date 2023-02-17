package t10_WhileLoop;

public class Q03_WhileLoop_Soru3 {
    public static void main(String[] args) {

        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        bu halini bize donduren bir method olusturun.
         */

        String giris = "Java ogrenmek cok guzel";
        terseCevirme("duygu gunaydin");
        System.out.println(terseCevirme(giris));

    }

    public static String terseCevirme (String input){

        int index = input.length()-1;
        String tersInput = "";

        while (index>=0){
            tersInput += input.substring(index,index+1);
            index--;
        }
        return tersInput;
    }
}
