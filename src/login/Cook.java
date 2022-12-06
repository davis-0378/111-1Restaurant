package login;

import javax.swing.*;

public class Cook extends JFrame {
	private JPanel jpanel0;
	private String welcome = "Hello Cook!";
	private JLabel Welcome = new JLabel(welcome);
	
	public Cook() {
		jpanel0 = new JPanel();
		this.add(Welcome);
		this.add(jpanel0);
		jpanel0.add(Welcome);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}