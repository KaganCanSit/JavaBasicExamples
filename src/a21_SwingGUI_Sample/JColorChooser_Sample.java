package a21_SwingGUI_Sample;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooser_Sample extends JFrame {

	private JPanel contentPane;
	
	public JColorChooser_Sample()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0,0,0)));
		panel.setBounds(67,74,220,145);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Choose Color");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Color color = JColorChooser.showDialog(null, "Choose Color", Color.white);
				panel.setBackground(color);
			}
		});
		btnNewButton.setBounds(10,11,111,23);
		contentPane.add(btnNewButton);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JColorChooser_Sample frame = new JColorChooser_Sample();
				frame.setVisible(true);
			}
		});
	}

}