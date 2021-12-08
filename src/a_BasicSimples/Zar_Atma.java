package a_BasicSimples;
import java.util.Random;

public class Zar_Atma {

	public static void main(String[] args) {
		Random zar = new Random();
		int sayi=0;
		int zar_yuzeyi[]=new int[7];
		
		for(int sayac=0; sayac<100;sayac++)
			++zar_yuzeyi[1+zar.nextInt(6)];
		
		for(int a=1;a<=6;a++)
			System.out.println(a +  " Zar Numarasi " + zar_yuzeyi[a] + " kere geldi.");
		
		int toplam=0;
		for(int y:zar_yuzeyi)
			toplam +=y;
			
		System.out.println("Toplam Gelen Zar Sayisi: " + toplam);
		
	}

}
