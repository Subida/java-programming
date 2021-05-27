package day09_scanner_practice;

import java.util.Scanner;


public class Miles2kKmConverter {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("######## Miles To KM Converter######");
        System.out.println("Enter miles:");
//        double miles = 10;
        double miles= scan.nextDouble();
        double Kilometers = miles * 1.609;
        System.out.println(miles + " in kilometers: "+ Kilometers);


    }
}
