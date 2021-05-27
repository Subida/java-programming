package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        // word.substring(startIndex,EndIndex
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8,11));

        //second way : substring(startIndex0- IT ILL READ FROM START UNTIL END
        System.out.println(word.substring(8));
        //print is fun
        System.out.println(word.substring(5));

        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C','D');
        System.out.println(ta);






    }
}
