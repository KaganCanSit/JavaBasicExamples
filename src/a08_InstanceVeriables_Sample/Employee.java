package a08_InstanceVeriables_Sample;

public class Employee {
	//Instance Degiskenler
	public String name;
	private double salary;
	
	public Employee(String empName)
	{
		name = empName;
	}
	
	public void SetSalary(double empSal)
	{
		salary = empSal;
	}
	
	public void printEmp()
	{
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}
