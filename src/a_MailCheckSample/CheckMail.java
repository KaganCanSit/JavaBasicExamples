package a_MailCheckSample;

public class CheckMail {
	
	void yap(String veri) {
		boolean retVal;
		
		retVal=veri.endsWith("@maltepe.edu.tr");
		if(retVal==true)
			System.out.println("Bu e-mail universiteye ait.");
		else
			System.out.println("Bu mail okula ait degil.");	
	}
}
