package exception_handling;

import java.util.Scanner;

interface Test {
    int myFunction(int a, int b, int c);
}

public class EHQues4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Test t1 = (a, b, c) -> a + b + c;

        Test t2 = (a, b, c) -> a * b * c;

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Sum (t1.myFunction): " + t1.myFunction(num1, num2, num3));
        System.out.println("Product (t2.myFunction): " + t2.myFunction(num1, num2, num3));

        scanner.close();
    }
}
