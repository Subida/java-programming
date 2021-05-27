package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <=200;i++){
            if(i % 3==0 && i % 5 ==0){
                System.out.println("FizzBuzz number");
            } else if (i % 3 ==0){
                System.out.println("fizz");
            }else if (i % 5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }

        }
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);
        System.out.println(s2);
    }
}
