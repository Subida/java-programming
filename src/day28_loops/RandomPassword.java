package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password ="";
        for(int i = 1; i <= 8; i++){
            //System.out.println(random.nextInt(21));
            int index = random.nextInt(71);// random num 0-70
            System.out.print(source.charAt(index));
           // password= password + source.charAt(index);
            password += source.charAt(index);

        }
        System.out.println("\nyour password = " + password);

    }
}
