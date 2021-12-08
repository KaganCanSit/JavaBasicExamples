package a14_NumberMethods_Sample;

import java.math.*;

public class MathMethods {

	public static void main(String[] args) {
		
		//Math.abs() > Degerin mutlagini al.
		Integer a = -8;
		double d= -100;
		float f = -90;
				
		System.out.print("Abs: " + Math.abs(a) + "\n");
		System.out.print("Abs: " + Math.abs(d) + "\n");
		System.out.print("Abs: " + Math.abs(f) + "\n\n");
		
		//Math.ceil() > Verilen degeri büyük degere yuvarlar.
		double ceil1 = -100.675;
		System.out.println("Ceil:" + Math.ceil(ceil1) + "\n");
		
		//Math.floor > Verilen degeri küçük degere yuvarlar.
		double floor1 = -100.675;
		System.out.println("Floor: " + Math.floor(floor1) + "\n"); // -101.0
	
		//Math.round() > Verilen fonksiyonu bulundugu konuma gore yukari veya asagi yuvarlar.
		double round1 = 100.675;
		double round2 = 100.400;
		System.out.println("Round: " + Math.round(round1));
		System.out.println("Round: " + Math.round(round2) + "\n");
		
		//Math.min() > Verilen iki degerin kucuk olanini döner.
		System.out.println("Min:" + Math.min(12.123, 12.456));
		//Math.max() >   "	    "     "	   buyuk olanini doner.
		System.out.println("Max:" + Math.max(23.12, 23.0) + "\n"); 
		
		
		//Math.exp = Log e degeri
		double x=2;
		System.out.println("e: " + Math.E);
		System.out.println("e^2: " + Math.exp(2) + "\n");
		
		//Math.pow = Sayinin ustunu alma.
		double y=2,t=3;
		System.out.println("Ust Alma:" + Math.pow(2,3) + "\n");
		
		//Math.sqrt = Sayinin karekokunu alma.
		double l=2;
		System.out.println("Karekok:" + Math.sqrt(l));
		
		// Math. sin - cos - tan
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		System.out.println("Sin: " + Math.sin(radians) + "\n" + "Cos: " + Math.cos(radians) + "\n" + "Tan: " + Math.tan(radians) + "\n");
	
		//Math.random() > 0 - 1 arasinda deger uretir.
		System.out.println(Math.random());
		System.out.println(Math.random());
	}

}
