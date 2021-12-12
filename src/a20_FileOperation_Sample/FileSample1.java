package a20_FileOperation_Sample;

import java.io.File;

public class FileSample1 {
	public static void main(String[] args) {
		File x = new File("C:\\deneme\\ornek.txt");
		if(x.exists())
			System.out.println(x.getName() + "dosya bulundu!");
		else
			System.out.println("Dosya bulunamadi!");
	}
}
