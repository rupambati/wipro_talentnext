package exception_handling;

import java.util.*;

class NullNameException extends Exception {
    public String toString() {
        return "name is null";
    }
}

class NullMarksArrayException extends Exception {
    public String toString() {
        return "mark array is null";
    }
}

class NullStudentObjectException extends Exception {
    public String toString() {
        return "object is null";
    }
}

class Student {
    String name;
    int[] marks;
    String grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Mini_Project {

    public static String findGrade(Student s) {
        int[] m = s.marks;
        for (int mark : m) {
            if (mark < 35) return "F";
        }

        int sum = 0;
        for (int mark : m) sum += mark;

        if (sum < 150) return "C";
        else if (sum < 200) return "B";
        else if (sum < 250) return "A";
        else return "A+";
    }

    public static String validate(Student s)
            throws NullStudentObjectException, NullNameException, NullMarksArrayException {
        if (s == null) throw new NullStudentObjectException();
        if (s.name == null) throw new NullNameException();
        if (s.marks == null) throw new NullMarksArrayException();
        return "VALID";
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Sekar", new int[]{85, 75, 95});
        students[1] = new Student(null, new int[]{11, 22, 33});  
        students[2] = null;                                   
        students[3] = new Student("Manoj", null);                 

        int nullMarksCount = 0, nullNameCount = 0, nullObjectCount = 0;

        for (Student s : students) {
            try {
                if (validate(s).equals("VALID")) {
                    String grade = findGrade(s);
                    System.out.println("Student: " + s.name + " | Grade: " + grade);
                }
            } catch (NullNameException e) {
                System.out.println(e);
                nullNameCount++;
            } catch (NullMarksArrayException e) {
                System.out.println(e);
                nullMarksCount++;
            } catch (NullStudentObjectException e) {
                System.out.println(e);
                nullObjectCount++;
            }
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Null names: " + nullNameCount);
        System.out.println("Null marks arrays: " + nullMarksCount);
        System.out.println("Null student objects: " + nullObjectCount);
    }
}
