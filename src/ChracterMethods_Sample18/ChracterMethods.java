package ChracterMethods_Sample18;


public class ChracterMethods {

	public static void main(String[] args) {
		
		//Tuyo > is Methotlari genellikle true/false donduren evet/hayir methotlaridir.
		
		//isLetter > Harf mi? Degil mi? - True/False methodu
		System.out.println("isLetter: " + Character.isLetter('c') + "\n");
		
		//isDigit > Deger bir sayi mi?
		System.out.println("isDigit: " + Character.isDigit('1') + "\n");
	
		//isWhiteSpace > Bosluk var mi? Yok mu? Burada alt satira gecme, tab ve yeni satir da true olarak kabul edilir.
		System.out.println("isWhitespace:" + Character.isWhitespace('\n'));
		System.out.println("isWhitespace:" + Character.isWhitespace('\t') + "\n");
	
		//isUpperCase > Buyuk harf mi? Degil mi?
		System.out.println("isUpperCase: " + Character.isUpperCase('C') + "\n");
		
		//isLowerCase > Karakter kucuk harf mi? Degil mi?
		System.out.println("isLowerCase: " + Character.isLowerCase('c') + "\n");
	
		//toUpperCase > Verilen char degerini büyük harfe cevirir.
		//toLowerCase > Verilen char degerini kucuk harfe cevirir.
		//toString > Verilen char degerini string nesnesine cevirir.
		char a='b';
		System.out.println("ToUpper: "+ Character.toUpperCase(a) + "\n" +
						   "ToLower: " + Character.toLowerCase(a) + "\n" +
						   "toString: " + Character.toString(a) +'\n');
	}

}
