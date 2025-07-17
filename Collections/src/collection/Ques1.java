package collection;

import java.util.*;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<>();
		al.add("January");
        al.add("February");
        al.add("March");
        al.add("April");
        al.add("May");
        al.add("June");
        al.add("July");
        al.add("August");
        al.add("September");
        al.add("October");
        al.add("November");
        al.add("December");

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}