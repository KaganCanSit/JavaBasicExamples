package a20_FileOperation_Sample;

import java.io.*;
import java.util.*;

public class FileSample2 {

	private Formatter x;
	
	void dosyaAc()
	{
		try
		{
			x = new Formatter("dosya.txt");
			System.out.println("Dosya olusturuldu!");
		}
		catch(Exception e)
		{
			System.out.println("Dosya olusturulmadi.");
		}
	}

	void dosyaKaydet()
	{
		x.format("%s %s %s", "1","Ad","Soyad");
	}
	
	void dosyaKapat()
	{
		x.close();
	}
	
	
	public static void main(String[] args) {
		
	}
}
