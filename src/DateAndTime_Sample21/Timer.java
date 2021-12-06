package DateAndTime_Sample21;
import java.util.*;

public class Timer {
	public static void main(String[] args) {
		try 
		{
			long start = System.currentTimeMillis();
			Date startdate = new Date();
			System.out.println(startdate.toString() + "\n");
		
			Thread.sleep(3000);
			
			long end = System.currentTimeMillis();
			Date stopdate = new Date();
			System.out.println(stopdate.toString() + "\n");
			
			long diff = end - start;
			System.out.println("Difference is: " + diff);
		}
		catch(Exception e)
		{
			System.out.println("Got an exeption!");
		}
	}
}
