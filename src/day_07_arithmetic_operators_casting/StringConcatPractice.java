package day_07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args){
        System.out.println("java" + 5 + 3);
        System.out.println("java" + (5 + 3));
        System.out.println(5 + 3 + "java");
        System.out.println(5 + (3 + "java"));
        System.out.println("hello" + 1 + 2 + 3);
        System.out.println(("hello" + 1 + 2 + 3));
        System.out.println("hello" + (1 + 2 + 3));

        String star1 = "hello";
        String star2 = "friends";
        System.out.println(star1 + star2);
//        hello friends
        System.out.println(star1+" "+star2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);
        System.out.println(num1 + " " + num2);
        System.out.println(num1+"" +num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);
        System.out.println(char1 + "" + char2);


    }
}
