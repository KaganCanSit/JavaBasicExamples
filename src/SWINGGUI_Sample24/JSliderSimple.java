package SWINGGUI_Sample24;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class JSliderSimple extends JFrame{
	
	private JSlider slider;
	private JLabel label;
	
	public JSliderSimple() {
		initUI();
	}
	
	public final void initUI() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
		setLayout(new BorderLayout());
		
		panel.add(Box.createHorizontalGlue());
		slider = new JSlider(0,150,0);
		
		slider.setPreferredSize(new Dimension(150,30));
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				int value = slider.getValue();
				if(value==0) {
					label.setText("<|");
				}
				else if(value > 0 && value<=30) {
					label.setText("<|)");
				}
				else if(value > 30 && value<=80) {
					label.setText("<|))");
				}
				else{
					label.setText("<|)))");
				}
			}
		});
		
		panel.add(slider);
		
		label = new JLabel("<|",JLabel.CENTER);
		panel.add(label);
		panel.add(Box.createHorizontalGlue());
		add(panel,BorderLayout.CENTER);
		
		pack();
		
		setTitle("JSlider");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JSliderSimple ex = new JSliderSimple();
				ex.setVisible(true);
			}
		});
	}

}