package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rant and month:");
        double rent = scan. nextDouble();
        scan.nextLine();
//        fix the bug. Work Around
        String month = scan. next();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
    }
}
