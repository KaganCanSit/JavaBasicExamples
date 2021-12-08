package a_BasicSimples;

public class ArtisOrnegi {
	public static void main(String args[])
	{
		int tuna=5, bass=15;
		int temp;
		++tuna;				//Burada temp=++tuna olsaydi. Deger artar sonra degiskene iletirdi.		 (tuna=6 / tuna=6)
		bass++;				//Burada ise temp=bass++ olsaydi. Deger atanir, daha sonra bass artardi. (temp=15 / bass=16)
		tuna=bass+5;
		bass*=8;
		System.out.println(tuna);
		System.out.println(bass);
	}
}
