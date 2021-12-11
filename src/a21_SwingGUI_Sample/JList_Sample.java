package a21_SwingGUI_Sample;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;

public class JList_Sample extends JFrame {
	
	private JPanel contentPane;
	String[] listColorNames = {"black", "blue", "green", "yellow", "white"};
	Color[] listColorValues = {Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW, Color.WHITE};
	
	public JList_Sample()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JList list = new JList(listColorNames);
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				contentPane.setBackground(listColorValues[list.getSelectedIndex()]);
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		list.setBounds(109,54,144,163);
		contentPane.add(list);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				JList_Sample frame = new JList_Sample();
				frame.setVisible(true);
			}
		});

	}

}
