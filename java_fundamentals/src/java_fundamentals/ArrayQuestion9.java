package java_fundamentals;

import java.util.Arrays;

public class ArrayQuestion9 {
    public static void main(String[] args) {
       
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = {10, 2, 10};
        int[] arr3 = {1, 99, 10};

        System.out.println("Result 1: " + Arrays.toString(withoutTen(arr1)));
        System.out.println("Result 2: " + Arrays.toString(withoutTen(arr2)));
        System.out.println("Result 3: " + Arrays.toString(withoutTen(arr3)));
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

       
        for (int num : nums) {
            if (num != 10) {
                result[index++] = num;
            }
        }

     
        return result;
    }
}
