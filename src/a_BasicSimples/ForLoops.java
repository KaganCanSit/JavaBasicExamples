package a_BasicSimples;
import java.util.Scanner;

public class ForLoops {

	//For Dongusu Ile Kullanicidan 10 Sayi Aliyoruz.
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int total=0, grade=0;
		for(int counter=1; counter<=10; counter++)
		{
			grade=input.nextInt();
			total+=grade;
		}
		System.out.println("Total="+total);
	}

}
