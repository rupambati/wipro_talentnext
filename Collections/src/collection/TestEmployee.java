package collection;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1, "Mahesh babu", "babu@gamil.com", "Male", 50000);
		Employee emp2=new Employee(2, "Balayya babu", "balayya@gamil.com", "Male", 70000);
		EmployeeDB t=new EmployeeDB();
		t.addEmployee(emp1);
		t.addEmployee(emp2);
		System.out.println(t.showPaySlip(emp1.getEmpId()));
		System.out.println(t.showPaySlip(emp2.getEmpId()));
		if(t.deleteEmpployee(3)) {
			System.out.println("Employee deleted successfully.");
		}else {
			System.out.println("Employee  not found.");
		}
	}

}