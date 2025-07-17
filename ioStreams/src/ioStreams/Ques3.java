package ioStreams;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        try {
          
            Employee emp = new Employee("Ravi Kumar", new Date(95, 4, 10), "IT", "Software Engineer", 85000.0);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Employee object has been serialized to 'data'.");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
            Employee deserializedEmp = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Employee object:");
            System.out.println("Name: " + deserializedEmp.getName());
            System.out.println("DOB: " + deserializedEmp.getDateOfBirth());
            System.out.println("Department: " + deserializedEmp.getDepartment());
            System.out.println("Designation: " + deserializedEmp.getDesignation());
            System.out.println("Salary: " + deserializedEmp.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
