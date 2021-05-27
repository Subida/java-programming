package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args){
        /**
         *below is infinite loop with for loop like: while(true){ }
         *  for(;;){
         *             System.out.println("Java is fun!");
         *         }
         */
        for(int i =0; i <= 5;i++){
            System.out.println("hello world");
        }

        //fro loop: 1-10. print the numbers
        //1)   2)  3)  4)  5)
        for(int i =1; i <=10;i++){
            System.out.println(i);
        }
    }
}
