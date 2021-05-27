package day26_loops;

public class printChars {
    public static void main(String[] args) {
        String word = "application";
        System.out.println(word.indexOf("j"));
        System.out.println(word.charAt(2));
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        /**
         * System.out.println(word.length());
         *
         *         System.out.println(word.charAt(0));
         *         System.out.println(word.charAt(1));
         *         System.out.println(word.charAt(2));
         *         System.out.println(word.charAt(3));
          */
        /**
         * print word letters in reverse
         */
        for(int i= word.length() - 1 ; i >=  0; i--){
            System.out.print(word.charAt(i));
        }


    }
}
