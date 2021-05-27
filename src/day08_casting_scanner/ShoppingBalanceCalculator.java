package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.00;

        double remainingBalance = balance - price1 - price2 - price3;
//        double remainingBalance= balance - (price1+ price2+ price3);
        System.out.println("your initial balance: $" + balance);
        System.out.println("your remaining balance: $" + remainingBalance);

        int balanceWithoutCents = (int) remainingBalance;
        System.out.println(remainingBalance);
    System.out.println("yuor remaining balance without cents : $"+balanceWithoutCents);


    }

}
