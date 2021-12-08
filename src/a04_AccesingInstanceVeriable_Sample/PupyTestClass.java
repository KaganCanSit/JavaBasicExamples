package a04_AccesingInstanceVeriable_Sample;

public class PupyTestClass {

	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Beyaz"); // Declaration - Instation - Initialization
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Veriable Value: " + myPuppy.pupyAge);
	}

}
