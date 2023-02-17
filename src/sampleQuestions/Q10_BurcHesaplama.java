package sampleQuestions;
import java.util.Scanner;
public class Q10_BurcHesaplama {
    public static void main(String[] args) {
        /*
        Soru 19-) Kullanıcıdan doğum tarihini alınız.
                  Burcunu hesaplayan bir method yazınız.
                  ipucu:
                  Switch Case kullanabilirsiniz.
                  Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz gunu numarasini girin");
        int gun = scan.nextInt();
        System.out.println("Lutfen dogum ayinizi rakamla giriniz");
        int ay = scan.nextInt();

        String burc = burcHesaplamaMethodu(gun,ay);

        System.out.println("Burcunuz : " + burc);
    }
    public static String burcHesaplamaMethodu (int gunNo,int ayNo){

        String burcum = "";

        switch (ayNo){
            case 1 :
                if (1<=gunNo && gunNo<=20)
                    burcum = "Oglak";
                else if (21<=gunNo && gunNo<=31)
                    burcum = "Kova";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 2 :
                if (1<=gunNo && gunNo<=19)
                    burcum = "Kova";
                else if (20<=gunNo && gunNo<=29)
                    burcum = "Balik";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 3 :
                if (1<=gunNo && gunNo<=20)
                    burcum = "Balik";
                else if (21<=gunNo && gunNo<=31)
                    burcum = "Koc";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 4 :
                if (1<=gunNo && gunNo<=20)
                    burcum = "Koc";
                else if (21<=gunNo && gunNo<=30)
                    burcum = "Boga";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 5 :
                if (1<=gunNo && gunNo<=20)
                    burcum = "Boga";
                else if (21<=gunNo && gunNo<=31)
                    burcum = "Ikızler";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 6 :
                if (1<=gunNo && gunNo<=21)
                    burcum = "Ikızler";
                else if (22<=gunNo && gunNo<=30)
                    burcum = "Yengec";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 7 :
                if (1<=gunNo && gunNo<=22)
                    burcum = "Yengec";
                else if (23<=gunNo && gunNo<=31)
                    burcum = "Aslan";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 8 :
                if (1<=gunNo && gunNo<=23)
                    burcum = "Aslan";
                else if (24<=gunNo && gunNo<=31)
                    burcum = "Basak";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 9 :
                if (1<=gunNo && gunNo<=23)
                    burcum = "Basak";
                else if (24<=gunNo && gunNo<=30)
                    burcum = "Terazi";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 10 :
                if (1<=gunNo && gunNo<=23)
                    burcum = "Terazi";
                else if (24<=gunNo && gunNo<=31)
                    burcum = "Akrep";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 11 :
                if (1<=gunNo && gunNo<=22)
                    burcum = "Akrep";
                else if (23<=gunNo && gunNo<=30)
                    burcum = "Yay";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;
            case 12 :
                if (1<=gunNo && gunNo<=21)
                    burcum = "Yay";
                else if (22<=gunNo && gunNo<=31)
                    burcum = "Oglak";
                else
                    burcum = "Girdiginiz degerleri kontrol ediniz";
                break;

            default:
                burcum = "Girdiginiz degerleri kontrol ediniz";
        }
        return burcum;
    }
}
