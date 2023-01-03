package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import java.awt.Font;

public class CheckStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckStore window = new CheckStore();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckStore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
				new LogOutAndExit("CheckStore");
			}
		});
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 21, 416, 232);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JFormattedTextField ftfRice = new JFormattedTextField();
		ftfRice.setText("20");
		ftfRice.setEditable(false);
		ftfRice.setBorder(null);
		ftfRice.setBackground(SystemColor.menu);
		ftfRice.setBounds(84, 26, 44, 27);
		panel.add(ftfRice);
		
		JLabel lblRice = new JLabel("飯:");
		lblRice.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblRice.setBounds(45, 32, 29, 15);
		panel.add(lblRice);
		
		JLabel lblNudle = new JLabel("麵:");
		lblNudle.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblNudle.setBounds(45, 78, 29, 15);
		panel.add(lblNudle);
		
		JFormattedTextField ftfNudle = new JFormattedTextField();
		ftfNudle.setText("15");
		ftfNudle.setEditable(false);
		ftfNudle.setBorder(null);
		ftfNudle.setBackground(SystemColor.menu);
		ftfNudle.setBounds(84, 74, 44, 27);
		panel.add(ftfNudle);
		
		JLabel lblSoup = new JLabel("湯:");
		lblSoup.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblSoup.setBounds(45, 124, 29, 15);
		panel.add(lblSoup);
		
		JFormattedTextField ftfSoup = new JFormattedTextField();
		ftfSoup.setText("18");
		ftfSoup.setEditable(false);
		ftfSoup.setBorder(null);
		ftfSoup.setBackground(SystemColor.menu);
		ftfSoup.setBounds(84, 123, 44, 27);
		panel.add(ftfSoup);
		
		JLabel lblJuice = new JLabel("醬包:");
		lblJuice.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblJuice.setBounds(45, 176, 44, 15);
		panel.add(lblJuice);
		
		JFormattedTextField ftfJuice = new JFormattedTextField();
		ftfJuice.setText("22");
		ftfJuice.setEditable(false);
		ftfJuice.setBorder(null);
		ftfJuice.setBackground(SystemColor.menu);
		ftfJuice.setBounds(84, 175, 44, 27);
		panel.add(ftfJuice);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnBack.setBounds(331, 209, 85, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new UserInterface("Manager");
			}
		});
		panel.add(btnBack);
		
		frame.setVisible(true);
	}

}
