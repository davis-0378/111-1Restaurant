package censusInterface;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import UserInterface.LogOutAndExit;
import UserInterface.UserInterface;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private static JFrame frame;
	protected Object window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void displayView() {
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public View() {
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
		frame.setBounds(465, 220, 450, 300);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				LogOutAndExit.displayLogOutAndExit("View");
			}
		});
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("查看報表");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(180, 67, 80, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("按小時");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewH.displayViewH();
			}
		});
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnNewButton.setBounds(119, 124, 95, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("按該日");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		btnNewButton_1.setBounds(219, 124, 95, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewD.displayViewD();
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("回前頁");
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.PLAIN, 13));
		btnNewButton_2.setBounds(349, 224, 75, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserInterface.displayUser();
			}
		});

		frame.getContentPane().add(btnNewButton_2);
		frame.setVisible(false);
	}
}
