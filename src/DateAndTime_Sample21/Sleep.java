package DateAndTime_Sample21;
import java.util.*;
public class Sleep {
	public static void main(String[] args) 
	{
		//3 saniye uyku
		try
		{
			Date start = new Date();
			System.out.println(start.toString() + "\n");
			
			Thread.sleep(3000);
			
			Date stop = new Date();
			System.out.println(stop.toString() + "\n");
		}
		catch(Exception e)
		{
			System.out.println("Got an exception!");
		}
	}
}
