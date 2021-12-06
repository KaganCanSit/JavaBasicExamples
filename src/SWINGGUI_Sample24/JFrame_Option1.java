package SWINGGUI_Sample24;

import javax.swing.JFrame;

public class JFrame_Option1 extends JFrame {

	public JFrame_Option1()
	{
		setTitle("Simple Example"); 	//Olusturdugumuz formun basligi.
		setSize(300,200);				//Formumuzun genisligini ve yuksekligini belirliyoruz.
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Form icin temel asagi alma, kapatma fonksiyonlarini ekliyoruz.
	}
	
	//Main Fonksiyonu
	public static void main(String[] args) {
		JFrame_Option1 JF1 = new JFrame_Option1();	//Formumuzu nesne olarak cagiriyoruz.
		JF1.setVisible(true);
	}

}
