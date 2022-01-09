package a_BasicQuestions;
import java.util.*;

public class TotalAverageMinMax {

	public static void main(String[] args) {
		int[] Array = new int[100];
		int total=0;
		
		for(int i=0; i<100 ;i++)
		{
			Random rnd = new Random();
			Array[i] = rnd.nextInt(100);
			System.out.print(Array[i] + " ");
			total += Array[i];
		}
		Arrays.sort(Array);
		
		System.out.println("\nMin Value: " + Array[0]);
		System.out.println("Max Value: " + Array[99]);
		System.out.println("Total Value: " + total);
		System.out.println("Average: " + total/100);
		System.out.println("Mid Value: " + (Array[49] + Array[50])/2);

	}
}