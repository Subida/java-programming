package day42_arraylist;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args){
        //declare Integer arrayList with following numbers
        List<Integer>nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList = " + uniqueList);

    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new arrayList to store unique number
        List<Integer>uniqueList = new ArrayList<>();
        //loop through the list
        for(Integer num: nums){
            //check if number appears only once in the list
            if(Collections.frequency(nums, num) ==1){
                //print that number
                System.out.print(num + " ");
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}
