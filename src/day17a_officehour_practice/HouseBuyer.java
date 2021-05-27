package day17a_officehour_practice;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Hills";
        double price, rating ;
        boolean gated, allowsPet;
        switch (name){
            case "Hills":
                price = 89000;
                rating = 4.0;
                gated = false;
                allowsPet = true;
                break;
            case "Oak":
                price = 75000;
                rating = 3.5;
                gated = false;
                allowsPet = true;
                break;
            case "Highland":
                price = 150000;
                rating = 4.8;
                gated = true;
                allowsPet = true;
                break;
            default:
                name = "Invalid name";
                price = 0;
                rating = 0;
                gated = false;
                allowsPet = false;

        }
        System.out.println("name = "+ name);
        System.out.println("price = " + price);
        System.out.println("rating = "+ rating);
        System.out.println("gated = " + gated);
        System.out.println("allowPets =" + allowsPet);
    }
}
