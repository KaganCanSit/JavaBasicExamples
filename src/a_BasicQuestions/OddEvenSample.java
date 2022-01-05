/*
 * Soru5: Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturun. Ardından tek ve çift sayıları bulan bir program yazın.
 * 
 * https://medium.com/@nujinaytek/java-algoritma-sorular%C4%B1-ve-%C3%A7%C3%B6z%C3%BCmleri-eclipse-%C3%BCzerinden-fa1d5cf3afc2
 */
package a_BasicQuestions;

import java.lang.reflect.Array;
import java.util.*;

public class OddEvenSample {
	public static void main(String args[])
	{
		int [] Array = new int[100];
		for(int i=0;i<100;i++)
		{
			Random rnd = new Random();
			Array[i] = rnd.nextInt(1000);
		}
		
		OddEvenOperation(Array);
	}
	
	public static void OddEvenOperation(int[] x)
	{
		for(int a:x)
		{
			if(a%2==0)
				System.out.println(a + " Degeri ciftdir.");
			else
				System.out.println(a + " Degeri tektir.");
		}
	}
}
