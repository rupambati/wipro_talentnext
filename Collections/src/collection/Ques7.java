package collection;

import java.util.*;

class Staff {
    int id;
    String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class Ques7 {
    public static void main(String[] args) {
      
        Vector<Staff> staffList = new Vector<>();

        staffList.add(new Staff(201, "Ravi"));
        staffList.add(new Staff(202, "Divya"));
        staffList.add(new Staff(203, "Karan"));

        System.out.println("Using Iterator:");
        Iterator<Staff> it = staffList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Staff> en = staffList.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
