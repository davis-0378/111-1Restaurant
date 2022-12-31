package AddInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class Tianjia1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tianjia1 window = new Tianjia1();
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
	public Tianjia1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(420, 100, 450, 300);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("加點 :");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel.setBounds(34, 34, 61, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("飯 :");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(171, 103, 46, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("份");
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(285, 103, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("麵 :");
		lblNewLabel_1_2.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(171, 173, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("份");
		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(285, 173, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("湯 :");
		lblNewLabel_1_3.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(171, 243, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("份");
		lblNewLabel_1_1_2.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_1_2.setBounds(285, 243, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("點心 :");
		lblNewLabel_1_4.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_4.setBounds(149, 313, 68, 30);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("份");
		lblNewLabel_1_1_3.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		lblNewLabel_1_1_3.setBounds(285, 313, 46, 30);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JButton btnNewButton = new JButton("確認");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		btnNewButton.setBounds(387, 417, 73, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		btnNewButton_1.setBounds(34, 417, 73, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		textField.setBounds(210, 110, 73, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(210, 180, 73, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(210, 250, 73, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(210, 320, 73, 21);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("第");
		lblNewLabel_1_1_4.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1_1_4.setBounds(86, 34, 22, 30);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("桌");
		lblNewLabel_1_1_5.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblNewLabel_1_1_5.setBounds(152, 34, 22, 30);
		frame.getContentPane().add(lblNewLabel_1_1_5);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setBounds(106, 42, 46, 18);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
