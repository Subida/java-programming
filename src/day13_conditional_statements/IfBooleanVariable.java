package day13_conditional_statements;

public class IfBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
//        if(isHungry == true){
//    }
        if (isHungry) {
            System.out.println("I am hungry, i will go get something to eat.");
            System.out.println("Then code java!");
        } else {
            System.out.println("I am not hungry, I will keeping coding java!");
        }

        double price = 130.44;
        boolean isAffordable = 200 >= price;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable){
            System.out.println("I can afford it, lets buy!");
        }else {
            System.out.println(" Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = false;
//        if it not remoteJob print "Sorry i am not interested"
//        otherwise, print " Sure I am interested, what is the interview process?"
        if(! isRemoteJob){
//            if(!isRemoteJob)
            System.out.println("Sorry i am not interested");
        } else{
            System.out.println("Sure I am interested, what is the interview process?");
        }

    }
}
