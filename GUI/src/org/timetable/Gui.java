package org.timetable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Gui extends JFrame implements ActionListener {
	
	public Gui()  {
		Makeframe();
	}
	JLabel buttonLabel;
	JLabel usernameLabel;
	JLabel serverLabel;
	JLabel statusLabel;
	JComboBox comboBox;
	
	Boolean bool = false;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	final int WIDTH = screenSize.width;
	final int HEIGHT = screenSize.height;
	
	
	public void Makeframe(){
		makeBasic();
		makeMenuBar();
		makeField();
		makeGraphic();
	}
	
	
	public void makeBasic(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("/Images/sfico.png")));//
		setTitle("TimeTable"); //
		setResizable(false); //
		setBounds(WIDTH - 300, 5, 300, 430);
		//setSize(300,430); //
		getContentPane().setLayout(null); //
	}
	
	public void makeMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 294, 21);
		getContentPane().add(menuBar); //
		
		JMenu editMenu = new JMenu("Edit ");
		menuBar.add(editMenu);
		JMenuItem ConnectItem = new JMenuItem("Connect to server");
		ConnectItem.addActionListener(this);
		editMenu.add(ConnectItem);
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Login");
		mntmNewMenuItem_1.addActionListener(this);
		editMenu.add(mntmNewMenuItem_1);
		JMenuItem mntmNewMenuItem = new JMenuItem("Add customer");
		mntmNewMenuItem.addActionListener(this);
		editMenu.add(mntmNewMenuItem);
		JMenuItem ManualInputItem = new JMenuItem("Manual Input");
		ManualInputItem.addActionListener(this);
		editMenu.add(ManualInputItem);
		JMenuItem HistoryItem = new JMenuItem("History");
		HistoryItem.addActionListener(this);
		editMenu.add(HistoryItem);
		
		JMenu infoMenu = new JMenu("Info");
		menuBar.add(infoMenu);
		JMenuItem AboutItem = new JMenuItem("About");
		AboutItem.addActionListener(this);
		infoMenu.add(AboutItem);
	}
	
	public void makeField(){
		buttonLabel = new JLabel("");
		buttonLabel.setIcon(new ImageIcon(Gui.class.getResource("/Images/off.png")));
		buttonLabel.setBounds(42, 180, 200, 200);
		buttonLabel.addMouseListener(new MouseAdapter() { public void mouseReleased(MouseEvent e)  { buttoncolor(); }});
		getContentPane().add(buttonLabel); //
		
		usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		usernameLabel.setBounds(5, 380, 140, 20);
		getContentPane().add(usernameLabel);
		
		serverLabel = new JLabel("Server");
		serverLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		serverLabel.setBounds(149, 380, 140, 20);
		serverLabel.setHorizontalAlignment(JLabel.RIGHT);
		getContentPane().add(serverLabel);//
		
		statusLabel = new JLabel("Status");
		statusLabel.setForeground(Color.WHITE);
		statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		statusLabel.setBounds(8, 150, 276, 35);
		statusLabel.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add(statusLabel);//
		
		JButton refreshButton = new JButton("");
		refreshButton.setSelectedIcon(new ImageIcon(Gui.class.getResource("/Images/rf.png")));
		refreshButton.setIcon(new ImageIcon(Gui.class.getResource("/Images/refr.png")));
		refreshButton.setBounds(215, 107, 27, 23);
		getContentPane().add(refreshButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Klanten", "klant01", "klant02", "klant03", "klant04", "klant05", "klant06", "klant07", "klant08", "klant09", "klant10", "klant11", "klant12"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(45, 108, 172, 20);
		getContentPane().add(comboBox);//
		
		JLabel selectlabel = new JLabel("Select customer");
		selectlabel.setForeground(Color.WHITE);
		selectlabel.setBounds(45, 93, 110, 14);
		getContentPane().add(selectlabel);//
	}
	
	public void makeGraphic(){
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(Gui.class.getResource("/Images/sflogo.png")));
		logoLabel.setBounds(0, 20, 294, 74);
		getContentPane().add(logoLabel);//
		
		JLabel backLabel = new JLabel("");
		backLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backLabel.setIcon(new ImageIcon(Gui.class.getResource("/Images/sfbg3.png")));
		backLabel.setBounds(0, 20, 294, 382);
		getContentPane().add(backLabel);//
	}
	
	
	
	public void buttoncolor(){
		if(!bool){
    		buttonLabel.setIcon(new ImageIcon(Gui.class.getResource("/Images/on.png")));
    		bool = true;
    		statusLabel.setText("let's work");
    	}
    	else{
    		buttonLabel.setIcon(new ImageIcon(Gui.class.getResource("/Images/off.png")));
    		bool = false;
    		statusLabel.setText("Stop");
    	}
    	buttonLabel.repaint();
    	//buttonLabel.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
        if(command.equals("About")) {
        	About about = new About();
        	about.toFront();
    		about.setVisible(true);
        }
        else if(command.equals("Connect to server")) {
        	ConnectGui connect = new ConnectGui();
        	connect.toFront();
    		connect.setVisible(true);
        }
        else if(command.equals("Login")) {
        	LoginGui login = new LoginGui();
        	login.toFront();
    		login.setVisible(true);
        }
        else if(command.equals("Add customer")) {
        	CostomerGui costemer = new CostomerGui();
        	costemer.toFront();
    		costemer.setVisible(true);
        }
        else if(command.equals("Manual Input")) {
        	ManualGui manual = new ManualGui();
        	manual.toFront();
    		manual.setVisible(true);
        }
        else if(command.equals("History")) {
        	HistoryGui history = new HistoryGui();
        	history.toFront();
    		history.setVisible(true);
        }
	}
}
