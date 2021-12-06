package StringMethods_Sample19;

public class Methods {

	public static void main(String[] args) {
		String value = "06Dec21 - 12:45PM";
		String value2 = "06Dec21 - 12:55PM";
		char result;
		System.out.println("Value1: " + value + "\tValue2: " + value2);
		
		//charAt(index) = String'in belirtilen index'indeki degeri doner.
		result = value.charAt(6);	
		System.out.println("String'in 7. index'indeki deger: " + result);
		
		
		/*
			compareTo(string value) = Degerleri karsilastirmaya yarar.
		 	Karsilastirma sonucu deger;
		 		0 ise karsilastirilan ifadeler ayni.
		 		0'dan kucuk ise sozluksel olarak ifade kucuk.
		 		0'dan buyuk ise sozluksel olarak ifade buyuk.
		*/
		int resultValue = value.compareTo(value2);
		System.out.println("\nString karsilastirma: " + resultValue);

		
		//compareToIgonoreCase(string value) : compareTo'dan farkli olarak buyuk kucuk harf ayrimi yapmaz.
		resultValue = value.compareToIgnoreCase(value2);
		System.out.println("\nString Karsilastirma: " + resultValue);
		
		
		//endsWith(String value) = String belirtilen ifade ile bitiyor mu?
		boolean Control = value.endsWith("12:45PM");
		System.out.println("\nString ifadenin sonu 12:45 ile bitiyor mu? " + Control);
		
		
		//equals(String value) = Sadece esitlik kontrolu yapar.
		Control = value.equals(value2);
		System.out.println("\nValue1 degeri ile Value2 degeri esit mi? " + Control);
		
		
		//equalsIgnoreCase(String Value) = Buyuk kucuk harf ayrimi yapmadan degerleri karsilastirir.
		Control = value.equalsIgnoreCase(value2);
		System.out.println("Buyuk/Kucuk harf fark etmeksizin Value1 degeri ile Value2 degeri esit mi? " + Control);
	
		
		//Replace(Eski Harf, Yeni Harf) = Metin icerisinde vermis oldugunuz harflerin yerine belirtmis oldugunuz harfi koyar.
		System.out.println("\nValue1 Degistir:\n" + "Value Ilk Hal: "+ value + "\nValue Son Hal: " + value.replace('4','5'));
		
		//toLowerCase() / toUpperCase = Harfleri buyuk harfe ve kucuk harfe cevir.
		System.out.println("\nValue1 Upper: " + value.toUpperCase() + "\nValue1 Lower: " + value.toLowerCase());
	
		//trim() = String ifadenin basinda ve sonunda yer alan bosluklari kalldirir.
		String value3 = "       Merhaba       ";
		System.out.println("Ifadenin Ilk Hali: " + value3 + "\tSon Hali: " + value3.trim());
	}
}
