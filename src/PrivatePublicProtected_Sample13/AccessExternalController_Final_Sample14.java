package PrivatePublicProtected_Sample13;

//Erisim Harici Denetleyiciler
public class AccessExternalController_Final_Sample14 {
	final int value=10;
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
	
	public void changeValue()
	{
		value=12; // Bu noktada value degeri degistirilemez. Final olarak tanimlandi. Derleyici bu yuzden hata veriyor.
	}
}
