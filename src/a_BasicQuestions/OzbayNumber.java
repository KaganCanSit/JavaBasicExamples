/*
 * Palidromik olmayan asal sayının terside bir asal sayıya eşit ise bu sayıya ÖZBAY Sayılar denir. İlk 100 ÖZBAY sayıyı ekrana yazdıran fonksiyonun java kodunu yazınız.
 * Örneğin: 13 palidromik sayı değildir ancak asaldır ve 13 ‘un tersi 31’de asaldır. Bu yüzden 13 ÖZBAY sayısıdır.
 */

package a_BasicQuestions;
import java.util.*;

public class OzbayNumber {
	public static void main(String args[])
	{
		int ozbayCounter = 0, a = 2;
		boolean asalControl = true;
		while(ozbayCounter<100)
		{
			int sonuc = AsalSayiKontrol(a);
			
			if(sonuc != 0)	//Sayi asalsa
			{
				asalControl = false;
				StringBuilder sb = new StringBuilder(Integer.toString(a));
				String last = sb.reverse().toString();
				int valueLast = Integer.parseInt(last);
				
				sonuc = AsalSayiKontrol(valueLast);
				
				if(sonuc != 0)
				{
					System.out.print(a + " ");
					ozbayCounter++;
				}
			}
			a++;
		}
	}
	
	
	public static int AsalSayiKontrol(int value)
	{
		boolean asalSayiKontrol=true;
		for(int i=2;i<value;i++)
			if(value%i==0)
				asalSayiKontrol=false;
		
		return asalSayiKontrol==true ? value : 0;	
	}
}
