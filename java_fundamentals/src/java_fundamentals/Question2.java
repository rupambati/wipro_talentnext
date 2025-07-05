package java_fundamentals;

import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the company name: ");
        String company = scanner.nextLine();

   
        System.out.print("Enter the location: ");
        String location = scanner.nextLine();


        System.out.println(company + " Technologies " + location);

        scanner.close();
	}
}
