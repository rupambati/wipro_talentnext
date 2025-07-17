package collection;

import java.util.*;

public class EmployeeDB {

	private List<Employee> al=new ArrayList<>();
	public boolean addEmployee(Employee e) {
		al.add(e);
		return true;
	}
	public boolean deleteEmpployee(int empId) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getEmpId()==empId) {
				al.remove(i);
				return true;
			}
		}
		return false;
	}
	public String showPaySlip(int empId) {
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getEmpId()==empId) {
				return "The pay slip of the empolyee with the given empId is: "+al.get(i).getSalary();
			}
		}
		return "Employee not found with ID " + empId;
	}	
}