package a21_SwingGUI_Sample;

import javax.swing.*;
import javax.swing.JToggleButton.ToggleButtonModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jToggleButton_Sample extends JFrame {
	private JPanel contentPane;
	private JToggleButton redButton;
	private JToggleButton greenButton;
	private JToggleButton blueButton;
	private JPanel display;
	
	public jToggleButton_Sample() 
	{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 302, 245);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			display = new JPanel();
			display.setBounds(155, 27, 121, 113);
			display.setBorder(LineBorder.createGrayLineBorder());
			display.setBackground(Color.black);
			contentPane.add(display);
			redButton = new JToggleButton("red");
			redButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					Color color = display.getBackground();
					int red = color.getRed();
					int green = color.getGreen();
					int blue = color.getBlue();
					if (e.getActionCommand().equals("red")) 
					{
						if (red == 0) 
						{
							red = 255;
						}
						else 
						{
							red = 0;
						}
					}
					Color setCol = new Color(red, green, blue);
					display.setBackground(setCol);
				}
			});
			
			redButton.setBounds(10, 27, 121, 23);
			contentPane.add(redButton);
			greenButton = new JToggleButton("green");
			greenButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Color color = display.getBackground();
					 int red = color.getRed();
					 int green = color.getGreen();
					 int blue = color.getBlue();
					 if (e.getActionCommand().equals("green")) 
					 {
						 if (green == 0) 
						 {
							 green = 255;
						 } 
						 else 
						 {
							 green = 0;
						 }
					 }
				 Color setCol = new Color(red, green, blue);
				 display.setBackground(setCol);
				}
			});
			
			greenButton.setBounds(10, 65, 121, 23);
			contentPane.add(greenButton);
			blueButton = new JToggleButton("blue");
			
			blueButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Color color = display.getBackground();
					int red = color.getRed();
					int green = color.getGreen();
					int blue = color.getBlue();
					
					if (e.getActionCommand().equals("blue")) {
						if (blue == 0) 
						{
							blue = 255;
						}
						else 
						{
							blue = 0;
						}
					}
					Color setCol = new Color(red, green, blue);
					display.setBackground(setCol);
				}
			});
		blueButton.setBounds(10, 100, 121, 23);
		contentPane.add(blueButton);
}
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				jToggleButton_Sample frame = new jToggleButton_Sample();
				frame.setVisible(true);
			}
		});
	}
}

