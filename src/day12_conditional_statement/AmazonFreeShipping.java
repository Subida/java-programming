package day12_conditional_statement;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your oder total price;");
        double totalPrice = scan.nextDouble();

        if(totalPrice >= 25.0){
            System.out.println("Free Shipping Eligible. Your order total: $" + totalPrice);
        } else{
            System.out.println("Not eligible gor free shipping. your order total: $"+ totalPrice);
        }
        System.out.println("Thank you"
        );




    }
}
