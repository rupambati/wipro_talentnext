package oops;

import java.util.*;

class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class OopsQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter an integer power: ");
        int num2 = sc.nextInt();

        int result1 = Calculator.powerInt((int) num1, num2);
        System.out.println("(int) num1 raised to power num2 is: " + result1);

        double result2 = Calculator.powerDouble(num1, num2);
        System.out.println("num1 raised to power num2 is: " + result2);

        sc.close();
    }
}
