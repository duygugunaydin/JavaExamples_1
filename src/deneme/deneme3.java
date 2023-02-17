package deneme;

public class deneme3 {
    public static void main(String[] args) {


    }

    public static String findLongestPalindromeInternal(String word) {
        String longestPalindrome;

        int index = word.length();
        while (index > 0 && !isPalindrome(word.substring(0, index))) {
            index--;
        }
        longestPalindrome = word.substring(0, index);

        return longestPalindrome;
    }

    public static boolean isPalindrome(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
