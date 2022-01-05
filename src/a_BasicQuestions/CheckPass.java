/*
 * Soru1: String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password = “12345�?; gibi. 
 * Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin. Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. 
 * Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!�?, değilse “Giriş Başarısız�? yazdırın.
 * 
 * Kaynak: https://medium.com/@nujinaytek/java-algoritma-sorular%C4%B1-ve-%C3%A7%C3%B6z%C3%BCmleri-eclipse-%C3%BCzerinden-fa1d5cf3afc2
 */


package a_BasicQuestions;

import java.util.*;

public class CheckPass {
	
	public static final String Pass = "12345";
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Sifrenizi Giriniz: ");
		String inputValue = input.nextLine();
		
		if(inputValue.equals(Pass))
			System.out.println("Login Success");
		else
			System.out.println("Login Fail");
		
	}
}
