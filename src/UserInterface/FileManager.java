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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

public class FileManager {

	private static JFrame frame;
	private JTextField txtFUsername;
	private JTextField txtFJob;
	private JTextField txtFAge;

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
	
	public static void displayFileManager() {
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public FileManager() {
		initialize();
		new managerEnterPassword();
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
				super.windowClosing(e);
				LogOutAndExit.displayLogOutAndExit("FileManager");
			}
		});
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnContrictServer = new JToggleButton("限制活動");
		tglbtnContrictServer.setBounds(346, 7, 85, 23);
		tglbtnContrictServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserInterface("CannotWork");
			}
		});
		frame.getContentPane().add(tglbtnContrictServer);
		
		JButton btnNewButton = new JButton("修改檔案");
		btnNewButton.setBounds(255, 7, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 5, 145, 23);
		frame.getContentPane().add(menuBar);
		
		JMenu menuSelectAnEmployer = new JMenu("Select An Employee");
		menuSelectAnEmployer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(menuSelectAnEmployer);
		menuSelectAnEmployer.setFont(new Font("Monospaced", Font.PLAIN, 12));
		
		JFormattedTextField frmtdtxtfldDoris = new JFormattedTextField();
		frmtdtxtfldDoris.setEditable(false);
		frmtdtxtfldDoris.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuSelectAnEmployer.add(frmtdtxtfldDoris);
		frmtdtxtfldDoris.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frmtdtxtfldDoris.setText("James");
		
		JFormattedTextField frmtdtxtfldDavis = new JFormattedTextField();
		frmtdtxtfldDavis.setEditable(false);
		frmtdtxtfldDavis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuSelectAnEmployer.add(frmtdtxtfldDavis);
		frmtdtxtfldDavis.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frmtdtxtfldDavis.setText("Davis");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(1, 53, 435, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtFUsername = new JTextField();
		txtFUsername.setEditable(false);
		txtFUsername.setBounds(87, 12, 106, 20);
		panel.add(txtFUsername);
		txtFUsername.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtFUsername.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setBackground(new Color(192, 192, 192));
		txtrUsername.setText("UserName:\r\n");
		txtrUsername.setBounds(10, 10, 79, 22);
		panel.add(txtrUsername);
		
		JTextArea txtrJob = new JTextArea();
		txtrJob.setBackground(new Color(192, 192, 192));
		txtrJob.setText("job:");
		txtrJob.setBounds(10, 42, 79, 22);
		panel.add(txtrJob);
		
		txtFJob = new JTextField();
		txtFJob.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtFJob.setEditable(false);
		txtFJob.setBounds(87, 45, 106, 21);
		panel.add(txtFJob);
		txtFJob.setColumns(10);
		
		JTextArea txtrAge = new JTextArea();
		txtrAge.setBackground(new Color(192, 192, 192));
		txtrAge.setText("age:");
		txtrAge.setBounds(10, 84, 66, 22);
		panel.add(txtrAge);
		
		txtFAge = new JTextField();
		txtFAge.setEditable(false);
		txtFAge.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtFAge.setBounds(87, 87, 106, 21);
		panel.add(txtFAge);
		txtFAge.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnDone.setBounds(39, 118, 85, 23);
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				managerEnterPassword.displayEnterPassword();
			}
		});
		panel.add(btnDone);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnBack.setBounds(350, 188, 85, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserInterface.displayUser();
			}
		});
		panel.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("新增員工");
		btnNewButton_1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnNewButton_1.setBounds(160, 7, 85, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(false);
	}
	@SuppressWarnings("unused")
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
