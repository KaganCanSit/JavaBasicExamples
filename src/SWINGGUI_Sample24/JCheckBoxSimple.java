package SWINGGUI_Sample24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JCheckBoxSimple extends JFrame {
	
	public JCheckBoxSimple() {
		initUI();
	}
	
	public final void initUI() {
		final JCheckBox checkbox = new JCheckBox("Show Title", true);
		checkbox.setBounds(37,23,127,23);
		
		getContentPane().setLayout(null);
		getContentPane().add(checkbox);
		
		checkbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean state = checkbox.isSelected();
				if(state) {
					setTitle("JCheckbox example");
				}
				else {
					setTitle("");
				}
			}
		});
		
		setSize(280,200);
		setTitle("JCheckBox example");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JCheckBoxSimple ex = new JCheckBoxSimple();
				ex.setVisible(true);
			}
		});
	}

}
