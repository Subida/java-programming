package day40_arraylist;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java");ERROR
        System.out.println("size " + nums.size());

        //reading from arraylist
        System.out.println("index 0 = "+ nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println(nums.get(3)); indexOutofboundsexception

        //print all values in same line:
        System.out.println(nums); // Array.toString(numArray)

        nums.remove(1);//remove element at index 1
        System.out.println(nums);

    }
}
