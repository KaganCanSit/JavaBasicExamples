package a_Ekran_Ayarlari_Ornegi_Swing;

import javax.swing.*;

public class Ekran_Ayarlari {

	//Ana Ekran
	public static void main(String[] args) 
	{
		//Formun genel ozellikleri kapatma fonksiyonlari, boyutu, gorunebilirligi gibi nitelikleri belirliyoruzç
		FormEkrani ekran_tanimi = new FormEkrani();	//Diger sinifimizdan cagirarak var olan JFrame alani icerisine nesneleri ekliyoruz.
		ekran_tanimi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ekran_tanimi.setSize(300,200);
		ekran_tanimi.setVisible(true);
	}

}
