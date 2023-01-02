package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;

public class FileManager {

	private JFrame frame;
	private JTextField txtFUsername;
	private JTextField txtFJob;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileManager window = new FileManager();
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
	public FileManager() {
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
		
		JToggleButton tglbtnContrictServer = new JToggleButton("限制活動");
		tglbtnContrictServer.setBounds(346, 7, 85, 23);
		frame.getContentPane().add(tglbtnContrictServer);
		
		JButton btnNewButton = new JButton("修改檔案");
		btnNewButton.setBounds(255, 7, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 5, 145, 23);
		frame.getContentPane().add(menuBar);
		
		JMenu menuSelectAnEmployer = new JMenu("Select An Employer");
		menuBar.add(menuSelectAnEmployer);
		menuSelectAnEmployer.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		JFormattedTextField frmtdtxtfldDoris = new JFormattedTextField();
		menuSelectAnEmployer.add(frmtdtxtfldDoris);
		frmtdtxtfldDoris.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frmtdtxtfldDoris.setText("James");
		
		JFormattedTextField frmtdtxtfldDavis = new JFormattedTextField();
		menuSelectAnEmployer.add(frmtdtxtfldDavis);
		frmtdtxtfldDavis.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frmtdtxtfldDavis.setText("Davis");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(1, 53, 435, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtFUsername = new JTextField();
		txtFUsername.setBounds(87, 12, 106, 20);
		panel.add(txtFUsername);
		txtFUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFUsername.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBackground(new Color(192, 192, 192));
		txtrUsername.setText("UserName:\r\n");
		txtrUsername.setBounds(10, 10, 96, 22);
		panel.add(txtrUsername);
		
		JTextArea txtrJob = new JTextArea();
		txtrJob.setBackground(new Color(192, 192, 192));
		txtrJob.setText("job:");
		txtrJob.setBounds(10, 42, 79, 22);
		panel.add(txtrJob);
		
		txtFJob = new JTextField();
		txtFJob.setBounds(87, 45, 106, 21);
		panel.add(txtFJob);
		txtFJob.setColumns(10);
		
		JTextArea txtrAge = new JTextArea();
		txtrAge.setBackground(new Color(192, 192, 192));
		txtrAge.setText("age:");
		txtrAge.setBounds(10, 84, 66, 22);
		panel.add(txtrAge);
		
		textField = new JTextField();
		textField.setBounds(87, 87, 106, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("新增員工");
		btnNewButton_1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnNewButton_1.setBounds(160, 7, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
