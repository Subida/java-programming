package day04_variables_intro;

public class VaviableNamingRules {
    public static void main(String[] args){
        int static2=22;
        int _static=22;
        int $tatic=44;
        int staticVar=234;

        int salary$=55;
        //int 1stMonthSalary=3000;->error, cannot start with number
        int $=10;
        System.out.println($);
        //abo ve variable work fine, but not recommended.
        //we should use meaningful variable name.
        //int number-of-friends=400;->error
        int numberOfFriends=400;
        int number_of_friends=40;
        //not convention

        //int 1stNum=100->cannot start with numbers

    }
}
