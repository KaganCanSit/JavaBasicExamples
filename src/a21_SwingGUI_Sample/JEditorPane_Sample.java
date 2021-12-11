package a21_SwingGUI_Sample;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class JEditorPane_Sample extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public JEditorPane_Sample()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,850,517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setBounds(10,11,36,14);
		contentPane.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(56,8,688,20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10,39,800,416);
		contentPane.add(scrollPane);
			
		final JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try {
					editorPane.setPage(textField.getText());
				}
				catch (Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(754,7,56,23);
		contentPane.add(btnNewButton);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JEditorPane_Sample frame = new JEditorPane_Sample(); 
				frame.setVisible(true);
			}
		});
	}
}
