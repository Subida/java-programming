package day09_scanner_practice;
import java.util.Scanner;

public class AboutPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      boolean isTall = scan.nextBoolean();
      boolean isFast = scan.nextBoolean();
      boolean isFlexibale = scan.nextBoolean();
      String sport = "";
      if (isTall){
          if(isFast){
              sport = "basketball";
          }else if(isFlexibale){
              sport = "gymnastics";
          }else{
              sport = "volleyball";
          }
      }else {
          if(isFast){
              sport = "soccer";
          }else{
              sport = "tennis";
          }
      }
        System.out.println(sport);
    }
}
