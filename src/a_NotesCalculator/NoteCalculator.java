package a_NotesCalculator;

import java.util.Scanner;

public class NoteCalculator {

	/*
	 * Note: 90/100 	AA		85/89 	BA		75/79	BB
	 * 		 65/74		CC		60/64	DC		55/59	DD
	 * 		 50/54		FD		00/49	FF
	 */
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input the Note1 Value(%40): ");
		int Note1 = scn.nextInt();
		System.out.println("Input the Note2 Value(%60): ");
		int Note2 = scn.nextInt();
	
		Notes(AverageCalculate(Note1,Note2));
	}
	
	private static double AverageCalculate(int Note1, int Note2)
	{	
		if(Note1<0 || Note2 <0 || Note1>100 || Note2>100)			
			return -1;
		else
			return (Note1*0.40) + (Note2*0.60);
	}
	
	private static void Notes(double Average)
	{
		if(Average == -1)
		{
			System.out.println("Grade value must be between 0 and 100. Please try again.");
			System.exit(0);
		}
					
		if (Average<50)
			System.out.println("FF");
		else if(Average<55)
			System.out.println("FD");
		else if(Average <60)
			System.out.println("DD");
		else if(Average <65)
			System.out.println("DC");
		else if(Average <75)
			System.out.println("CC");
		else if(Average <80)
			System.out.println("BB");
		else if(Average <90)
			System.out.println("BA");
		else
			System.out.println("AA");
	}
}
