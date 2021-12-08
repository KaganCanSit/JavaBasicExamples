package a13_ToDecide_Sample;

public class If {
	public static void main(String[] args) {
		//If Yapisi
		int x=10;	
		if(x<20)
			System.out.println("This is if statement");
		
		//If-Else
		int a=30;
		if(a==10)
			System.out.println("Value of a is 10");
		else if(a==20)
			System.out.println("Value of a is 20");
		else if(a==30)
			System.out.println("Value of a is 30");
		else
			System.out.println("This is else statement");
	
		//Ic Ice If-Else
		int c = 30;
		int d = 10;
		if(c == 30)
			if(d == 10)
				System.out.println("X = 30 and Y = 10");
		
		//Switch Yapisi
		char grade = 'B';
		switch(grade)
		{
			case 'A':
				System.out.println("Excellent!");
				break;
			case 'B':
			case 'C':
				System.out.println("Well Done");
				break;
			case 'D':
				System.out.println("You Passed");
				break;
			case 'F':
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid Grade");
		}
		System.out.println("Your grade is: " + grade);
	}
}
