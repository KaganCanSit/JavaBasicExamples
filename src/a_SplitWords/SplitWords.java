package a_SplitWords;

public class SplitWords {
	
	public static void main(String[] args) {
		solution("Merhaba");
	}
	
	public static String[] solution(String s) {
		int sLen = s.length(), start=0, end=2;
		
		
		if(sLen%2==0)
		{
			String sArray1[] = new String[sLen/2];
			for(int i=0;i<=sLen/2-1;i++)
			{
				String value = s.substring(start, end);
				start+=2;
				end+=2;
				sArray1[i] = value;
			}
			return sArray1;
		}
		else
		{
			String sArray1[] = new String[(sLen/2)+1];
			int i=0;
			for(i=0;i<=sLen/2-1;i++)
			{
				String value = s.substring(start, end);
				start+=2;
				end+=2;
				sArray1[i] = value;
			}

			String last = s.substring(sLen-1, sLen);
			sArray1[i+1] = last.concat("_");
			return sArray1;
		}		
    }
}
