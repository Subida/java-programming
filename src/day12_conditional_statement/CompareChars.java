package day12_conditional_statement;

public class CompareChars {
    public static void main(String[] ars){
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter2 > letter1);

        char grade = 'E';
         boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);
    }
}
