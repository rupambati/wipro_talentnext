package java_fundamentals;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the month number (1-12): ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month");
            } else {
                String[] months = {
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
                };

                System.out.println(months[month - 1]);
            }
        } else {
            System.out.println("Please enter the month in numbers");
        }

        scanner.close();
    }
}
