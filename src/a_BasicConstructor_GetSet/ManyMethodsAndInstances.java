package a_BasicConstructor_GetSet;

import java.util.Scanner;

public class ManyMethodsAndInstances {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		ManyMethodsAndInstances1 MMAI1Object = new ManyMethodsAndInstances1();
		System.out.println("Enter name of first gf here: ");
		String temp = girdi.nextLine();
		MMAI1Object.setName(temp);
		MMAI1Object.saying();
	}

}
