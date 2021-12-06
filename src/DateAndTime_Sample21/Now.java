package DateAndTime_Sample21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Now {

	public static void main(String[] args) {
		
		/*
		 	Ek Methotlar;
		 	booelan after(Date date) > Daha ileri bir tarih ise true, aksi halde false.
		 	boolean before(Date date) > Daha onceki bir tarih ise true, aksi halde false.
		 	boolean equals(Date date) > Esit ise true, aksi halde false.
		 	
		 	int compareTo(Date date) > Tarihleri karsilastirir ayni ise 0, once ise -1, sonra ise +1;
		 	toString > Tarihi String ifadeye cevirir.
		 */
		Date d1 = new Date();
		SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
		ft1.format(d1);
		
		Date d2 = new Date();
		SimpleDateFormat ft2 = new SimpleDateFormat ("2012.11.dd hh:mm:ss");
		ft2.format(d2);
	
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.equals(d2));
		
		//Simdiki zamani alma.
		Date date = new Date();					
		System.out.println("\n" + date.toString());
	
		//Tarih Formati
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		System.out.println("\nCurrent Date: " + ft.format(dNow));
		
	}
}
