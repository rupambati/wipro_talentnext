package java_fundamentals;

public class ArrayQuestion2 {
    public static void main(String[] args) {
     
        int[] numbers = {25, 10, 85, 42, 7, 66};

        
        int max = numbers[0];
        int min = numbers[0];

       
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

      
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
