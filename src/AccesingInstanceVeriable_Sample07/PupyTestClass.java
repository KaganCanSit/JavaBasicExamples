package AccesingInstanceVeriable_Sample07;

public class PupyTestClass {

	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Beyaz"); // Declaration - Instation - Initialization
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Veriable Value: " + myPuppy.pupyAge);
	}

}
