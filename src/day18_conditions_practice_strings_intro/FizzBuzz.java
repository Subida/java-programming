package day18_conditions_practice_strings_intro;



public class FizzBuzz {
    public static void main(String[] args) {
        int num =15;
        if (num%3==0&&num%5==0){
            System.out.println(num + " is FizzBuzz");
        } else if (num % 3 ==0){
            System.out.println(num + " is Fizz");
        } else if (num%5==0){
            System.out.println(num + " is Buzz");
        } else {
            System.out.println(num);
        }

    }
}
