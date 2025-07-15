package oops;

import java.util.Scanner;

public class OopsQues6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        if (input.length() % 2 == 0) {
            String firstHalf = input.substring(0, input.length() / 2);
            System.out.println("Output: " + firstHalf);
        } else {
            System.out.println("Output: null");
        }

        sc.close();
    }
}
