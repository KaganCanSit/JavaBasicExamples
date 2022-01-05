/*
 * Bu algoritmada önce dönüştürme formülünü hatırlamamız gerekir. 
 * Formül; 
 *  	F = C * 9/5 + 32  --- C = (F-32) / 180 
 *  
 *  Kaynak: https://elifyonel.wordpress.com/2019/05/11/java-egitimi-36-algoritma-ornekleri/
 */
package a_BasicQuestions;

import java.util.Scanner;

public class CelciusFahrenheit {
	
	public static void main(String args[])
	{
		System.out.println("Fahrenheit Value is: " + (getValue()*9/5+32));
	}
	
	public static float getValue()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Input The Celcius Value: ");
		return s.nextFloat();
	}
}
