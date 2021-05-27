package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");//POSTIVE TEST/SUNNY DAY
        loginVoid("cybertek", "answer");//NEGATIVE TEST/RAINY DAY SCENARIO
        //System.out.println(loginvoid("cybertekStudent", "abc123"))' error-void-no return value
        System.out.println(login("cybertekStudent", "abc123"));
        if(login("cybertekStudent", "abc123")){
            System.out.println("login successful, welcome to canvas");
            System.out.println("select the course to continue");
        }else{
            System.out.println("login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountain")){
            System.out.println("welcome to canvas. select course or calendar");
        }else{
            System.out.println("login failed");
        }

    }

    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("Login successful, welcome CybertekStudent!");
        }else{
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            return true;   //return true, and exit method here
            //return userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword);
        }


        return false;
    }
}
