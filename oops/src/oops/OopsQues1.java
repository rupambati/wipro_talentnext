package oops;

import java.util.*;
class OopsQues1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		System.out.println("Enter depth: ");
		double depth = sc.nextDouble();
		double volume = width * height * depth;
		System.out.println("The volume is : " + volume);
	}
}