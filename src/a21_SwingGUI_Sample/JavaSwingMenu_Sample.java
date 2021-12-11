package a21_SwingGUI_Sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JavaSwingMenu_Sample extends JFrame{
	
	public JavaSwingMenu_Sample()
	{
		JMenuBar menubar = new JMenuBar();		
		JMenu filemenu = new JMenu("File");
		
		JMenuItem eMenuItem = new JMenuItem("Exit");
		eMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
	
		filemenu.add(eMenuItem);
		menubar.add(filemenu);
		
		setJMenuBar(menubar);
		
		setTitle("Simple Menu");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JavaSwingMenu_Sample ex = new JavaSwingMenu_Sample();
				ex.setVisible(true);
			}
		});
	}
}
