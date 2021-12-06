package SWINGGUI_Sample24;

import java.awt.event.ActionEvent;	//Olaylari dinlemesi icin bu iki kutuphaneyi ekliyoruz.
import java.awt.event.ActionListener;

import javax.swing.*;

public class JButton_Examples extends JFrame {
	
	// constructor
	 public JButton_Examples() 
	 {
		 initUI();
	 }
	 
	 // initialize GUI components
	 public final void initUI() 
	 {
		 JPanel panel = new JPanel();
		 getContentPane().add(panel);
		 panel.setLayout(null);
		 JButton quitButton = new JButton("Quit");
		 quitButton.setBounds(50, 60, 80, 30);
	 
		 //Button Event
		 quitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent event) {
	 
				 System.exit(0);
	 
			 	}
		 	});
		 
		 panel.add(quitButton);
		 setTitle("Quit button");
		 setSize(300, 200);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	 
	 //Main method
	 public static void main(String[] args)
	 {
		 SwingUtilities.invokeLater(new Runnable() {
			 public void run() 
			 {
				 JButton_Examples ex = new JButton_Examples();
				 ex.setVisible(true); 
			 }
		 });
	 }
}
