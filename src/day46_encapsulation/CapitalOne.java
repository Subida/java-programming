package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(431154324213L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");

        System.out.println("acc = " +acc);


    }


    public class Ball{
        boolean canBounce;
        String color;

        public static void main(String [] args){
            Ball ball = new Ball();
        }
    }
}
