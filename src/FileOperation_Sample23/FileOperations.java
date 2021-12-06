package FileOperation_Sample23;

import java.io.*;

public class FileOperations {
	public static void main(String[] args) 
	{
		try
		{
			char[] data = {'a', 'b', 'c', 'd', 'e'};
			OutputStream outfile = new FileOutputStream("C:/test.txt");
			for(int x=0; x<data.length; x++)
				outfile.write(data[x]);

			outfile.close();
		
			InputStream infile = new FileInputStream("C:/test.txt");
			int size = infile.available();
			
			for(int i=0; i<size; i++)
				System.out.println((char) infile.read() + " ");

			infile.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}
	}
}
