package ioStreams;

import java.io.*;
import java.util.*;

public class Mini_Project {
    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                addEmployee(sc);
            } else if (choice == 2) {
                displayEmployees();
            } else if (choice == 3) {
                System.out.println("Exiting the System");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }

    public static void addEmployee(Scanner sc) throws IOException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(id + " " + name + " " + age + " " + salary + "\n");
        fw.close();

        System.out.println("Employee added successfully.");
    }

    public static void displayEmployees() throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No employee data found.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        System.out.println("----Report-----");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        System.out.println("----End of Report-----");
    }
}
