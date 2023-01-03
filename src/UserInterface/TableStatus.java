package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TableStatus {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableStatus window = new TableStatus();
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
	public TableStatus() {
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
				frame.setVisible(false);
				new LogOutAndExit("TableStatus");
			}
		});
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 243);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTable1 = new JLabel("Table1:");
		lblTable1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTable1.setBounds(27, 25, 58, 15);
		panel.add(lblTable1);
		
		JRadioButton rdbtnTable1 = new JRadioButton("Dirty");
		rdbtnTable1.setEnabled(false);
		rdbtnTable1.setBounds(85, 23, 58, 23);
		panel.add(rdbtnTable1);
		
		JButton SelectbtnTable1 = new JButton("Select");
		SelectbtnTable1.setBounds(153, 23, 85, 23);
		SelectbtnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectbtnTable1.setEnabled(false);
			}
		});
		panel.add(SelectbtnTable1);
		
		JLabel lblTable2 = new JLabel("Table2:");
		lblTable2.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTable2.setBounds(27, 64, 58, 15);
		panel.add(lblTable2);
		
		JRadioButton rdbtnTable2 = new JRadioButton("Dirty");
		rdbtnTable2.setEnabled(false);
		rdbtnTable2.setBounds(85, 62, 58, 23);
		panel.add(rdbtnTable2);
		
		JButton SelectbtnTable2 = new JButton("Select");
		SelectbtnTable2.setBounds(153, 62, 85, 23);
		SelectbtnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectbtnTable2.setEnabled(false);
			}
		});
		panel.add(SelectbtnTable2);
		
		JLabel lblTable3 = new JLabel("Table3:");
		lblTable3.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTable3.setBounds(27, 103, 58, 15);
		panel.add(lblTable3);
		
		JRadioButton rdbtnTable3 = new JRadioButton("Dirty");
		rdbtnTable3.setSelected(true);
		rdbtnTable3.setEnabled(false);
		rdbtnTable3.setBounds(85, 101, 58, 23);
		panel.add(rdbtnTable3);
		
		JButton SelectbtnTable3 = new JButton("Select");
		SelectbtnTable3.setBounds(153, 101, 85, 23);
		SelectbtnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectbtnTable3.setEnabled(false);
			}
		});
		panel.add(SelectbtnTable3);
		
		JLabel lblTable4 = new JLabel("Table4:");
		lblTable4.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTable4.setBounds(27, 149, 58, 15);
		panel.add(lblTable4);
		
		JRadioButton rdbtnTable4 = new JRadioButton("Dirty");
		rdbtnTable4.setEnabled(false);
		rdbtnTable4.setBounds(85, 147, 58, 23);
		panel.add(rdbtnTable4);
		
		JButton SelectbtnTable4 = new JButton("Select");
		SelectbtnTable4.setBounds(153, 147, 85, 23);
		SelectbtnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectbtnTable4.setEnabled(false);
			}
		});
		panel.add(SelectbtnTable4);
		
		JLabel lblTable5 = new JLabel("Table5:");
		lblTable5.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblTable5.setBounds(27, 191, 58, 15);
		panel.add(lblTable5);
		
		JRadioButton rdbtnTable5 = new JRadioButton("Dirty");
		rdbtnTable5.setEnabled(false);
		rdbtnTable5.setBounds(85, 189, 58, 23);
		panel.add(rdbtnTable5);
		
		JButton SelectbtnTable5 = new JButton("Select");
		SelectbtnTable5.setBounds(153, 189, 85, 23);
		SelectbtnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectbtnTable5.setEnabled(false);
			}
		});
		panel.add(SelectbtnTable5);
		
		JButton DetailbtnTable1 = new JButton("Detail....");
		DetailbtnTable1.setBounds(281, 23, 85, 23);
		DetailbtnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableDetail();
			}
		});
		panel.add(DetailbtnTable1);
		
		JButton DetailbtnTable2 = new JButton("Detail....");
		DetailbtnTable2.setBounds(281, 62, 85, 23);
		DetailbtnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableDetail();
			}
		});
		panel.add(DetailbtnTable2);
		
		JButton DetailbtnTable3 = new JButton("Detail....");
		DetailbtnTable3.setBounds(281, 101, 85, 23);
		DetailbtnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableDetail();
			}
		});
		panel.add(DetailbtnTable3);
		
		JButton DetailbtnTable4 = new JButton("Detail....");
		DetailbtnTable4.setBounds(281, 147, 85, 23);
		DetailbtnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableDetail();
			}
		});
		panel.add(DetailbtnTable4);
		
		JButton DetailbtnTable5 = new JButton("Detail....");
		DetailbtnTable5.setBounds(281, 189, 85, 23);
		DetailbtnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new TableDetail();
			}
		});
		panel.add(DetailbtnTable5);
		
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
		
		frame.setVisible(true);
	}
}
