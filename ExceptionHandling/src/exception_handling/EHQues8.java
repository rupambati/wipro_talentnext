package exception_handling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class EHQues8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("enter age:");
			int age=sc.nextInt();
			if(age>=18&&age<60) {
				System.out.println("name is: "+name);
				System.out.println("age is: "+age);
			}else {
				throw new InvalidAgeException("Error: Age must be >= 18 and < 60.");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}