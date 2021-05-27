package day15_logicallops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Ford";
        double carPrice= 4999.0;
        if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda")){
            System.out.println("Ready for purchase model = " + model + " price= " + carPrice);
        } else {
            System.out.println("Not interested in model = "+ model + " price= " + carPrice);
        }

    }
}
