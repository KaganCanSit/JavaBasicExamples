package a21_SwingGUI_Sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.*;
import java.io.File;


public class JFileChooser_Sample extends JFrame{

	private JPanel contentPane;
	
	public JFileChooser_Sample()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(20,50,387,187);
		contentPane.add(editorPane);
		
		JButton btnNewButton = new JButton("Open File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fileopen = new JFileChooser();
				FileFilter filter = new FileNameExtensionFilter("txt files", "txt");
				fileopen.addChoosableFileFilter(filter);
				
				int answer = fileopen.showDialog(null, "Open File");
				if(answer == JFileChooser.APPROVE_OPTION)
				{
					File file = fileopen.getSelectedFile();
					try {
						editorPane.setPage("File:///"+file);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(10,11,89,23);
		contentPane.add(btnNewButton);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					JFileChooser_Sample frame = new JFileChooser_Sample();
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

}
