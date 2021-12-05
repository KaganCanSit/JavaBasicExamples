package AccesingInstanceVeriable_Sample07;

public class Puppy {
	int pupyAge; //Olusum/Instance Degisken - Sinif icerisinde tanimli fakat sabit degil.
	
	public Puppy(String name) // Kurucu Method - Costructor Method
	{
		System.out.println("Passed Name:" + name);
	}
	
	public void setAge(int age)
	{
		pupyAge = age;
	}
	
	public int getAge()
	{
		System.out.println("Pupy's age is: " + pupyAge);
		return pupyAge;
	}

}
