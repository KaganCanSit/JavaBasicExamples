package a_BasicSimples;
import java.util.Random;
public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for(int counter=1;counter<=10;counter++)
		{
			number = 1 + dice.nextInt(6);		//0-5 dahilinde rastgele sayilar uretiyor. 6'ya tamamlamasi icin +1 ekliyoruz.
			System.out.println(number + " ");
		}
	}

}
