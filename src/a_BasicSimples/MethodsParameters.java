package a_BasicSimples;
import java.util.Scanner;

public class MethodsParameters 
{
	private void SimpleMessage(String name) 
	{
		System.out.println("Hello! " + name);
	}
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		MethodsParameters MPObject=new MethodsParameters();
		
		System.out.println("Enter your name here: ");
		String name=input.nextLine();
		
		MPObject.SimpleMessage(name);
	}	
}


