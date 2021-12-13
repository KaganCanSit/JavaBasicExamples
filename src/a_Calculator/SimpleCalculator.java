package a_Calculator;

import java.util.Scanner;
import java.math.*;

public class SimpleCalculator {

	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = mainMenu();
		getValue();
		
		if(choice == 1)
			returnValue(Value1+Value2);
		else if(choice == 2)
			returnValue(Value1-Value2);
		else if(choice == 3)
			returnValue(Value1/Value2);
		else if(choice == 4)
			returnValue(Value1*Value2);
		else
		{
			System.out.println("Please Check Choise Operation. 1, 2, 3, 4");
			System.exit(0);
		}
	}
	
	
	private static int mainMenu()
	{
		System.out.println("WELCOME THE BASIC CALCULATOR");
		System.out.println("\nSelect your operation\nAdd(1)\nSubtraction(2)\nDivision(3)\nMultiplication(4)");
		System.out.println("\nEnter the value in parentheses to select the action.");
		
		return scn.nextInt();
	}
	
	private static double  Value1, Value2;
	private static void getValue()
	{
		System.out.print("1.Value: ");
		Value1 = scn.nextDouble();
		System.out.print("2. Value: ");
		Value2 = scn.nextDouble();			
	}
	
	private static void returnValue(double resultValue)
	{
		System.out.println("Result:" + resultValue);
	}
}
