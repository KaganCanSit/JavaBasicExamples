package a05_Import_Sample;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	//Constructor - Kurucu
	public Employee(String name)
	{
		this.name = name;
	}
	
	public void empAge(int empAge)
	{
		age = empAge;
	}
	
	public void empDesignation(String empDesig)
	{
		designation = empDesig;
	}
	
	public void empSalary(double empSalary)
	{
		salary = empSalary;
	}
	
	public void printEmployee()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary:" + salary);
	}
}
