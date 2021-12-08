package a_Ekran_Ayarlari_Ornegi_Swing;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class FormEkrani extends JFrame 
{
	//Ekranimiz Icerisine nesne tanimliyoruz.
	private JTextField nesne1;
	private JTextField nesne2;
	private JTextField nesne3;
	private JPasswordField password_Nesnesi;

	//Constructor - Kurucu/Yapici Method
	public FormEkrani()
	{
		super("Ekran Ayarlari Ornegi");//Formun Basligi
		setLayout(new FlowLayout());
		
		nesne1 = new JTextField(10);
		add(nesne1); //Form Ekranina Ekleme
	
		nesne2 = new JTextField("Merhaba");
		add(nesne2);
	
		nesne3 = new JTextField("Degistirilmez Text Ornegi",30);
		nesne3.setEditable(false);	//Düzenlenemez - Editlenemez
		add(nesne3);
		
		password_Nesnesi = new JPasswordField("Sifre Girisi");
		add(password_Nesnesi);
	
		//ActionListener ile herhangi bir degisim oldup olmadigini dinliyoruz.
		thehandler handler = new thehandler();
		nesne1.addActionListener(handler);
		nesne2.addActionListener(handler);
		nesne3.addActionListener(handler);
		password_Nesnesi.addActionListener(handler);
	}


	class thehandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//Olaya gore string'in icerisine degistirecegiz. Bu sayede kolayca anlayabiliriz.
			String metin = "";
			
			if(event.getSource() == nesne1)
				metin = String.format("Metin 1: %s ", event.getActionCommand());
			else if(event.getSource() == nesne2)
				metin = String.format("Metin 2: %s", event.getActionCommand());
			else if(event.getSource() == nesne3)
				metin = String.format("Metin 3: %s", event.getActionCommand());
			else if(event.getSource() == nesne3)
				metin = String.format("Metin 3: %s", event.getActionCommand());
			else if(event.getSource() == password_Nesnesi)
				metin = String.format("Password Nesnesi: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null,metin);
		}
	}
}

