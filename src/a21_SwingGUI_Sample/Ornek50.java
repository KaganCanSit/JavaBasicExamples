package a21_SwingGUI_Sample;
import javax.swing.JOptionPane;

public class Ornek50 {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter First Number: ");
		String sn = JOptionPane.showInputDialog("Enter Second Number: ");
		
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum = num1+num2;
		//Olusan ekran degerini null ekranina (gorsel ekrana) tasi
		JOptionPane.showMessageDialog(null, "The answer is" + sum, "the title",JOptionPane.PLAIN_MESSAGE);
	}
}
