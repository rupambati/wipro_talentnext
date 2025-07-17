package wrapper_classes;
import java.util.*;
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>1&&n<255) {
			String s=Integer.toBinaryString(n);
			String ans=String.format("%8s", s).replace(' ','0');
			System.out.println(ans);
		}else {
			System.out.println("enter the number in between 1 and 255");
		}
	}

}