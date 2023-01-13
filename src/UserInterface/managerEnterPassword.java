package UserInterface;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class managerEnterPassword {

	private static JFrame frame;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					managerEnterPassword window = new managerEnterPassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void displayEnterPassword() {
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public managerEnterPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String layout = "javax.swing.plaf.nimbus.NimbusLookAndFeel"
				+ "";
		try {
			UIManager.setLookAndFeel(layout);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				FileManager.displayFileManager();
			}
		});
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(35, 29, 361, 201);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 83, 125, 21);
		mainPanel.add(passwordField);
		
		JLabel lblPasswordCheck = new JLabel("Enter Your Password :");
		lblPasswordCheck.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblPasswordCheck.setBounds(38, 81, 161, 21);
		mainPanel.add(lblPasswordCheck);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(new String(passwordField.getPassword()).length() == 0) JOptionPane.showMessageDialog(null, "password cannot be empty.", "Oh!",JOptionPane.WARNING_MESSAGE);
				else if( new String(passwordField.getPassword()).equals("444")) frame.setVisible(false);
				else if(!new String(passwordField.getPassword()).equals("444")) JOptionPane.showMessageDialog(null, "Wrong password.", "Oh!",JOptionPane.WARNING_MESSAGE);
				else JOptionPane.showMessageDialog(null, "nuknown Wrong!", "Oh!",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnEnter.setBounds(77, 168, 85, 23);
		mainPanel.add(btnEnter);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnNewButton.setBounds(211, 168, 85, 23);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FileManager.displayFileManager();
			}
		});
		mainPanel.add(btnNewButton);
		
		frame.setVisible(false);
		
	}
}
