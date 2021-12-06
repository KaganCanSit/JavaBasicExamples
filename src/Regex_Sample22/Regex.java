package Regex_Sample22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) 
	{
		//String to be scanned to find the pattern.
		String line = "Benim mailim maltepe@maltepe.edu.tr Bu ise arkadasim maili aa@aa.com seklindedir.";
		String  pattern = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
		
		
		//Create a Pattern Object
		Pattern r = Pattern.compile(pattern);
		
		//Now Create Matcher Object
		Matcher m = r.matcher(line);
		while(m.find())
		{
			System.out.println("Found: " + m.group());
		}
	}
}
