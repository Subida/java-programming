package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        CheckEligible(876);
        CheckEligible(563);
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);
    }

    public static void CheckEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("you are eligible for leasing this car");
        }else{
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }

    public static int getCreditScore(){
        return 800;
    }
}
