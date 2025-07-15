package oops;

import java.util.*;

public class OopsQues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter " + n1 + " cities for s1:");
        for (int i = 0; i < n1; i++) {
            String city = sc.nextLine();
            s1.add(city);
        }

        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter " + n2 + " cities for s2:");
        for (int i = 0; i < n2; i++) {
            String city = sc.nextLine();
            s2.add(city);
        }

        StringJoiner merged1 = new StringJoiner("-");
        merged1.add(s2.toString()).add(s1.toString());
        System.out.println("\ni) s1 merged to s2:");
        System.out.println(merged1);

        StringJoiner merged2 = new StringJoiner("-");
        merged2.add(s1.toString()).add(s2.toString());
        System.out.println("\nii) s2 merged to s1:");
        System.out.println(merged2);

        sc.close();
    }
}
