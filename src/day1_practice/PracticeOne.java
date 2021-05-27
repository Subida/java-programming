package day1_practice;
import java.util.*;
public class PracticeOne {
    public static void main(String[] args) {
        String str = method7("on the weekend", 20);
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        int[] a = new int[input.nextInt()];
        for(int i = 0; i<a.length; i++){
            a[i]= input.nextInt();
        }
        method8(a);
    }


    public static String method7(String str, int s) {
if(s<10){
    str = str.substring(8);
}else{
    if(str.length()>s){
        str="weekday";
    }else if(s>10){
        str= str.substring(7);
    }
}
return str;
}

   public static void method8(int [] arr){
        for(int n: arr){
            if(n%2==0){
                continue;
            }
            System.out.print(n);
        }
   }


   }