package login;

import javax.swing.*;

import UserInterface.UserInterface;

import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

	private static final long serialVersionUID = -4352093231107430236L;
	private JPanel jpanel1, jpanel2, jpanel3, jpanel4, jpanel5;
	private JLabel label1, label2, label3;
	private JTextField username;
	private JPasswordField password;
	private JButton button1;
	
	public Login() {
		login();
	}

	private void login() {
		String layout = "javax.swing.plaf.nimbus.NimbusLookAndFeel"
				+ "";
		try {
			UIManager.setLookAndFeel(layout);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		this.setTitle("Login Page");
		this.setLayout(new GridLayout(5, 1));
		this.setSize(500, 500);
		this.setResizable(false);
		
		// jpanel1
		jpanel1 = new JPanel();
		this.add(jpanel1);
		
		// jpanel2
		jpanel2 = new JPanel();
		this.add(jpanel2);
		label1 = new JLabel("Welcome to Login Page!");
		jpanel2.add(label1);
		
		// jpanel3
		jpanel3 = new JPanel();
		this.add(jpanel3);
		label2 = new JLabel("Username:");
		jpanel3.add(label2);
		username = new JTextField(10);
		jpanel3.add(username);
		
		// jpanel4
		jpanel4 = new JPanel();
		this.add(jpanel4);
		label3 = new JLabel("Password:");
		jpanel4.add(label3);
		password = new JPasswordField(10);
		jpanel4.add(password);
		
		// jpanel5
		jpanel5 = new JPanel();
		this.add(jpanel5);
		button1 = new JButton("Log in");
		jpanel5.add(button1);
		
		
		
		// btn1
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int result = 0;
				
				if (username.getText().length() == 0 || new String(password.getPassword()).length() == 0)
					JOptionPane.showMessageDialog(null, "Username and password cannot be empty.", "Oh!",JOptionPane.WARNING_MESSAGE);
				else if (username.getText().equals("廚師") && new String(password.getPassword()).equals("000")) {
					result = JOptionPane.showConfirmDialog(null, "Hi 廚師! Work now?", "Welcome", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new UserInterface("CannotWork");
					}
					else if (result == 1) {
						System.exit(0);
					}
				}
				else if (username.getText().equals("服務生") && new String(password.getPassword()).equals("111")) {
					result = JOptionPane.showConfirmDialog(null, "Hi 服務生! Work now?", "Welcome", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new UserInterface("Server");
					}
					else if (result == 1) {
						System.exit(0);
					}
				}
				else if (username.getText().equals("櫃檯") && new String(password.getPassword()).equals("222")) {
					result = JOptionPane.showConfirmDialog(null, "Hi 櫃檯! Work now?", "Welcome", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new UserInterface("Server");
					}
					else if (result == 1) {
						System.exit(0);
					}
				}
				else if (username.getText().equals("雜工") && new String(password.getPassword()).equals("333")) {
					result = JOptionPane.showConfirmDialog(null, "Hi 雜工! Work now?", "Welcome", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new UserInterface("CannotWork");
					}
					else if (result == 1) {
						System.exit(0);
					}
				}
				else if (username.getText().equals("經理") && new String(password.getPassword()).equals("444")) {
					result = JOptionPane.showConfirmDialog(null, "Hi 經理! Work now?", "Welcome", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new UserInterface("Manager");//4
					}
					else if (result == 1) {
						System.exit(0);
					}
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Oops!",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
