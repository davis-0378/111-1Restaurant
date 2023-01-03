package UserInterface;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;

public class WorkTime {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkTime window = new WorkTime();
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
	public WorkTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
				new LogOutAndExit("WorkTime");
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 26, 391, 216);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWordFirst = new JLabel("Your already work");
		lblWordFirst.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblWordFirst.setBounds(137, 75, 122, 15);
		panel.add(lblWordFirst);
		
		JFormattedTextField ftfHour = new JFormattedTextField();
		ftfHour.setText("22");
		ftfHour.setBorder(null);
		ftfHour.setBackground(UIManager.getColor("Button.background"));
		ftfHour.setEditable(false);
		ftfHour.setBounds(62, 104, 44, 27);
		panel.add(ftfHour);
		
		JLabel lblHour = new JLabel("h  :");
		lblHour.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblHour.setBounds(116, 108, 29, 15);
		panel.add(lblHour);
		
		JLabel lblMin = new JLabel("min  :");
		lblMin.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblMin.setBounds(201, 108, 58, 15);
		panel.add(lblMin);
		
		JFormattedTextField ftfMin = new JFormattedTextField();
		ftfMin.setText("15");
		ftfMin.setEditable(false);
		ftfMin.setBorder(null);
		ftfMin.setBackground(SystemColor.menu);
		ftfMin.setBounds(147, 104, 44, 27);
		panel.add(ftfMin);
		
		JFormattedTextField ftfSec = new JFormattedTextField();
		ftfSec.setText("20");
		ftfSec.setEditable(false);
		ftfSec.setBorder(null);
		ftfSec.setBackground(SystemColor.menu);
		ftfSec.setBounds(244, 104, 44, 27);
		panel.add(ftfSec);
		
		JLabel lblSec = new JLabel("sec");
		lblSec.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblSec.setBounds(298, 108, 58, 15);
		panel.add(lblSec);
		
		JButton btnExport = new JButton("Export Record");
		btnExport.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnExport.setBounds(124, 170, 144, 23);
		panel.add(btnExport);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnBack.setBounds(306, 193, 85, 23);
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
