package a_BasicEmployeeSample;

public class Employee {
	String name;			//Adi
	int age;				//Yasi
	String designation;		//Meslegi
	double salary;			//Maas
	
	//Constructor(Yapici Method)
	public Employee(String name)
	{
		this.name=name;
	}
	
	public void empAge(int empAge)
	{
		age=empAge;
	}
	public void empDestination(String empDesig)
	{
		designation=empDesig;
	}
	public void empSalary(double empSalary)
	{
		salary=empSalary;
	}
	
	public void printEmployee() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}	
}

