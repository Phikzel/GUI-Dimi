package org.timetable;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ConnectGui extends JFrame implements ActionListener{
	
	public ConnectGui(){
		makeframe();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Connect to server code
		
	}
	
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	final int WIDTH = screenSize.width;
	final int HEIGHT = screenSize.height;
	private JTextField addCostormerTB;
	private JTextField serverTextField;
	private JTextField portTextField;
	private JTextField usernameTextfield;
	private JPasswordField passwordField;
	
	public void makeframe(){ //frame
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/Images/sfico.png")));
		getContentPane().setLayout(null);
		setBounds((WIDTH-430)/2, (HEIGHT-300)/2, 430, 300);//
		setTitle("Connect to server"); //
		setResizable(false); //
		
		JLabel PortLabel = new JLabel("Port");
		PortLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PortLabel.setForeground(Color.WHITE);
		PortLabel.setBounds(293, 89, 46, 14);
		getContentPane().add(PortLabel);
		
		JLabel serverLabel = new JLabel("Server");
		serverLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		serverLabel.setForeground(Color.WHITE);
		serverLabel.setBounds(63, 89, 46, 14);
		getContentPane().add(serverLabel);
		
		serverTextField = new JTextField();
		serverTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		serverTextField.setBounds(63, 109, 220, 20);
		getContentPane().add(serverTextField);
		serverTextField.setColumns(10);
		
		portTextField = new JTextField();
		portTextField.setBounds(293, 109, 70, 20);
		getContentPane().add(portTextField);
		portTextField.setColumns(10);
		
		usernameTextfield = new JTextField();
		usernameTextfield.setBounds(63, 167, 145, 20);
		getContentPane().add(usernameTextfield);
		usernameTextfield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(218, 167, 145, 20);
		getContentPane().add(passwordField);
		
		JButton connectToServerButton = new JButton("Connect to server");
		connectToServerButton.setBounds(145, 214, 138, 23);
		connectToServerButton.addActionListener(this);
		getContentPane().add(connectToServerButton);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameLabel.setForeground(Color.WHITE);
		usernameLabel.setBounds(63, 147, 70, 14);
		getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setBounds(218, 147, 86, 14);
		getContentPane().add(passwordLabel);
		
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
