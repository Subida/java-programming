package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 10; k++){
            System.out.print("* ");
            }
            System.out.println();
        }
        for(int outer = 1; outer <= 10; outer++){
            for (int inner = 1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();// go to new/ next line
        }
        for(int outer = 1; outer <=10; outer++){
            for (int inner = 10; inner >= outer; inner--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
