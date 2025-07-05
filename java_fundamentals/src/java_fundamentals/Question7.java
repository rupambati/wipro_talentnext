package java_fundamentals;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int count = scanner.nextInt();
        scanner.nextLine();  

        if (count == 0) {
            System.out.println("No values");
        } else {
            String[] values = new String[count];

           
            for (int i = 0; i < count; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                values[i] = scanner.nextLine();
            }

          
            for (int i = 0; i < count; i++) {
                System.out.print(values[i]);
                if (i < count - 1) {
                    System.out.print(", ");
                }
            }
        }

        scanner.close();
    }
}
