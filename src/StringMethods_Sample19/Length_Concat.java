package StringMethods_Sample19;

public class Length_Concat {
	public static void main(String[] args) {
		String word1 = "Hello Everyone! ";
		String word2 = "My name is Kagan Can Sit.";
		word1 = word1.concat(word2); // word1 string'inin sonuna word2 string'ini ekliyoruz. En sonunda olusan diziyi return eder. Bunu kaydetmek icin atama yapiyoruz..
		word1 = ">>".concat(word1);
		int wordLength = word1.length();
		System.out.println(word1 + "\n" + wordLength + " karakter uzunlugundadir.");
	}
}
