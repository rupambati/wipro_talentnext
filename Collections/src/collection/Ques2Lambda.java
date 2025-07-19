
package collection;

import java.util.*;
public class Ques2Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("date");
        al.add("elephant");
        al.add("fig");
        al.add("grape");
        al.add("honey");
        al.add("ice");
        al.add("jackfruit");
        
        al.forEach(word -> System.out.print(word+" "));
        System.out.println();
        al.forEach(word ->{
        	StringBuilder str=new StringBuilder(word);
        	String rev=str.reverse().toString();
        	System.out.print(rev+" ");
        });
	}

}
