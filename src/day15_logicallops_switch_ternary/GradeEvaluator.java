package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'D';


        if ((grade == 'A' || grade== 'a')|| (grade == 'B' || grade=='b') || (grade=='C' || grade == 'c')){
            System.out.println("Pass.with grade - " + grade);
        } else if (grade == 'D' || grade =='d'){
            System.out.println("Qualify fir retake. Garde -" + grade);
        } else if (grade =='E'){
            System.out.println("Fail.Grade - "+ grade);
        } else {
            System.out.println("Invalid grade");
        }
    }
}
