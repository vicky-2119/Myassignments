package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String name) {
		System.out.println(name);
		
		
	}
	public void printEmployeeId(int id) {
		System.out.println(id);
	}
	public void printEmployeeAddress(String address) {
		System.out.println(address);
	}
	public void printEmployeeSalary(Double salary) {
		System.out.println(salary);
	}
	public void printEmployeeMobileNumber(Long mobNum) {
		System.out.println(mobNum);
	}
	
   public static void main(String[] args) {
	   EmployeeDetails emp=new EmployeeDetails();
	   emp.printEmployeeName("Bharath");
	   emp.printEmployeeId(132);
	   emp.printEmployeeAddress("Madurai");
	   emp.printEmployeeSalary(20.000);
	   emp.printEmployeeMobileNumber(9087291617L);
	
}
}
