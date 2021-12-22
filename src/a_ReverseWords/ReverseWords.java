package a_ReverseWords;

public class ReverseWords {

	public static void main(String[] args) {
		String deneme="";
		deneme = reverseWords("Merhaba Dunya!");
		System.out.println(deneme);
	}
	
	public static String reverseWords(final String original)
	{
		String temp = original;
	    String words[]=temp.split(" ");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  

}
