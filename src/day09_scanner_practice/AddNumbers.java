package day09_scanner_practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.lang.model.SourceVersion;
import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;


public class AddNumbers {
    public static void main(String[] args){
//        creat scanner object
        Scanner scan = new Scanner(System.in);
//        as questiom
        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+ num2;
        System.out.println("Result: " +result);

    }
}
