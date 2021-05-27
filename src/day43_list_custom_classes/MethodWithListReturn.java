package day43_list_custom_classes;



import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
        //1 second = 1_000_000_000 of a nanosecond
        long start = System.nanoTime();// get starting time
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need new Array...
        long end = System.nanoTime();// get ending time
        double ListSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList seconds = " + ListSeconds);

        long st = System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);

       // int[] arr =getIntegerArray();
        //System.out.println(mlnNums);
    }
    /**
     * getIntegerList
     * return List<Integer
     * Loop from 0 - 1000_000
     * and add to arraylist then return it
     */

    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 1_000_000; i ++){
            nums.add(i);
        }
        return nums;
    }
    /**
     * getIntegerArray
     * No params
     * return int[]
     * loop from 0 _ 1000_000
     * and add to arraylist then return it
     */

    public static int[] getIntegerArray(){
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        for(int i = 0; i <= 1_000_000; i++){
            nums[i]= i;
        }
        return nums;
    }

    /**
     * getDays
     */

}
