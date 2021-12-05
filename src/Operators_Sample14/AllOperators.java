package Operators_Sample14;

public class AllOperators {
	/*
		Arimetik Operatorler = 		+, -, *, /, %, ++, --
		Iliskisel Operatorler = 	==, !=, >, <, >=, <=
		Binary Operatorler =	 	&, |, ^, ~, <<, >> 			AND Kapisi, OR Kapisi, XOR Kapisi, 1'e Tumler
		Mantiksal Operatorler= 		&&, ||, !
		Atama Operatorleri=			=, +=, -=, *=, /=, %=
		Diger Operatorler=			? : , instanceOf(Tipi string ise true don)
	*/
	
    public static void main(String[] args) {
    	//Aritmetik Operatorler
    	int A=10, B=20;
    	int[] Result = new int[7];

    	Result[0]=A+B;
    	Result[1]=A-B;
    	Result[2]=A*B;
    	Result[3]=A/B;
    	Result[4]=A%B;
    	Result[5]=A++;
    	Result[6]=A--;
    	
    	for(int i=0;i<=6;i++){
    		System.out.println(Result[i]);
    	} 
    	
    	//A+B 30 ise true, degilse false don
    	boolean InsOf;
    	InsOf= A+B==30 ? true:false;
    	System.out.println("? : Operator: " + InsOf);
    	
    	String name="Kagan";
    	InsOf = name instanceof String;
    	System.out.println("InstanceOf: " + InsOf);
	}
}
