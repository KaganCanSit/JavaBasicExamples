package a05_Import_Sample;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Developer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Junior Software Developer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}
