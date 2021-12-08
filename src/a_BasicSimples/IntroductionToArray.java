package a_BasicSimples;

public class IntroductionToArray {

	public static void main(String[] args) {
		int bucky[]=new int[10];
		int pukky[]= {2,4,5,7,9};
		
		bucky[0]=87;
		bucky[1]=543;
		bucky[2]=65;
	
		System.out.println(bucky[1]);
		System.out.println(bucky[9]);	//Onemli nokta burasi. C dilindeki gibi bellekten sacma bir deger gelmez. 0 verir.
		System.out.println(bucky[2]);
		System.out.println(pukky[1]);
	}
}
