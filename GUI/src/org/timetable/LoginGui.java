package org.timetable;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginGui extends JFrame implements ActionListener {
	
	public LoginGui(){
		makeframe();
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Login code
		
	}
	
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	final int WIDTH = screenSize.width;
	final int HEIGHT = screenSize.height;
	private JTextField addCostormerTB;
	private JTextField usernametextField;
	private JPasswordField passwordField;
	
	public void makeframe(){ //frame
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/Images/sfico.png")));
		getContentPane().setLayout(null);
		setBounds((WIDTH-430)/2, (HEIGHT-300)/2, 430, 300);//
		setTitle("Login"); //
		setResizable(false); //
		
		usernametextField = new JTextField();
		usernametextField.setColumns(10);
		usernametextField.setBounds(65, 150, 145, 20);
		getContentPane().add(usernametextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 150, 145, 20);
		getContentPane().add(passwordField);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setForeground(Color.WHITE);
		PasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PasswordLabel.setBounds(220, 130, 86, 14);
		getContentPane().add(PasswordLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(Color.WHITE);
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameLabel.setBounds(65, 130, 70, 14);
		getContentPane().add(usernameLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(174, 204, 89, 23);
		getContentPane().add(loginButton);
		
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
