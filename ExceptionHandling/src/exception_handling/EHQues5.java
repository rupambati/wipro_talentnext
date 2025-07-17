package exception_handling;

import java.util.Scanner;

public class EHQues5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;

        try {
            System.out.println("Enter the number of elements in the array : ");
            int size = Integer.parseInt(sc.nextLine());
            arr = new int[size];

            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Enter the index of the array");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
    }
}
