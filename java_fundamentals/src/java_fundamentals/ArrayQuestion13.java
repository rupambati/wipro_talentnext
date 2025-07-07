package java_fundamentals;

import java.util.Scanner;

public class ArrayQuestion13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][2];

        System.out.println("Enter 4 integer numbers:");

        int count = 0;
        while (count < 4) {
            if (scanner.hasNextInt()) {
                arr[count / 2][count % 2] = scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid input. Please enter only integers.");
                scanner.next(); 
            }
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The reverse of the array is:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
