package a16_StringMethods_Sample;

public class Split {
	public static void main(String[] args) {
		String Str = new String("Jim-Jack-Marry-David");
		
		
		SplitStr(Str,"-", 2);	//- Ifadesi ile karsilastiginda bir kere bol. Toplam iki parca.
		SplitStr(Str,"-", 3);	//- Ifadesi ile karsilastiginda iki kere bol. Toplam uc parca.
		SplitStr(Str,"-", 0);	// ! - Ifadesi ile karsilastiginda bol. Her -'yi boler. Asagidaki ile ayni sonucu verir.
		
		System.out.println("Return Value: ");
		for(String retval:Str.split("-"))
		{
			System.out.println(retval);
		}
	}
	
	public static void SplitStr(String splitValue, String chr, int number)
	{
		System.out.println("Return Value: ");
		for(String retval:splitValue.split(chr,number))
		{
			System.out.println(retval);
		}
		System.out.println("");
	}
}
