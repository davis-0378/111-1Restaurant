package customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Order extends JFrame {

	private JButton button1, button2, button3, button4;
	private JLabel label1, label2;

	public Order() {
		order();
	}

	private void order() {
		this.setTitle("顧客點餐");
		this.setLayout(null);
		this.setResizable(false);
		this.setSize(500, 500);
		ImageIcon icon = new ImageIcon();
		
		//left
		button1 = new JButton("Sashimi $100");
		button1.setBounds(30, 100, 135, 135);
		this.add(button1);
		button2 = new JButton("Sushi $20");
		button2.setBounds(180, 100, 135, 135);
		this.add(button2);
		button3 = new JButton("Salmon $90");
		button3.setBounds(30, 250, 135, 135);
		this.add(button3);
		button4 = new JButton("Shrimp $50");
		button4.setBounds(180, 250, 135, 135);
		this.add(button4);

		// right
		label1 = new JLabel("<-點擊圖片點餐");
		label1.setBounds(350, 100, 200, 50);
		this.add(label1);
		
		final List list = new List();
		list.setBounds(350, 150, 100, 180);
		this.add(list);

		label2 = new JLabel("總金額：0元");
		label2.setBounds(350, 330, 200, 50);
		this.add(label2);

		// btn1
		icon = new ImageIcon("src/res/pexels-cup-of-couple-8472651.jpg");
		button1.setIcon(icon);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] items = list.getItems();
				boolean flag = false;
				int index = 0;
				for (int i = 0; i < items.length; i++) {
					if (items[i].contains("Sashimi")) {
						index = i;
						flag = true;
						break;
					}
				}
				if (flag) {
					String item = list.getItem(index);
					int x_index = item.indexOf("*");
					String value = item.substring(x_index + 1);
					item = item.substring(0, x_index + 1) + (Integer.parseInt(value) + 1);
					list.remove(index);
					list.add(item, index);
				} else {
					list.add("Sashimi *1");
				}
				String value = label2.getText();
				int begin = value.indexOf("：");
				int end = value.indexOf("元");
				String money = value.substring(begin + 1, end);
				String newValue = String.valueOf((Integer.parseInt(money) + 100));
				value = value.replaceAll(money, newValue);
				label2.setText(value);
			}
		});

		// btn2
		icon = new ImageIcon("src/res/pexels-luiz-fernando-maciel-7717517.jpg");
		button2.setIcon(icon);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] items = list.getItems();
				boolean flag = false;
				int index = 0;
				for (int i = 0; i < items.length; i++) {
					if (items[i].contains("Sushi")) {
						index = i;
						flag = true;
						break;
					}
				}
				if (flag) {
					String item = list.getItem(index);
					int x_index = item.indexOf("*");
					String value = item.substring(x_index + 1);
					item = item.substring(0, x_index + 1) + (Integer.parseInt(value) + 1);
					list.remove(index);
					list.add(item, index);
				} else {
					list.add("Sushi *1");
				}
				String value = label2.getText();
				int begin = value.indexOf("：");
				int end = value.indexOf("元");
				String money = value.substring(begin + 1, end);
				String newValue = String.valueOf((Integer.parseInt(money) + 20));
				value = value.replaceAll(money, newValue);
				label2.setText(value);
			}

		});

		// btn3
		icon = new ImageIcon("src/res/pexels-horizon-content-3763644.jpg");
		button3.setIcon(icon);

		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] items = list.getItems();
				boolean flag = false;
				int index = 0;
				for (int i = 0; i < items.length; i++) {
					if (items[i].contains("Salmon")) {
						index = i;
						flag = true;
						break;
					}
				}
				if (flag) {
					String item = list.getItem(index);
					int x_index = item.indexOf("*");
					String value = item.substring(x_index + 1);
					item = item.substring(0, x_index + 1) + (Integer.parseInt(value) + 1);
					list.remove(index);
					list.add(item, index);
				} else {
					list.add("Salmon *1");
				}
				String value = label2.getText();
				int begin = value.indexOf("：");
				int end = value.indexOf("元");
				String money = value.substring(begin + 1, end);
				String newValue = String.valueOf((Integer.parseInt(money) + 90));
				value = value.replaceAll(money, newValue);
				label2.setText(value);
			}

		});

		// btn4
		icon = new ImageIcon("src/res/pexels-cottonbro-studio-3295854.jpg");
		button4.setIcon(icon);

		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] items = list.getItems();
				boolean flag = false;
				int index = 0;
				for (int i = 0; i < items.length; i++) {
					if (items[i].contains("Shrimp")) {
						index = i;
						flag = true;
						break;
					}
				}
				if (flag) {
					String item = list.getItem(index);
					int x_index = item.indexOf("*");
					String value = item.substring(x_index + 1);
					item = item.substring(0, x_index + 1) + (Integer.parseInt(value) + 1);
					list.remove(index);
					list.add(item, index);
				} else {
					list.add("Shrimp *1");
				}
				String value = label2.getText();
				int begin = value.indexOf("：");
				int end = value.indexOf("元");
				String money = value.substring(begin + 1, end);
				String newValue = String.valueOf((Integer.parseInt(money) + 50));
				value = value.replaceAll(money, newValue);
				label2.setText(value);
			}
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/*
 * btn1
 * 攝影師：Cup of Couple: https://www.pexels.com/zh-tw/photo/8472651/
 * btn2
 * 攝影師：Luiz Fernando Maciel: https://www.pexels.com/zh-tw/photo/7717517/
 * btn3
 * 攝影師：Horizon Content: https://www.pexels.com/zh-tw/photo/3763644/
 * btn4
 * 攝影師：cottonbro studio: https://www.pexels.com/zh-tw/photo/3295855/
 */