package a_BasicSimples;

public class LeghtArgumans {

	public static void main(String[] args) {
		System.out.println(average(43,34,45,56,7));
		System.out.println(average(1,2,3));
	}
	
	public static int average(int...numbers) //Burada degisken sayisi belirsiz arguman alabiliyor.
	{			
		int total=0;
		for(int x:numbers)
			total+=x;
		return total/numbers.length;
	}

}
