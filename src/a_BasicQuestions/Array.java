/*
 * 	Konsoldan girilen sayı kadar alt alta yıldız koyarak üçgen çizdirme java algoritma kodunu yazınız.
 *	Örnek: input = 5
 *	output =
 *
 *	    *  
 *	   ***
 *	  *****
 *	 *******
 *	*********
 */

package a_BasicQuestions;

import java.util.*;

public class Array {
	
	public static void main(String args[])
	{
		//Satir Sayisini Al
		System.out.println("Kac Satir Yildiz Olmali: ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		int counter=0;
		for(int a=1; a<=temp*2 ; a+=2)
		{
			//Bosluk
			for(int j=temp*2-a; j>=0; j-=2)
				System.out.print(" ");
			
			//Yildiz
			for(int b=1; b<=a; b++)
				System.out.print("*");
			System.out.print("\n");
		}
			
	}
}
