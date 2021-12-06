package SWINGGUI_Sample24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelSimple extends JFrame {

	
	public JLabelSimple() {
		setTitle("No Sleep");
		
		String lyrics = "<html>It's way too late to think of<br>Someone I would call now<br>"+
						"And neon signs got tired<br>Red eye flights help the stars out<br>" +
						"I'm safe in a corner<br>Just hours before me<br></html>";
	
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(10,10));
		
		JLabel label = new JLabel (lyrics);
		label.setFont(new Font("Georgia", Font.PLAIN,14));
		label.setForeground(new Color(50,50,20));
		label.setBounds(105,129,46,14);
		
		panel.add(label, BorderLayout.CENTER);
		add(panel);
		pack();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JLabelSimple mylabel = new JLabelSimple();
		mylabel.setVisible(true);
	}
}
