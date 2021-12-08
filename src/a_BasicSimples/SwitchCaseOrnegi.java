package a_BasicSimples;

public class SwitchCaseOrnegi {
	public static void main(String[] args) {
		int age=3;
		switch(age){
		case 1:
			System.out.println("You can crowl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble.");
			break;
		default:
			System.out.println("I don't know how old are you");
			break;
		}
	}
}
