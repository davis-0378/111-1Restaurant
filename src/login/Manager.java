package login;

import javax.swing.*;

public class Manager extends JFrame {
	private JPanel jpanel0;
	private String welcome = "Hello Manager!";
	private JLabel Welcome = new JLabel(welcome);
	
	public Manager() {
		jpanel0 = new JPanel();
		this.add(Welcome);
		this.add(jpanel0);
		jpanel0.add(Welcome);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}