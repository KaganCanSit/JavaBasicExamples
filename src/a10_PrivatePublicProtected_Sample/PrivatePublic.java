package a10_PrivatePublicProtected_Sample;

public class PrivatePublic {

	//Private formate degiskenine herhangi bir disaridan dogrudan erisim soz konusu olamaz. Bunun icin degerini degistirmek icin methodlar tanimliyoruz.
	private String format;
	public String getFormat()
	{
		return this.format;
	}
	public void setFormat(String format)
	{
		this.format=format;
	}
	
	
	//Public - Her yerden erisilebilir method
	public static void main(String[] args) {
		
		
	}

}
