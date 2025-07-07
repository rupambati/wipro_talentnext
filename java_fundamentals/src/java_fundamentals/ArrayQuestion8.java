package java_fundamentals;

public class ArrayQuestion8 {
    public static void main(String[] args) {
       
        int[] arr = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true;
            } else if (skip && num == 7) {
                skip = false;
            } else if (!skip) {
                sum += num;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
