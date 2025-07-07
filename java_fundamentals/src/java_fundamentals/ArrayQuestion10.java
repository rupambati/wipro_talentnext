package java_fundamentals;

import java.util.Arrays;

public class ArrayQuestion10 {
    public static void main(String[] args) {
       
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2, 2};

        System.out.println("Result 1: " + Arrays.toString(evenOdd(arr1)));
        System.out.println("Result 2: " + Arrays.toString(evenOdd(arr2)));
        System.out.println("Result 3: " + Arrays.toString(evenOdd(arr3)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

     
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        
        reverse(result, evenIndex, nums.length - 1);

        return result;
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
