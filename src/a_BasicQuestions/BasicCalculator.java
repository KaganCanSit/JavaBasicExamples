/*
 * 	Soru2: Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor. Program aşağıdaki özellikleri sağlamalıdır.
 *	Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
 * 	Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb…
 *	Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
 *	Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
 *
 *  Kaynak: https://medium.com/@nujinaytek/java-algoritma-sorular%C4%B1-ve-%C3%A7%C3%B6z%C3%BCmleri-eclipse-%C3%BCzerinden-fa1d5cf3afc2
 */

package a_BasicQuestions;
import java.util.*;

public class BasicCalculator {
	
	//Menu ile kullanıcından yapmasını istediği işlemi seçmesini istiyoruz.
	public static int Menu()
	{
		System.out.println("**Menu**");
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.println("Islem Seciniz: ");
		Scanner OperationNum = new Scanner(System.in);
		return OperationNum.nextInt();
	}
	
	//Seçilen işlem numarasına göre iki değer arasında işlem yaparak sonuç değerini geri döndürüyoruz.
	public static int Operation (int OperationNum, int Value1, int Value2)
	{
		switch(OperationNum)
		{
			case 1:
				return Value1 + Value2;
			case 2:
				return Value1 - Value2;
			case 3:
				return Value1 - Value2;
			case 4:
				return Value1 - Value2;
			default:
				return 0;
		}
	}
	
	public static void main(String args[])
	{
		int OperationNum = Menu();
		int Value1 = 0, Value2 = 0;

		//Kullanıcından işlem yapmak istediği değerleri aliyoruz.
		Scanner input1 = new Scanner(System.in);
		Value1 = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		Value2 = input2.nextInt();
		
		System.out.println("Sonuc: " + Operation(OperationNum, Value1, Value2));
	}	
}
