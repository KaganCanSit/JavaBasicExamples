package a17_Arrays_Sample;

public class Array_For_ForEach {

	public static void main(String[] args) 
	{
		double[] myList = {1.9, 2.9, 3.4, 3.5};
	//FOR	
		//Print All The Array Elements
		for(int i=0; i<myList.length; i++)
			System.out.println(myList[i] + " ");
	
		//Summing All Elements
		double total=0;
		for(int i=0; i<myList.length;i++)
			total += myList[i];
		System.out.println("Total: " + total);
		
		//Finding The Largest Elements
		double max=myList[0];
		for(int i=1;i<myList.length;i++)
			if(myList[i]>max) max=myList[i];

		System.out.println("Max is: " + max);
		
	//FOREACH
		//Print All The Array Elements
		for(double element:myList)
			System.out.println(element);
		
	}

}
