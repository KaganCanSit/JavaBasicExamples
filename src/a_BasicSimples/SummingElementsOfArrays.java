package a_BasicSimples;

public class SummingElementsOfArrays {

	public static void main(String[] args) {
		int bucky[]= {32,12,18,54,2};
		int sum=0;
		
		for(int i=0;i<bucky.length;i++)
			sum += bucky[i];
		System.out.println("The sum of these numbers is " + sum);
	}

}
