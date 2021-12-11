package a21_SwingGUI_Sample;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JTable_Sample extends JFrame{

	private JPanel contentPane;
	private JTable table;
	
	//The data used as the titles for the table.
	String[] title = {"No.","Country", "Player", "Position"};
	
	//The data used in the table,placed as multi-dimensional array.
	Object[][] playerdata = {
			{4, "United States", "Sterling Davis" , "Forward"}, 
			{6, "Germany", "Moritz Wohlers", "Forward/Centre"}, 
			{7, "United Kingdom", "Ross Hutton", "Centre"}, 
			{8, "Belgium", "Hugo Sterk", "Guard"}, 
			{10, "United Kingdom", "Andy Pearson", "Forward"}, 
			{11, "United States", "Robert Yanders", "Guard"}, 
			{12, "United Kingdom", "Graham Hunter", "Guard"}, 
			{14, "United Kingdom", "Julius Joseph", "Guard/Forward"}, 
			{15, "United Kingdom", "Gareth Murray", "Forward"}, 
			{21, "United States", "Maurice Hampton", "Guard"}
	};
	
	public JTable_Sample() 
	{ 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 45, 344, 119);
		contentPane.add(scrollPane);
		table = new JTable(playerdata, title);
		scrollPane.setViewportView(table);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { 
				try { 
					JTable_Sample frame = new JTable_Sample();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{ 
					e.printStackTrace(); 
				} 
			}
		}); 
	}
}