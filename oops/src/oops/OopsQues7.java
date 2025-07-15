package oops;

import java.util.*;
public class OopsQues7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String: ");
		String a = sc.nextLine();
		System.out.println("Enter second String: ");
		String b = sc.nextLine();
		
		String result;
		
		if(a.length() < b.length()) {
			result = a + b + a;
		}else {
			result = b + a + b;
		}
		System.out.println(result);
		sc.close();

	}

}
