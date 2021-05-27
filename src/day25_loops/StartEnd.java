package day25_loops;
import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter start");
        int start =scan.nextInt();
        System.out.println("enter end");
        int end = scan.nextInt();
        for( int i = start; i <= end; i++){
            System.out.println(i + " ");
        }
        System.out.println("reverse numbering is not supported");

    }
}
