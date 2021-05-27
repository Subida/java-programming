package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek";
        String password = "Abc123";
        if (expUserName.equalsIgnoreCase(userName) && expPassword.equalsIgnoreCase(password)) {
            System.out.println("Pass- user logged in successfully");
        }else{
            if(!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Fail- username is incorrect");
            } else{
                System.out.println("Fail- password is incorrect");
            }
        }
    }
}
