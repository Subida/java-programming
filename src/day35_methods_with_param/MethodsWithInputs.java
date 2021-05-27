package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count);
        greetByName("Saim");
        greetByName("Nadir");
        String name = "Sulevman";
        greetByName(name);
    }

    public static void displayValue(int num){
        System.out.println("the value is " + num);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+" , how are you today?");
    }
}
