package sampleQuestions;

public class Q22_ArrayinOrtadakiElemaniniBulma {
    public static void main(String[] args) {

        /*
        Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz
         */

        int [] arr = {1,2,3,4,5,6,7};

        int ortadakiIndex = arr.length/2;

        if (arr.length%2==0){
            System.out.println(arr[ortadakiIndex-1] + " , " + arr[ortadakiIndex]);
        }else {
            System.out.println(arr[ortadakiIndex]);
        }




    }
}
