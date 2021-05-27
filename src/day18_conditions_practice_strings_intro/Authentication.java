package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN= 1234;
        int expPinCode = 4321;

        int last4SSN= 1234;
        int pinCode= 4321;

        if (last4SSN == expLast4SSN && pinCode == expPinCode){
            System.out.println("authentication successful");
        } else {
            System.out.println("authentication unsuccessful");
            if (last4SSN != expLast4SSN){
                System.out.println("last 4 SSN number is incorrect");
            }
        }
    }
}
