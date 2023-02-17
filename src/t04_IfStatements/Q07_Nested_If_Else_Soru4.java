package t04_IfStatements;

import java.util.Scanner;

public class Q07_Nested_If_Else_Soru4 {
    public static void main(String[] args) {

        /*
        Soru 4  - Kullanıcıdan gunun ismini girmesini isteyin,
                 girilen gun hafta ici bir gun ise "Simdi calısma zamani tatile ... gun var.",
                 girilen gun hafta sonu ise "Simdi dinlenme zamani" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun numarasi giriniz");
        int gunNo = scan.nextInt();

        if (gunNo>=1 && gunNo<=5){
            System.out.println("Simdi calısma zamani tatile " + (6-gunNo) + " gun var.");

        } else if (gunNo==6 || gunNo==7) {
            System.out.println("Simdi dinlenme zamani");

        }else {
            System.out.println("Hatali gun girisi");
        }

    }
}
