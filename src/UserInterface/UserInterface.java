package UserInterface;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import addInterface.Tianjia;
import censusInterface.View;
import censusInterface.ViewD;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Window;
import javax.swing.JSplitPane;

public class UserInterface implements ActionListener{
	private JButton btnLogOut, btnWorkTime, btnCheckTable, btnSelectTable, btnCheckStore, btnCensus, btnManageFile;
	private JFrame User;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface("");
					window.User.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void VisitUserInterface() {
		User.setVisible(true);
	}
	
	public void cannotWorkVisit() {
		btnLogOut.setEnabled(true);
		btnWorkTime.setEnabled(true);
		btnCheckTable.setEnabled(false);
		btnSelectTable.setEnabled(false);
		btnCheckStore.setEnabled(false);
		btnCensus.setEnabled(false);
		btnManageFile.setEnabled(false);
	}
	
	public void managerVisit() {
		btnLogOut.setEnabled(true);
		btnWorkTime.setEnabled(true);
		btnCheckTable.setEnabled(true);
		btnSelectTable.setEnabled(true);
		btnCheckStore.setEnabled(true);
		btnCensus.setEnabled(true);
		btnManageFile.setEnabled(true);
	}
	
	public void ServerVisit() {
		btnLogOut.setEnabled(true);
		btnWorkTime.setEnabled(true);
		btnCheckTable.setEnabled(true);
		btnSelectTable.setEnabled(true);
		btnCheckStore.setEnabled(false);
		btnCensus.setEnabled(false);
		btnManageFile.setEnabled(false);
	}
	
	public UserInterface(String UserStatus) {
		initialize();
		if(UserStatus.equals("CannotWork")) cannotWorkVisit();
		else if(UserStatus.equals("Manager")) managerVisit();
		else if(UserStatus.equals("Server")) ServerVisit();
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
		
		User = new JFrame();
		User.getContentPane().setForeground(SystemColor.window);
		User.setBounds(100, 100, 450, 300);
		User.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				User.setVisible(false);
				new LogOutAndExit("UserInterface");
			}
		});
		User.getContentPane().setPreferredSize(new Dimension(User.MAXIMIZED_HORIZ, User.MAXIMIZED_VERT));
		User.getContentPane().setLayout(null);
		
		btnLogOut = new JButton("??????");
		//if(identify > )**********************************************************************************************
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogOutAndExit("UserInterface");
			}
		});
		btnLogOut.setBounds(171, 194, 71, 23);
		User.getContentPane().add(btnLogOut);
		btnLogOut.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		btnWorkTime = new JButton("????????????");
		btnWorkTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WorkTime();
			}
		});
		btnWorkTime.setBounds(49, 24, 113, 23);
		User.getContentPane().add(btnWorkTime);
		
		btnCheckTable = new JButton("????????????");
		btnCheckTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TableStatus();
			}
		});
		btnCheckTable.setBounds(49, 86, 113, 23);
		User.getContentPane().add(btnCheckTable);
		
		btnSelectTable = new JButton("??????");
		btnSelectTable.setBounds(49, 155, 113, 23);
		btnSelectTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				new Tianjia();
			}
		});
		User.getContentPane().add(btnSelectTable);
		
		btnCheckStore = new JButton("????????????");
		btnCheckStore.setBounds(249, 24, 113, 23);
		btnCheckStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				new CheckStore();
			}
		});
		User.getContentPane().add(btnCheckStore);
		
		btnCensus = new JButton("????????????");
		btnCensus.setBounds(247, 86, 115, 23);
		btnCensus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				new View();
			}
		});
		User.getContentPane().add(btnCensus);
		
		btnManageFile = new JButton("??????????????????");
		btnManageFile.setBounds(249, 155, 113, 23);
		btnManageFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				new FileManager();
			}
		});
		User.getContentPane().add(btnManageFile);
		User.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
