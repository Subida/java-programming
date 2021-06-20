package day49_static;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class BankAccount {
    static double balance = 500.0;
    String user;

    public void spend(double amount){
        System.out.println(user + " is spending $" + amount);
        balance -= amount;

    }
    public void showBalance(){
        System.out.println("Current balance = " + balance);
    }



}
