package day21_string_manipulation;

public class FirstAndLast {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char second= word.charAt(1);
        char last = word.charAt(2);

        if (first== last) {
            System.out.println("first and last letter much");
        } else{
            System.out.println("first and last letters mismatch");
        }

        if(word.charAt(0)== word.charAt(2)){
            System.out.println("first and last letter much");
        } else{
            System.out.println("first and last letters mismatch");
        }

        String friend = "aziza";
        char firstLetter= friend.charAt(0);
        int count = friend.length();
        char lastLetter2 = friend.charAt(count-1);
        char lastLetter = friend.charAt(friend.length()-1);//count--;

        System.out.println(firstLetter);
        System.out.println(lastLetter);
        System.out.println(lastLetter2);

        if (firstLetter==lastLetter2){
            System.out.println(friend + "- first and last match");
        } else{
            System.out.println(friend + "- first and last mismatch");
        }
    }
}
