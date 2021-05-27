package day1_practice;

import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = method9(scan.next(), scan.next(), scan.next());
        System.out.print(str1);
    }

    public static char middle(String s) {
        return s.charAt(s.length() / 2);
    }

    public static String method9(String one, String two, String three) {
        return "" + middle(one) + middle(two) + middle(three);
    }
}