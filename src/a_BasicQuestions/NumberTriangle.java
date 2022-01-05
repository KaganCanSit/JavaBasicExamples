/*
 * Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan verilen sayıya kadar yazdıran ve 
 * alt alt 1’er azaltıp aynı işlemi üçgen gibi devam ettiren java algoritma kodunu yazınız.
 * 	Örnek:
 * 		input = 3
 * 		output =
 * 			3 2 1 2 3
 * 			2 1 2
 * 			1
 */

package a_BasicQuestions;

import java.util.*;

public class NumberTriangle {
	public static void main(String args[])
	{
		Triangle(getValue());
	}
	
	public static int getValue()
	{
		System.out.println("Value: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void Triangle(int value)
	{
		while(value!=0)
		{
			for(int a=value;a>=1;a--)
				System.out.print(a +" ");
			for(int b=2;b<=value;b++)
				System.out.print(b + " ");
			System.out.print("\n");
			value--;
		}
	}
}
