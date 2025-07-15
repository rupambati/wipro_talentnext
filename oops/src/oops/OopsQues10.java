package oops;
import java.util.Scanner;

public class OopsQues10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        if (n < 0 || n > input.length()) {
            System.out.println("Invalid value of n. It must be between 0 and the length of the string.");
        } else {
            String lastN = input.substring(input.length() - n);
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < n; i++) {
                result.append(lastN);
            }

            System.out.println("Output: " + result.toString());
        }

        sc.close();
    }
}
