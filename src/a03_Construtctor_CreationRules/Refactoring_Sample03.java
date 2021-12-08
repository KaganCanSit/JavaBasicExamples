package a03_Construtctor_CreationRules;

public class Refactoring_Sample03 {

	public static void main(String[] args) {
		int sum = 0;
		//Burada asagadaki for ilk olarak burada yer aliyordu. Yaptigimiz hizli islem Refactor / Extract Method yolunu kullanarak hizli fonksiyon tanimlamakti.
		sum = calculateSum(sum);
		System.out.println(sum);
	}

	private static int calculateSum(int sum) {
		for(int i =1; i<=100;i++)
		{
			sum +=i;
		}
		return sum;
	}

}
