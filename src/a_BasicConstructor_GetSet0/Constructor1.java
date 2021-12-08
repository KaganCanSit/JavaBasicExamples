package a_BasicConstructor_GetSet0;

public class Constructor1 {
	private String girlName;
	
	//Basit get,set - Kapsulleme
	public Constructor1(String name) 
	{
		girlName=name;
	}
	
	public String getName() 
	{
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s\n",getName());
	}
}
