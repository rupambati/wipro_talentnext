package oops;

import java.util.Optional;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OopsQues12 {
    public static void main(String[] args) {
        try {
      
            Employee emp = null;

            Optional<Employee> optionalEmp = Optional.ofNullable(emp);

            if (optionalEmp.isEmpty()) {
                throw new InvalidEmployeeException("Employee is null!");
            }

            System.out.println("Employee is valid: " + optionalEmp.get().name);

        } catch (InvalidEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
