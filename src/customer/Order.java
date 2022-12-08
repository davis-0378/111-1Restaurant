package customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Order extends JFrame {

	private static final long serialVersionUID = 936763627297127436L;
	private JButton button1, button2, button3, button4, button5;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JTextField sashimi, sushi, salmon, shrimp;

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
		label6.setBounds(350, 330, 200, 25);
		this.add(label6);

		button5 = new JButton("重新點餐");
		button5.setBounds(350, 360, 100, 25);
		this.add(button5);
		label7 = new JLabel("0");
		this.add(label7);
		label7.setBounds(410, 330, 100, 25);

		// btn1
		icon = new ImageIcon("src/res/pexels-cup-of-couple-8472651.jpg");
		button1.setIcon(icon);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String total1 = label7.getText();
				int n = Integer.parseInt(total1);
				n += 100;
				String total2 = String.valueOf(n);
				label7.setText(total2);
				
				String num1 = sashimi.getText();
				int x =Integer.parseInt(num1);
				x += 1 ;
				String num2 = String.valueOf(x);
				sashimi.setText(num2);
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
				String total2 = String.valueOf(n);
				label7.setText(total2);
				
				String num1 = sushi.getText();
				int x =Integer.parseInt(num1);
				x += 1 ;
				String num2 = String.valueOf(x);
				sushi.setText(num2);
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
				String total2 = String.valueOf(n);
				label7.setText(total2);
				
				String num1 = salmon.getText();
				int x =Integer.parseInt(num1);
				x += 1 ;
				String num2 = String.valueOf(x);
				salmon.setText(num2);
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
				String total2 = String.valueOf(n);
				label7.setText(total2);
				
				String num1 = shrimp.getText();
				int x =Integer.parseInt(num1);
				x += 1 ;
				String num2 = String.valueOf(x);
				shrimp.setText(num2);
			}
		});

		// btn5
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sashimi.setText(String.valueOf(0));
				sushi.setText(String.valueOf(0));
				salmon.setText(String.valueOf(0));
				shrimp.setText(String.valueOf(0));
				label7.setText(String.valueOf(0));
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