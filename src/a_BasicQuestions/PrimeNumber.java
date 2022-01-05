/*
 * İlk 50 asal sayıyı 10’ar 10’ar alt alta gösterecek java algoritma kodunu yazınız.
 * Kaynak: https://www.mobilhanem.com/temel-java-dersleri-java-algoritma-ornekleri-1-alistirmalar/
 */
package a_BasicQuestions;
import java.util.*;
public class PrimeNumber 
{		
	public static void main(String args[])
	{
		int count = 0; 
        int num =2;//asal sayılar 2 den başlar
        while(count<50){ //ilk 50 
 
            boolean isPrime = true;
            for(int i = 2;i<num;i++){ //herhangi bir sayıya bölünebiliyor mu
               if (num % i == 0){ //Bölünebiliyorsa asal değildir
                  isPrime =false; 
               }
            }
 
            if(isPrime){
                count++;
                if(count%10==0){ //10 tane yazdırıldıysa alt satıra geç
                    System.out.println(num);
                }else{
                    System.out.print(num+" ");
                }
            }
            num++;
        }
	}
}