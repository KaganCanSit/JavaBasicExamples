/*
 * Palindrom sayı ne demektir? Önce bu soruyla başlayalım. 
 * İki taraftan okunduğu zaman okunuş yönü ile aynı olan sayılar palindrom veya palindromik sayı olarak tanımlanırlar. 
 * Yani simetrik sayılardır. Soldan sağa yazılışı, sağdan sola yazılışına eşit sayılardır. Örneğin 123321 sayısını ele alalım. 
 * Tersten yazdığımızda da 123321 sayısını elde ederiz değil mi? Ya da 101 sayısı da aynı şekilde palindromdur.
 * 
 * Kaynak: https://elifyonel.wordpress.com/2019/05/11/java-egitimi-36-algoritma-ornekleri/
 */

package a_BasicQuestions;

import java.util.Scanner;

public class PolindromNumber {
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder(getValue());
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("Bu bir polindrom sayidir.");
		else
			System.out.println("Bu bir polindrom sayi degildir.");
			
	}
	
	public static String getValue()
	{
		System.out.println("Number Value: ");
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
