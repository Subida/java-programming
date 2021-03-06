package day29_nestedloop_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ArraysIntro {
    public static void main(String[] args) {
        int num =10; //single variable
        int[] nums = new int[3];//array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 0 = " + nums[1]);
        System.out.println("value at index 0 = " + nums[2]);

        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);//10
// hpw tp find put the size of the array
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change the values in the array
        nums[0] = 100;
        nums[1] = 300;
        //read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
    }
}
