package a14_NumberMethods_Sample;

public class Methods {
	public static void main(String[] args) {
		//ToString Methodu int degerleri stringe cevirir.
		int x=5, y=3;
		System.out.println(Integer.toString(x)+Integer.toString(y));
		System.out.print("\n");
		
		//ParseDouble-ParseInt >> Double ve Int degerleri String'e cevirir.
		int a = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("A",16);	//16 Radix degeri 16 bitlik olarak a degSerini yaz.
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		
		//String Degerler Artik Numeric Deger Bu Yuzden Matematiksel Deger Olarak Kullanilabilir.
		System.out.print("\n");
		System.out.println(a+c+b);
	}
}
