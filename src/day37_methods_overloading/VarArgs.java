package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 34, 45, 45, 23, 454, 65675, 6, 56365, 6546);
        addNumbers();
    }


    /////// varargs
    public static void addNumbers(int... nums) {
        //inside the method, it is used as regular array
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }

}