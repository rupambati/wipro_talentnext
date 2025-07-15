package oops;

import java.util.*;
public class OopsQues8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String input = sc.nextLine();
		
		if(input.length() > 0 && input.charAt(0) == 'x') {
			input = input.substring(1);
		}
		if(input.length() > 0 && input.charAt(input.length() - 1) == 'x') {
			input = input.substring(0, input.length() - 1);
		}
		System.out.println(input);
		sc.close();
	}

}
