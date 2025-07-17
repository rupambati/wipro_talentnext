package exception_handling;

import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class EHQues6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter the name of Student " + i + ":");
            String name = sc.nextLine();
            int total = 0;

            try {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Enter mark " + j + ":");
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks cannot be more than 100.");
                    }

                    total += mark;
                }

                double average = total / 3.0;
                System.out.println("Average marks of " + name + " = " + average);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Please enter only numbers.");
            } catch (NegativeValueException e) {
                System.out.println("NegativeValueException: " + e.getMessage());
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
            }

            System.out.println(); 
        }

        sc.close();
    }
}
