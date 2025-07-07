package java_fundamentals;

import java.util.Arrays;

public class ArrayQuestion6 {
    public static void main(String[] args) {
       
        int[] numbers = {23, 5, 12, 89, 34, 7};

      
        Arrays.sort(numbers);

    
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
