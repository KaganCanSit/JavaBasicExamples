/*
 * Konsoldan kullanıcının girdiği integer değer kadar alt alta yıldız üçgen yapan java algoritma kodunu yazınız ?
 * Kaynak: https://www.mobilhanem.com/temel-java-dersleri-java-algoritma-ornekleri-1-alistirmalar/
 */

package a_BasicQuestions;
import java.util.*;

public class StarDraw {
	public static void main(String args[])
	{
		drawStar(getStar());
	}
		
	public static int getStar()
	{
		System.out.println("Input Star Value: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void drawStar(int StarValue)
	{
		for(int i=1; i<=StarValue;i++)
		{
			for(int a=1;a<=i;a++)
				System.out.print("*");
			System.out.println("\n");
		}
	}
}
