package exception_handling;

import java.util.Scanner;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "Notice: This is a First Class Compartment.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Notice: This is a Ladies Compartment.";
    }
}

class General extends Compartment {
    public String notice() {
        return "Notice: This is a General Compartment.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Notice: This is a Luggage Compartment.";
    }
}

public class EHQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compartment[] compartments = new Compartment[10];

        System.out.println("Enter 10 compartment types (1: FirstClass, 2: Ladies, 3: General, 4: Luggage):");

        for (int i = 0; i < compartments.length; i++) {
            System.out.print("Compartment " + (i + 1) + ": ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to General.");
                    compartments[i] = new General();
            }
        }

        System.out.println("\nNotices from all compartments:");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }

        sc.close();
    }
}
