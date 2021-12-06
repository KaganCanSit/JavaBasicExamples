package Arrays_Sample20;

import java.util.Arrays; // sort ve binarySearch icin kutuphaneyi import ediyoruz.

public class ArrayMethods_sort_binarySearch {
	
	//Dizi Method Ornegi
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
			System.out.println(array[i] + " ");
	}
	
	public static void main(String[] args) {
		int intArr[] = {30,20,5,12,55};
		Arrays.sort(intArr);	// Sort ile diziyi buyukten kucuge siraladik.
		System.out.println("Sort Fonksiyonu ile dizinin siralanmis hali: ");
		printArray(intArr);
		
		
		int searchValue = 12, result; //Aranacak olan deger
		result = Arrays.binarySearch(intArr, searchValue);
		System.out.println("The index of element 12: " + result);
	}

}
