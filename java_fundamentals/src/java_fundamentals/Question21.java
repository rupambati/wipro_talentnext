package java_fundamentals;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the first character: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter the second character: ");
        char ch2 = scanner.next().charAt(0);

        

        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }

        scanner.close();
    }
}
