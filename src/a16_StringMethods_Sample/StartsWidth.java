package a16_StringMethods_Sample;

public class StartsWidth {
	public static void main(String[] args) {
		String Str = new String("Welcome to Tutorials");
		
		System.out.println("Return Value: " + Str.startsWith("Welcome"));		//Str Welcome ile basliyor mu?
		System.out.println("Return Value: " + Str.startsWith("Tutorials"));		//Str Tutorial ile basliyor mu?
		System.out.println("Return Value: " + Str.startsWith("Tutorials",11));	//Str 11.indisten itibaren Tutorials ile basliyor mu?
	}
}
