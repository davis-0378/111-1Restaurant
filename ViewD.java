package AddInterface;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ViewD {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewD window = new ViewD();
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
	public ViewD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(330, 6, 450, 300);
		frame.setSize(700, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("日期");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 10, 31, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		comboBox.setBounds(20, 38, 43, 23);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("日");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(67, 38, 14, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("菜單收入百分比");
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_4.setBounds(78, 373, 112, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("菜單受歡迎度");
		lblNewLabel_5.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_5.setBounds(391, 51, 96, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("平均周轉時間 :");
		lblNewLabel_6.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_6.setBounds(428, 296, 104, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("平均準備時間 :");
		lblNewLabel_6_1.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(428, 336, 104, 23);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("分");
		lblNewLabel_7.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(601, 296, 16, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("分");
		lblNewLabel_7_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(601, 336, 16, 23);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("人員效率");
		lblNewLabel_5_1.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(391, 386, 72, 23);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("飯 :");
		lblNewLabel_3_4.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4.setBounds(155, 123, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("湯 :");
		lblNewLabel_3_2_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(155, 240, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("麵 :");
		lblNewLabel_3_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(155, 181, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("點心 :");
		lblNewLabel_3_3_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_3_1.setBounds(139, 296, 40, 23);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1.setText("   14250");
		textArea_1.setBounds(183, 127, 60, 21);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_1.setText("   12560");
		textArea_1_1.setBounds(183, 184, 60, 21);
		frame.getContentPane().add(textArea_1_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_2.setText("    8490");
		textArea_2.setBounds(183, 241, 60, 21);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_3.setText("   10170");
		textArea_3.setBounds(183, 298, 60, 21);
		frame.getContentPane().add(textArea_3);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("元");
		lblNewLabel_8_2_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_8_2_1.setBounds(247, 240, 16, 23);
		frame.getContentPane().add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("元");
		lblNewLabel_8_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_8_1_1.setBounds(247, 181, 16, 23);
		frame.getContentPane().add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_4 = new JLabel("元");
		lblNewLabel_8_4.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_8_4.setBounds(247, 123, 16, 23);
		frame.getContentPane().add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_3_1 = new JLabel("元");
		lblNewLabel_8_3_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_8_3_1.setBounds(247, 296, 16, 23);
		frame.getContentPane().add(lblNewLabel_8_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("菜單收入");
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(94, 75, 64, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("飯 :");
		lblNewLabel_3_4_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1.setBounds(143, 429, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("湯 :");
		lblNewLabel_3_2_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1.setBounds(143, 546, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("麵 :");
		lblNewLabel_3_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1.setBounds(143, 487, 24, 23);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("點心 :");
		lblNewLabel_3_3_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_3_1_1.setBounds(127, 602, 40, 23);
		frame.getContentPane().add(lblNewLabel_3_3_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setText("    31.34%");
		textArea_1_2.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2.setBounds(171, 431, 72, 21);
		frame.getContentPane().add(textArea_1_2);
		
		JTextArea textArea_1_1_2 = new JTextArea();
		textArea_1_1_2.setText("    32.1");
		textArea_1_1_2.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_1_2.setBounds(537, 298, 60, 21);
		frame.getContentPane().add(textArea_1_1_2);
		
		JTextArea textArea_1_1_2_1 = new JTextArea();
		textArea_1_1_2_1.setText("     5.8");
		textArea_1_1_2_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_1_2_1.setBounds(537, 338, 60, 21);
		frame.getContentPane().add(textArea_1_1_2_1);
		
		JTextArea textArea_1_2_1 = new JTextArea();
		textArea_1_2_1.setText("    27.62%");
		textArea_1_2_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_1.setBounds(171, 489, 72, 21);
		frame.getContentPane().add(textArea_1_2_1);
		
		JTextArea textArea_1_2_2 = new JTextArea();
		textArea_1_2_2.setText("    18.67%");
		textArea_1_2_2.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_2.setBounds(171, 548, 72, 21);
		frame.getContentPane().add(textArea_1_2_2);
		
		JTextArea textArea_1_2_3 = new JTextArea();
		textArea_1_2_3.setText("    22.37%");
		textArea_1_2_3.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_3.setBounds(171, 604, 72, 21);
		frame.getContentPane().add(textArea_1_2_3);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("一位 :");
		lblNewLabel_3_4_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1.setBounds(441, 100, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1);
		
		JTextArea textArea_1_2_4 = new JTextArea();
		textArea_1_2_4.setText("    點心");
		textArea_1_2_4.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_4.setBounds(488, 102, 72, 21);
		frame.getContentPane().add(textArea_1_2_4);
		
		JLabel lblNewLabel_3_4_1_1_1 = new JLabel("二位 :");
		lblNewLabel_3_4_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_1.setBounds(441, 148, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_1);
		
		JTextArea textArea_1_2_4_1 = new JTextArea();
		textArea_1_2_4_1.setText("      飯");
		textArea_1_2_4_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_4_1.setBounds(488, 150, 72, 21);
		frame.getContentPane().add(textArea_1_2_4_1);
		
		JLabel lblNewLabel_3_4_1_1_2 = new JLabel("三位 :");
		lblNewLabel_3_4_1_1_2.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_2.setBounds(441, 196, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_2);
		
		JTextArea textArea_1_2_4_2 = new JTextArea();
		textArea_1_2_4_2.setText("      湯");
		textArea_1_2_4_2.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_4_2.setBounds(488, 198, 72, 21);
		frame.getContentPane().add(textArea_1_2_4_2);
		
		JLabel lblNewLabel_3_4_1_1_3 = new JLabel("四位 :");
		lblNewLabel_3_4_1_1_3.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_3.setBounds(441, 244, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_3);
		
		JTextArea textArea_1_2_4_3 = new JTextArea();
		textArea_1_2_4_3.setText("      麵");
		textArea_1_2_4_3.setFont(new Font("新細明體", Font.PLAIN, 17));
		textArea_1_2_4_3.setBounds(488, 246, 72, 21);
		frame.getContentPane().add(textArea_1_2_4_3);
		
		JLabel lblNewLabel_3_4_1_1_4 = new JLabel("一位 :");
		lblNewLabel_3_4_1_1_4.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_4.setBounds(441, 433, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_4);
		
		JTextArea txtrD = new JTextArea();
		txtrD.setText("       D");
		txtrD.setFont(new Font("新細明體", Font.PLAIN, 17));
		txtrD.setBounds(488, 435, 72, 21);
		frame.getContentPane().add(txtrD);
		
		JLabel lblNewLabel_3_4_1_1_1_1 = new JLabel("二位 :");
		lblNewLabel_3_4_1_1_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_1_1.setBounds(441, 485, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_1_1);
		
		JTextArea txtrC = new JTextArea();
		txtrC.setText("       C");
		txtrC.setFont(new Font("新細明體", Font.PLAIN, 17));
		txtrC.setBounds(488, 487, 72, 21);
		frame.getContentPane().add(txtrC);
		
		JLabel lblNewLabel_3_4_1_1_2_1 = new JLabel("三位 :");
		lblNewLabel_3_4_1_1_2_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_2_1.setBounds(441, 537, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_2_1);
		
		JTextArea txtrA = new JTextArea();
		txtrA.setText("       A");
		txtrA.setFont(new Font("新細明體", Font.PLAIN, 17));
		txtrA.setBounds(488, 539, 72, 21);
		frame.getContentPane().add(txtrA);
		
		JLabel lblNewLabel_3_4_1_1_3_1 = new JLabel("四位 :");
		lblNewLabel_3_4_1_1_3_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel_3_4_1_1_3_1.setBounds(441, 589, 43, 23);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_3_1);
		
		JTextArea txtrA_1 = new JTextArea();
		txtrA_1.setText("       B");
		txtrA_1.setFont(new Font("新細明體", Font.PLAIN, 17));
		txtrA_1.setBounds(488, 591, 72, 21);
		frame.getContentPane().add(txtrA_1);
		
		JButton btnNewButton = new JButton("回前頁");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 15));
		btnNewButton.setBounds(591, 648, 83, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
