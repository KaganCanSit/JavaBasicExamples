package a20_FileOperation_Sample;
import java.io.*;

public class FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("Hello1.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		
		//Writes the content to the file
		writer.write("This\n is\n an\n example\n");
		writer.flush();
		writer.close();
		
		FileReader fr = new FileReader(file);
		LineNumberReader Inreader = new LineNumberReader(fr);
		String line = "";
		while((line = Inreader.readLine()) != null)
		{
			System.out.println(Inreader.getLineNumber() + ": " +line);
		}
		fr.close();
	}

}
