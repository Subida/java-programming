package day30_arrays;

import java.util.Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data) {
            System.out.println(eachNum);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println("------ for loop----");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
//print last value iin array using length -1
        System.out.println("last value: " + data[data.length - 1]);

        //print all number backwards in same line
        for (int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
        System.out.println();
        int[] nums = new int[5];
        int a = 5;
        nums[2] = a;
        nums[0] = a * 2;
        nums[4] = nums[1] * a;
        nums[1] = nums[2];
        nums[3] = nums[a - 3];
        System.out.print(Arrays.toString(nums));
        System.out.println();
        double[] doub = new double[4];
        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4];
        doub[1] = 17.2;
        doub[3] = doub.length;
        System.out.print(Arrays.toString(doub));
        System.out.println();
        byte[] b = {1, 2, 3};
        for (int j = 0; j < b.length; j++) {
            b[j] = (byte) (b[j] * 2);
        }
        System.out.print(Arrays.toString(b));
        System.out.println();
        int[] nums1 = {14, 1, 84, 97, 1243, 46};
        int total = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                total += 5;
            } else {
                total += 10;
            }
        }
        System.out.println(total);
        String word = " Winter is coming ";
        word = word.trim();
        System.out.print(word.length());
        System.out.println();

        String a1 = "123";
        String b1 = 5 + 4 + a1;
        System.out.print(b1);

        System.out.println();

        String str = "the fox ran under the bridge";
        str = str.substring(4, 17);
        str.toUpperCase();
        System.out.println(str + "ground");

        String str1 = "The whole time it was raining.";
        do {
            System.out.print(str1.charAt(0));
            str1 = str.substring(3);
        }while(!str1.isEmpty());
    }
}