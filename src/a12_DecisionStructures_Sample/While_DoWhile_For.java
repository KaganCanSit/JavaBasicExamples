package a12_DecisionStructures_Sample;

public class While_DoWhile_For {
	public static void main(String[] args) {
		
		//While Dongusu
		System.out.println("\nWhile Dongusu");
		int x=10;
		//x<20 sarti saglandigi suruce dongu gerceklesicektir. x++ sarti konmaz ise sonsuz dongu olusabilir.
		while(x<20)
		{
			System.out.println("Value Of x: " + x);
			x++;
		}
		
		//Do-While Dongusu
		int a=0;
		System.out.println("\nDo-While Dongusu");
		do {
			System.out.println("Value Of x: " + a);
			a++;
		}while(a<20);
		
		//For Dongusu
		System.out.println("\nFor Dongusu");
		for(int i=10; i<20; i++)
			System.out.println("Value of x: " + i);
		
		//Onemli!
		//Java 5 ile gelen - Gelistirilmis For Dongusu(Enhanced For Loop)
		int[] numbers = {10,20,30,40,50};
		for(int d: numbers)
		{
			System.out.print(d);
			System.out.print(",");
		}
		System.out.println("\n");
		String[] names = {"James", "Larry", "Tom", "Lacy"};
		for(String name: names)
		{
			System.out.print(name);
			System.out.print(",");
		}
		
		//Break
		System.out.println("\n");
		int[] newArray = {10,20,30,40,50};
		for(int h:newArray)
		{
			if(h==30)
				break;	
			System.out.println(h);
		}
		
		//Continue
		System.out.println("\n");
		int[] newNumbers = {10,20,30,40,50};
		for(int m: newNumbers)
		{
			if(m==30)
				continue;			
			System.out.println(m);
		}
	}
}
