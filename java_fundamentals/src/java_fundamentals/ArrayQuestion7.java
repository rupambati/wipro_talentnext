package java_fundamentals;

import java.util.*;

public class ArrayQuestion7 {
    public static void main(String[] args) {
      
        int[] inputArray = {12, 34, 12, 45, 67, 89};

        
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : inputArray) {
            uniqueSet.add(num);
        }

       
        System.out.print("Output: {");
        int count = 0;
        int size = uniqueSet.size();
        for (int num : uniqueSet) {
            System.out.print(num);
            if (++count < size) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
