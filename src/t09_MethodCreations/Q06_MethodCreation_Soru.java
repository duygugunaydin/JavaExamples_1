package t09_MethodCreations;

public class Q06_MethodCreation_Soru {
    public static void main(String[] args) {

        /*
         * Interview question
         *
         * write a return method that can find the frequency of characters (with case
         * sensitivity)
         *
         * Input = AAABBCDD output = A3B2C1D2
         */

        String input = "AAABBCDD";

        String frequency = kelimelerdekiHarflerinSayilariniBulmaMethodu(input);

        System.out.println(frequency);
    }

    private static String kelimelerdekiHarflerinSayilariniBulmaMethodu(String input){

        String frequency = "";
        int count = 0;

        for (int i = 0; i <input.length() ; i++) {
            for (int j = 0; j <input.length(); j++) {
                if (input.substring(i, i + 1).equals(input.substring(j, j + 1))) {
                    count++;
                }
            }
            if (!frequency.contains(input.substring(i,i+1))){
                frequency += input.substring(i,i+1) + count;
            }
            count=0;
        }
        return frequency;
    }
}

