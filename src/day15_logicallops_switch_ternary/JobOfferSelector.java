package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean remote = true;
        boolean hasBenefits = true;

        if (location.equals("Honolulu") && salary >= 120_000.0 && remote && hasBenefits){
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
