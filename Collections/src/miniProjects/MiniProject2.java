package miniProjects;

import java.util.*;
public class MiniProject2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true) {
			System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1:
				System.out.println("Enter the item to be inserted:");
				al.add(sc.nextLine());
				System.out.println("inserted successfully");
				break;
			case 2:
				System.out.println("Enter the item to search:");
				String item=sc.nextLine();
				if(al.contains(item))
					System.out.println("item found in the list");
				else
					System.out.println("item not found in the list");
				break;
			case 3:
				System.out.println("Enter the item to delete:");
				String s=sc.nextLine();
				if(al.contains(s)) {
					al.remove(al.indexOf(s));
					System.out.println("Deleted successfully");
				}
				else
					System.out.println("item does not exist");
				break;
			case 4:
				System.out.println("the items in the list are:");
				for(String i:al) {
					System.out.println(i);
				}
				break;
			case 5:
				return;
			default:
				System.out.println("enter a vaild choice");
			}
			
			
		}

	}

}