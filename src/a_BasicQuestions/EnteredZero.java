/*
 *  0 Sayısı Girilene Kadar Sayıların Toplamını Veren Program
 * 
 *  Kaynak: https://elifyonel.wordpress.com/2019/05/11/java-egitimi-36-algoritma-ornekleri/
 */

package a_BasicQuestions;
import java.util.*;
public class EnteredZero {

	public static void main(String args[])
	{
		int total=0;
		while(true)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Input Number Value: ");
			int temp = s.nextInt();
			if(temp == 0)
				System.out.println("Total Value is: " + Integer.toString(total));
			else
				total += temp;
		}
	}
	
}
