package miniProjects;

import java.util.*;

class Employee{
	private String fName;
	private String lName;
	private String mobileNo;
	private String email;
	private String address;
	
	public Employee(String fName, String lName, String mobileNo, String email, String address) {
		this.fName = fName;
		this.lName = lName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	
	
}
public class MiniProject1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of employees: ");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<Employee> al=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter employee "+i+" details:");
			
			System.out.println("Enter the Firstname");
			String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();
            
            al.add(new Employee(firstName,lastName,mobile,email,address));
            
		}
		Collections.sort(al,Comparator.comparing(Employee::getfName));
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname", "Lastname", "Mobile", "Email", "Address");
		for (Employee emp : al) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                              emp.getfName(), emp.getlName(), emp.getMobileNo(), emp.getEmail(), emp.getAddress());
        }

		
	}

}