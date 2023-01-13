package UserInterface;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import addInterface.ServerAdd;
import censusInterface.View;
import censusInterface.ViewD;
import censusInterface.ViewH;

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
	private static JFrame User;

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
	
	public static void displayUser() {
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

	public void initializeAll() {
		initialize();
		new CheckStore();
		new LogOutAndExit();
		new FileManager();
		new TableStatus();
		new ServerAdd();
		new WorkTime();
		new View();
		new ViewH();
		new ViewD();
	}
	
	public UserInterface(String UserStatus) {
		initializeAll();
		if(UserStatus.equals("CannotWork")) cannotWorkVisit();
		else if(UserStatus.equals("Manager")) managerVisit();
		else if(UserStatus.equals("Server")) ServerVisit();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String layout = "javax.swing.plaf.nimbus.NimbusLookAndFeel" + "";
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
				LogOutAndExit.displayLogOutAndExit("UserInterface");
			}
		});
		User.getContentPane().setPreferredSize(new Dimension(User.MAXIMIZED_HORIZ, User.MAXIMIZED_VERT));
		User.getContentPane().setLayout(null);
		
		btnLogOut = new JButton("登出");
		//if(identify > )**********************************************************************************************
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				LogOutAndExit.displayLogOutAndExit("UserInterface");
			}
		});
		btnLogOut.setBounds(171, 194, 71, 23);
		User.getContentPane().add(btnLogOut);
		btnLogOut.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		btnWorkTime = new JButton("工作時長");
		btnWorkTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				WorkTime.displayWorkTime();
			}
		});
		btnWorkTime.setBounds(49, 24, 113, 23);
		User.getContentPane().add(btnWorkTime);
		
		btnCheckTable = new JButton("桌子狀態");
		btnCheckTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				TableStatus.displayTableStatus();
			}
		});
		btnCheckTable.setBounds(49, 86, 113, 23);
		User.getContentPane().add(btnCheckTable);
		
		btnSelectTable = new JButton("點餐");
		btnSelectTable.setBounds(49, 155, 113, 23);
		btnSelectTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				ServerAdd.displayServerAdd();
			}
		});
		User.getContentPane().add(btnSelectTable);
		
		btnCheckStore = new JButton("庫存追蹤");
		btnCheckStore.setBounds(249, 24, 113, 23);
		btnCheckStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				CheckStore.displayCheckStore();
			}
		});
		User.getContentPane().add(btnCheckStore);
		
		btnCensus = new JButton("統計分析");
		btnCensus.setBounds(247, 86, 115, 23);
		btnCensus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				View.displayView();
			}
		});
		User.getContentPane().add(btnCensus);
		
		btnManageFile = new JButton("管理員工檔案");
		btnManageFile.setBounds(249, 155, 113, 23);
		btnManageFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setVisible(false);
				FileManager.displayFileManager();
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
