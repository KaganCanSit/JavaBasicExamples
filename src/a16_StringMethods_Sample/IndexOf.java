package a16_StringMethods_Sample;

public class IndexOf {
	public static void main(String[] args) {
		//indexof() > Bir yerden sonrasini kontrol et, bir karakterden sonrasini kontrol et. > mail kontrolu gibi
		String Str = new String("Welcome to Tutorials about Java");
		String SubStr1 = new String("Tutorials");
		String SubStr2 = new String("Sutorials");
		
		System.out.println("\nFound Index: " + Str.indexOf('o')); // o karakterinin indexini don
		System.out.println("Found Index but Five Later: " + Str.indexOf('o',5));	//O harfi 5.indisten sonra varsa o indisi dön
		System.out.println("Found String Find My String: " + Str.indexOf(SubStr1));	// Aradigim string ifade icerisinde var mi?
		System.out.println("Found String Find My String Later 5 Chracters: " + Str.indexOf(SubStr1,5));	// Aradigim ifade string icerisinde 5.index'ten sonra var mi?
		System.out.println("Found Index: " + Str.indexOf(SubStr2));
	}
}
