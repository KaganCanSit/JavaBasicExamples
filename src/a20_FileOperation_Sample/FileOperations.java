package a20_FileOperation_Sample;

import java.io.*;

public class FileOperations {
	public static void main(String[] args) 
	{
		try
		{
			char[] data = {'a', 'b', 'c', 'd', 'e'};
			OutputStream outfile = new FileOutputStream("C:/Deneme/test.txt"); //outfile ile yazma
			for(int x=0; x<data.length; x++)
				outfile.write(data[x]);			//data ogesini indis sirasiyla birlikte acmis oldugumuz dosyaya yaziyoruz.

			outfile.close(); // Islem sonunda dosyayi kapatiyoruz. Islemi sonlandiriyoruz.
		
			InputStream infile = new FileInputStream("C:/Deneme/test.txt"); //infile ile okuma
			int size = infile.available();
			
			for(int i=0; i<size; i++)
				System.out.println((char) infile.read() + " "); //char olarak file icerisinden okumus oldugumuz degerleri console'a yaziyoruz.

			infile.close(); // Islem sonunda dosyayi kapatiyoruz. Islemi sonlandiriyoruz.
		}
		catch(IOException e)	//Dosya acilamaz vb. durum olusursa hata mesaji donuyor.
		{
			System.out.println("File Operations Fail");
		}
	}
}
