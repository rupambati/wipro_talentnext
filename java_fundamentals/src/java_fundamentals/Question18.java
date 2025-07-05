package java_fundamentals;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        int n = scanner.nextInt();

        System.out.println("\nUsing for loop:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        scanner.close();
    }
}