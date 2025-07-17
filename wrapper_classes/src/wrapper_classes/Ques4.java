package wrapper_classes;

class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee clone() {
        try {
            return (Employee) super.clone();         } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Ques4{
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "Rupa");

      
        Employee emp2 = emp1.clone();

        System.out.println("Before change:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        emp2.display();

        emp1.name = "Samantha";

        System.out.println("\nAfter changing original:");
        System.out.print("Original: ");
        emp1.display();
        System.out.print("Clone   : ");
        emp2.display();
    }
}