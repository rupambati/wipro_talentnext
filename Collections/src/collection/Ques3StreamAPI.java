package collection;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int rollNo;
    private String name;
    private int mark;

    // Parameterized constructor
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + mark;
    }
}

public class Ques3StreamAPI {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Bob", 76));
        students.add(new Student(102, "bhAAi", 45));
        students.add(new Student(103, "pk", 88));
        students.add(new Student(104, "balayya", 32));
        students.add(new Student(105, "kajal", 55));

        List<Student> passedStudents = students.stream()
                                               .filter(s -> s.getMark() >= 50)
                                               .collect(Collectors.toList());

        System.out.println("Students who passed the test:");
        for (Student s : passedStudents) {
            System.out.println(s);
        }

        System.out.println("Number of students who cleared the test: " + passedStudents.size());
	}

}