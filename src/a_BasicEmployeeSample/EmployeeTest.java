package a_BasicEmployeeSample;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		empOne.empAge(26);
		empOne.empDestination("Senior Software Developer");
		empOne.empSalary(6000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDestination("Senior Software Developer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}
