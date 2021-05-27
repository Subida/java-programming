package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply =(hourlyRate >45) ? "accept" : "reject";
        System.out.println("reply: "+ reply);


        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "saim| murodil" : "nadir";
        System.out.println("todays teacher : "+ teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "yes" : "no";
        System.out.println("Is eligible to drive: " + driving);
    }
}