package org.timetable;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CostomerGui extends JFrame {
	
	String[] temp = new String[]{"klant01", "klant02","klant01", "klant02","klant01", "klant02","klant01", "klant02","klant01", "klant02","klant01", "klant02"};
	
	public CostomerGui(){
		makeframe();
		
		
	}
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	final int WIDTH = screenSize.width;
	final int HEIGHT = screenSize.height;
	private JTextField addCostormerTB;
	
	public void makeframe(){ //frame
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/Images/sfico.png")));
		getContentPane().setLayout(null);
		setBounds((WIDTH-430)/2, (HEIGHT-300)/2, 430, 300);//
		setTitle("Add Costormer"); //
		setResizable(false);
		
		JList costomerList = new JList(temp);
		costomerList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JScrollPane scroll = new JScrollPane (costomerList, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setLocation(226, 11);
		scroll.setSize(188, 250);
		costomerList.setBackground(new Color(0,0,0));
		costomerList.setForeground(Color.WHITE);
		costomerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getContentPane().add(scroll);
		
		addCostormerTB = new JTextField();
		addCostormerTB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addCostormerTB.setBounds(10, 122, 206, 20);
		getContentPane().add(addCostormerTB);
		addCostormerTB.setColumns(10);
		
		JButton addCostomerButton = new JButton("Add Costomer");
		addCostomerButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addCostomerButton.setBounds(55, 169, 121, 23);
		getContentPane().add(addCostomerButton);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(About.class.getResource("/Images/sflogo.png")));
		logoLabel.setBounds(-41, 0, 304, 85);
		getContentPane().add(logoLabel);
		JLabel bgLabel = new JLabel("");
		bgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bgLabel.setIcon(new ImageIcon(About.class.getResource("/Images/sfbg3.png")));
		bgLabel.setBounds(0, 0, 430, 300);
		getContentPane().add(bgLabel);
		
	}
}
