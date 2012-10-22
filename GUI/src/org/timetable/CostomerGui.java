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
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CostomerGui extends JFrame implements ActionListener {
	
	Gui parent;
	
	public CostomerGui(Gui _parent){
		parent = _parent;
		makeframe();
	}
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	final int WIDTH = screenSize.width;
	final int HEIGHT = screenSize.height;
	private JTextField addCostormerTB;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
        if(command.equals("Add Costomer")) {
        	//Add code here
        }
        else if(command.equals("Delete selected costormer")) {
        	ConnectGui connect = new ConnectGui();
        	connect.toFront();
    		connect.setVisible(true);
        }
	}
	
	public void makeframe(){ //frame
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/Images/sfico.png")));
		getContentPane().setLayout(null);
		setBounds((WIDTH-430)/2, (HEIGHT-300)/2, 430, 300);//
		setTitle("Add Costormer"); //
		setResizable(false);
		
		JList costomerList = new JList(parent.temp);
		costomerList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JScrollPane scroll = new JScrollPane (costomerList, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setLocation(226, 43);
		scroll.setSize(188, 195);
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
		addCostomerButton.addActionListener(this);
		getContentPane().add(addCostomerButton);
		
		JButton deleteCostormerButton = new JButton("Delete selected costormer");
		deleteCostormerButton.setBounds(226, 238, 188, 23);
		deleteCostormerButton.addActionListener(this);
		getContentPane().add(deleteCostormerButton);
		
		JLabel costormerLabel = new JLabel("Costormers");
		costormerLabel.setForeground(Color.WHITE);
		costormerLabel.setBounds(226, 25, 73, 21);
		getContentPane().add(costormerLabel);
		
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
