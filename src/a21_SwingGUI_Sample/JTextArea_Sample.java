package a21_SwingGUI_Sample;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class JTextArea_Sample  extends JFrame{

	//Yeni panel alani olusturuyoruz.
	private JPanel contentPane;
	
	//Formumuzun ozelliklerini constructor method ile tanimliyoruz.
	public JTextArea_Sample()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Independence hymn");
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56,11,300,117);
		contentPane.add(scrollPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Show Me Text");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, textArea.getText());
			}
		});
		btnNewButton.setBounds(156,216,141,23);
		contentPane.add(btnNewButton);
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JTextArea_Sample frame = new JTextArea_Sample();
				frame.setVisible(true);
			}
		});	
	}
}
