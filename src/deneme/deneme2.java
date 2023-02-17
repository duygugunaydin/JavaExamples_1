package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class deneme2 {

    public static void main(String[] args) {

        /*
        A palindrome is a word which reads the same backward or forward.
        'abcba' is a palindrome.
        Write a method that returns the longest palindrome substring of a given string.
         */

        String isim = "ama";
        String ters = "";

        for (int i = isim.length() - 1; i >= 0; i--) {
            ters += isim.charAt(i);
        }
        if (isim.equalsIgnoreCase(ters)) {
            System.out.println(isim + " palindrome'dur");
        } else {
            System.out.println(isim + " palindrome degildir");
        }

        System.out.println(isim);
        System.out.println(ters);


    }
}