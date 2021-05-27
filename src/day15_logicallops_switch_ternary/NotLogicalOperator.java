package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!ture = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat.age = " + age);
        }

        boolean isSmokingAllowed = false;
//        if soking is not allowed; print "Smoking is now allowed here. Exit."
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit.");
        }

        boolean isAffordable = false;
        if (!isAffordable){
            System.out.println("Item is not affordable");
        }
        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = " Tesla";
//        if its not Tesla, print" Not interested"
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested, thank you");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }

        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
        if(!inputPassword.equals("abc123")){
            System.out.println(("correct password"));
        } else {
            System.out.println("invalid password");
        }



    }
}



