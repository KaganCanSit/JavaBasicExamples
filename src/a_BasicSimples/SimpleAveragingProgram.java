package a_BasicSimples;
import java.util.Scanner;

public class SimpleAveragingProgram {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0, grade=0, average=0, counter=0;
		while(counter<10)
		{
			grade=input.nextInt();
			total+=grade;
			counter++;
		}
		average=total/10;
		System.out.println("You average is: " + average);
	}
}
