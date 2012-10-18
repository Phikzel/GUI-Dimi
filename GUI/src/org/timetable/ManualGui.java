package org.timetable;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ManualGui extends JFrame {

	public ManualGui(){
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
		setTitle("Manual input"); //
		setResizable(false); //
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(About.class.getResource("/Images/sflogo.png")));
		logoLabel.setBounds(-41, 0, 304, 85);
		getContentPane().add(logoLabel);
		JLabel bgLabel = new JLabel("");
		bgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bgLabel.setIcon(new ImageIcon(About.class.getResource("/Images/sfbg3.png")));
		bgLabel.setBounds(0, 0, 430, 280);
		getContentPane().add(bgLabel);
	}
}
