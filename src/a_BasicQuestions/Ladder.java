/*
 * Soru4: Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
 * 	*
 * 	**
 * 	***
 * 	**** ... (10/10)
 * 	Kaynak: https://medium.com/@nujinaytek/java-algoritma-sorular%C4%B1-ve-%C3%A7%C3%B6z%C3%BCmleri-eclipse-%C3%BCzerinden-fa1d5cf3afc2
 */


package a_BasicQuestions;
import java.util.*;

public class Ladder {
	public static void main(String args[])
	{
		int[] Array = {1,2,3,4,5,6,7,8,9,10};
		
		for(int x:Array)
		{
			for(int i=0; i<x;i++)
				System.out.print("* ");
			System.out.print("\n");
		}
		
	}
}