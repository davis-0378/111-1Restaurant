package customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Order extends JFrame {

	private static final long serialVersionUID = 936763627297127436L;
	private JButton button1, button2, button3, button4, button5, button6;
	private JLabel label1, label2, label3, label4, label5, label6;
	public static JLabel label7;
	public static JTextField sashimi, sushi, salmon, shrimp;

	public Order() {
		order();
	}

	private void order() {
		this.setTitle("顧客點餐");
		this.setLayout(null);
		this.setSize(500, 500);
		this.setResizable(false);

		ImageIcon icon = new ImageIcon();

		// top
		label5 = new JLabel("點擊圖片點餐");
		label5.setFont(label5.getFont().deriveFont(16f));
		label5.setBounds(30, 5, 200, 50);
		this.add(label5);

		// area1
		button1 = new JButton("Sashimi $100");
		button1.setBounds(30, 55, 135, 135);
		this.add(button1);

		label1 = new JLabel("$100 Sashimi");
		label1.setBounds(30, 200, 135, 20);
		this.add(label1);

		sashimi = new JTextField("0");
		sashimi.setHorizontalAlignment(JTextField.CENTER);
		sashimi.setBounds(130, 200, 35, 20);
		this.add(sashimi);

		// area2
		button2 = new JButton("Sushi $50");
		button2.setBounds(180, 55, 135, 135);
		this.add(button2);

		label2 = new JLabel("$50 Sushi");
		label2.setBounds(180, 200, 135, 20);
		this.add(label2);

		sushi = new JTextField("0");
		sushi.setHorizontalAlignment(JTextField.CENTER);
		sushi.setBounds(280, 200, 35, 20);
		this.add(sushi);

		// area3
		button3 = new JButton("Salmon $200");
		button3.setBounds(30, 250, 135, 135);
		this.add(button3);

		label3 = new JLabel("$200 Salmon");
		label3.setBounds(30, 395, 135, 20);
		this.add(label3);

		salmon = new JTextField("0");
		salmon.setHorizontalAlignment(JTextField.CENTER);
		salmon.setBounds(130, 395, 35, 20);
		this.add(salmon);

		// area4
		button4 = new JButton("Shrimp $100");
		button4.setBounds(180, 250, 135, 135);
		this.add(button4);

		label4 = new JLabel("$100 Shrimp");
		label4.setBounds(180, 395, 135, 20);
		this.add(label4);

		shrimp = new JTextField("0");
		shrimp.setHorizontalAlignment(JTextField.CENTER);
		shrimp.setBounds(280, 395, 35, 20);
		this.add(shrimp);

		// right
		label6 = new JLabel("總金額：");
		label6.setFont(label6.getFont().deriveFont(16f));
		label6.setBounds(350, 50, 200, 25);
		this.add(label6);

		label7 = new JLabel("0");
		label7.setFont(label7.getFont().deriveFont(16f));
		label7.setBounds(415, 50, 100, 25);
		this.add(label7);

		button5 = new JButton("重新點餐");
		button5.setBounds(350, 140, 100, 100);
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.PINK);
		this.add(button5);

		button6 = new JButton("送出訂單");
		button6.setBounds(350, 290, 100, 100);
		this.add(button6);

		// btn1
		icon = new ImageIcon("src/res/pexels-cup-of-couple-8472651.jpg");
		button1.setIcon(icon);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String total1 = label7.getText();
				int n = Integer.parseInt(total1);
				n += 100;
				label7.setText(String.valueOf(n));

				String num1 = sashimi.getText();
				int x = Integer.parseInt(num1);
				x += 1;
				sashimi.setText(String.valueOf(x));
			}
		});

		// btn2
		icon = new ImageIcon("src/res/pexels-luiz-fernando-maciel-7717517.jpg");
		button2.setIcon(icon);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String total1 = label7.getText();
				int n = Integer.parseInt(total1);
				n += 50;
				label7.setText(String.valueOf(n));

				String num1 = sushi.getText();
				int x = Integer.parseInt(num1);
				x += 1;
				sushi.setText(String.valueOf(x));
			}

		});

		// btn3
		icon = new ImageIcon("src/res/pexels-horizon-content-3763644.jpg");
		button3.setIcon(icon);

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String total1 = label7.getText();
				int n = Integer.parseInt(total1);
				n += 200;
				label7.setText(String.valueOf(n));

				String num1 = salmon.getText();
				int x = Integer.parseInt(num1);
				x += 1;
				salmon.setText(String.valueOf(x));
			}

		});

		// btn4
		icon = new ImageIcon("src/res/pexels-cottonbro-studio-3295854.jpg");
		button4.setIcon(icon);

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String total1 = label7.getText();
				int n = Integer.parseInt(total1);
				n += 100;
				label7.setText(String.valueOf(n));

				String num1 = shrimp.getText();
				int x = Integer.parseInt(num1);
				x += 1;
				shrimp.setText(String.valueOf(x));
			}
		});

		// btn5
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sashimi.setText("0");
				sushi.setText("0");
				salmon.setText("0");
				shrimp.setText("0");
				label7.setText("0");
			}
		});

		// btn6
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label7.getText() == "0") {
					JOptionPane.showMessageDialog(null, "尚未點餐！", "Oops!", JOptionPane.ERROR_MESSAGE);
				} else {
					int result = JOptionPane.showConfirmDialog(null, "確認送出訂單？", "Confirm", JOptionPane.YES_NO_OPTION);
					if (result == 0) {
						dispose();
						new Output();
					} else if (result == 1) {
					}
				}
			}
		});

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/*
 * btn1 攝影師：Cup of Couple: https://www.pexels.com/zh-tw/photo/8472651/ btn2
 * 攝影師：Luiz Fernando Maciel: https://www.pexels.com/zh-tw/photo/7717517/ btn3
 * 攝影師：Horizon Content: https://www.pexels.com/zh-tw/photo/3763644/ btn4
 * 攝影師：cottonbro studio: https://www.pexels.com/zh-tw/photo/3295855/
 */