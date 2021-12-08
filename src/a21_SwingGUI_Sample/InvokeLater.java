package a21_SwingGUI_Sample;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//Class JFrame kutuphanesinden miras alir, class'i birnevi frame olarak degistiriyoruz.
public class InvokeLater extends JFrame{

	//Olusturulacak Olan Formun Ozellikleri
	public InvokeLater() {
		setTitle("Simple example");
		setSize(300,200);	//Pencere 300px uzunluk 200 px genislik
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){ 		//Olaylari kuyruga al.
			public void run() {
				InvokeLater ex = new InvokeLater();		//Formu cagir, gorunur kil.
				ex.setVisible(true);
			}
		});
	}
}
