package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand ="Apple";
        String model ="iPhone11";
        String color ="gold";
        double price =699.0;
        short storage=256;
        boolean hasCamera=true;

        System.out.println(brand);
        System.out.println(model);
//        with message

        System.out.println("brand is " + brand);
        System.out.println("brand is" + brand);
        System.out.println("Color is "+color);
        System.out.println("Price is $"+price);
        System.out.println("Storage is "+storage+"GB");
        System.out.println("Has Camera?- "+ hasCamera);
    }
}
