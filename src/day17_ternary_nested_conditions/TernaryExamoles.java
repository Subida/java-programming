package day17_ternary_nested_conditions;

public class TernaryExamoles {
    public static void main(String[] args) {
        int score = 80;
        String result = (score > 60) ? "pass" : "fail";
        System.out.println("Result: " + result);
        String quality = "bad";
        int x = quality.equals("good") ? 100 : 0;
        System.out.println("x: " + x);

        int score2 = 100;
        char grade = (score2 > 90) ? 'A' : 'B';
        System.out.println("grade: " + grade);

        int num = 2;
        boolean b = true;
        switch(num){
            case 0:
                b = false;
            case 1:
                System.out.println(1);
            case 2:
                if(b){
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if(b){
                    System.out.println(3);
                    b = false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.println(5);

        }
    }
}