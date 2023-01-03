package UserInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.UIManager;

import addInterface.Tianjia;
import censusInterface.View;
import censusInterface.ViewD;
import censusInterface.ViewH;
import javax.swing.JFormattedTextField;

public class LogOutAndExit {

	private JFrame frame;
	private JButton btnCancel;
	private static String lastInterface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LogOutAndExit(lastInterface);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogOutAndExit(String lastInterface) {
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
		
		JButton btnYes = new JButton("Leave");
		btnYes.setBackground(new Color(255, 0, 0));
		btnYes.setFont(new Font("Arial", Font.PLAIN, 16));
		btnYes.setForeground(new Color(0, 0, 0));
		btnYes.setBounds(78, 181, 85, 23);
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnYes);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCancel.setBackground(UIManager.getColor("Button.background"));
		btnCancel.setBounds(258, 181, 85, 23);

		frame.getContentPane().add(btnCancel);
		
		JFormattedTextField frmtdtxtfldClickLeaveTo = new JFormattedTextField();
		frmtdtxtfldClickLeaveTo.setSelectedTextColor(UIManager.getColor("Button.background"));
		frmtdtxtfldClickLeaveTo.setSelectionColor(UIManager.getColor("Button.background"));
		frmtdtxtfldClickLeaveTo.setFont(new Font("Monospaced", Font.PLAIN, 12));
		frmtdtxtfldClickLeaveTo.setBorder(null);
		frmtdtxtfldClickLeaveTo.setBackground(UIManager.getColor("Button.background"));
		frmtdtxtfldClickLeaveTo.setText("           Click Leave to Log out and leave system.");
		frmtdtxtfldClickLeaveTo.setBounds(0, 93, 436, 37);
		frame.getContentPane().add(frmtdtxtfldClickLeaveTo);
		
		frame.setVisible(true);
	}
}
