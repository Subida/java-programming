package day29_nestedloop_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i < word.length(); i++){
            System.out.println("outer: " + word.charAt(i));
            int count=0;
            for (int k = 0; k < word.length(); k++){
                if(word.charAt(i)== word.charAt(k)){
                    count++;
                }
            }
            System.out.println(word.charAt(i) + "=" + count);

        }
    }
}
