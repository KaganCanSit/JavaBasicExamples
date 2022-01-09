package a_BasicQuestions;
import java.util.*;

public class PentagonalNumber {
	public static void main(System args[])
	{
		int i=0;
		while(i<100)
		{
			System.out.print(pantagonal(i)+ " ");
			i++;
		}
	}
	
	public static int pantagonal(int a)
	{
		return a*(3*a-1)/2;
	}
}
