package oops;

import java.util.*;
public class OopsQues4 {
	

    // Person class
    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    
    static class Employee extends Person {
        private double annualSalary;
        private int yearOfJoining;
        private String nationalInsuranceNumber;

        public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNumber) {
            super(name); // Call Person's constructor
            this.annualSalary = annualSalary;
            this.yearOfJoining = yearOfJoining;
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        public int getYearOfJoining() {
            return yearOfJoining;
        }

        public void setYearOfJoining(int yearOfJoining) {
            this.yearOfJoining = yearOfJoining;
        }

        public String getNationalInsuranceNumber() {
            return nationalInsuranceNumber;
        }

        public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public void displayDetails() {
            System.out.println("Name: " + getName());
            System.out.println("Annual Salary: ₹" + annualSalary);
            System.out.println("Year of Joining: " + yearOfJoining);
            System.out.println("National Insurance Number: " + nationalInsuranceNumber);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Year of Joining: ");
        int year = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter National Insurance Number: ");
        String insuranceNumber = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insuranceNumber);

        emp.displayDetails();

        sc.close();
    }
}
