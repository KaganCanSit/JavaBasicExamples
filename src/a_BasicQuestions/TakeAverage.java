/*
 *  Soru3: Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak programı geliştirin. 
 *  Programı yazarken aşağıdaki özelliklere uygun yazınız. Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin.
 *  Sabit elemanlı bir dizi vermeyin!
 *  Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
 *  Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.
 *  
 *  Kaynak: https://medium.com/@nujinaytek/java-algoritma-sorular%C4%B1-ve-%C3%A7%C3%B6z%C3%BCmleri-eclipse-%C3%BCzerinden-fa1d5cf3afc2
 */

package a_BasicQuestions;

import java.util.*;

public class TakeAverage {
	
	public static void main(String args[])
	{		
		int []Array = new int[100];
		for(int i=0;i<Array.length;i++)
		{
			Random rnd = new Random();
			Array[i]= rnd.nextInt(1000);
		}
		System.out.println("Ortalama:" + Operation(Array));
	}
	
	public static float Operation(int[] Array)
	{		
		float result = 0;
		for(int i=0;i<Array.length;i++)
			result += Array[i];
		
		return result / Array.length;
	}	
}
