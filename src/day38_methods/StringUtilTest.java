package day38_methods;
import static day38_methods.StringUtils.*;
//import all static methods.so that you can just call by method name, without class name
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(isNullOrEmpty(userName)){
            System.out.println("Fail: Username cannot be null or empty");
        }
        System.out.println("isPlaindrome(civic) = " + isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + isPalindrome("kayak"));

        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word " + word);
        System.out.println("revWord " + revWord);
        System.out.println(StringUtils.reverse(word));

    }
}
