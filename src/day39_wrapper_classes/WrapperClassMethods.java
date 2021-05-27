package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("min int: " + Integer.MIN_VALUE);
        System.out.println("max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("min double: " + Double.MIN_VALUE);
        System.out.println("max double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));//1. first larger thn second
        System.out.println(Double.compare(5, 5));// 0.- both equal
        System.out.println(Double.compare(5, 45));// -1.  first is smaller than second

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }
        String word = "Java iS fuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);
    }
}
