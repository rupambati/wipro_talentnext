package wrapper_classes;

import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Given number: "+n);
		System.out.println("Binary equivalnet: "+Integer.toBinaryString(n));
		System.out.println("Octal equivalent: "+Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent: "+Integer.toHexString(n));
	}

}