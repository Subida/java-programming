package day16_seitch_ternary;

public class AdaireApartment {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numberOfBedrooms= 2;
        double startingPrice= 0.0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                    System.out.println(numberOfBedrooms + " bedroom are unavailable");
                    break;
        }
        System.out.println("Starting price: $" + startingPrice);
    }
}
