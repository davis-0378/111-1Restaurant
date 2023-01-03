package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class TableDetail {

	private JFrame frame;
	private JTextField txtFTableNum;
	private JTextField txtFAmount;
	private JTextField txtFServer;
	private JTextField txtFStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDetail window = new TableDetail();
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
	public TableDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 243);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTableNum = new JLabel("Table");
		lblTableNum.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTableNum.setBounds(45, 35, 46, 15);
		panel.add(lblTableNum);
		
		JLabel lblAmount = new JLabel("The amount");
		lblAmount.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblAmount.setBounds(45, 85, 85, 15);
		panel.add(lblAmount);
		
		JLabel lblServer = new JLabel("Server");
		lblServer.setBounds(45, 135, 46, 15);
		panel.add(lblServer);
		
		txtFTableNum = new JTextField();
		txtFTableNum.setText("3");
		txtFTableNum.setEnabled(false);
		txtFTableNum.setBackground(new Color(255, 255, 255));
		txtFTableNum.setEditable(false);
		txtFTableNum.setBounds(113, 34, 96, 21);
		panel.add(txtFTableNum);
		txtFTableNum.setColumns(10);
		
		txtFAmount = new JTextField();
		txtFAmount.setText("1560");
		txtFAmount.setBackground(new Color(255, 255, 255));
		txtFAmount.setEnabled(false);
		txtFAmount.setEditable(false);
		txtFAmount.setBounds(136, 85, 96, 21);
		panel.add(txtFAmount);
		txtFAmount.setColumns(10);
		
		txtFServer = new JTextField();
		txtFServer.setText("Pig");
		txtFServer.setEnabled(false);
		txtFServer.setEditable(false);
		txtFServer.setColumns(10);
		txtFServer.setBackground(Color.WHITE);
		txtFServer.setBounds(101, 132, 96, 21);
		panel.add(txtFServer);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnBack.setBounds(331, 220, 85, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new UserInterface("Manager");
			}
		});
		panel.add(btnBack);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(0, 222, 85, 23);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableStatus();
			}
		});
		panel.add(btnPrevious);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(45, 185, 46, 15);
		panel.add(lblStatus);
		
		txtFStatus = new JTextField();
		txtFStatus.setText("Dirty");
		txtFStatus.setEnabled(false);
		txtFStatus.setEditable(false);
		txtFStatus.setColumns(10);
		txtFStatus.setBackground(Color.WHITE);
		txtFStatus.setBounds(90, 182, 96, 21);
		panel.add(txtFStatus);
		
		frame.setVisible(true);
	}

}
