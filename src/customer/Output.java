package customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Output extends JFrame {

	private static final long serialVersionUID = -8333802913155944189L;
	private JPanel jpanel1;
	private JLabel label8;

	public Output() {
		this.setTitle("訂單狀態");
		this.setLayout(new BorderLayout());
		this.setSize(500, 500);
		this.setResizable(false);

		jpanel1 = new JPanel();
		jpanel1.setPreferredSize(new Dimension(166, 0));
		this.add(jpanel1, BorderLayout.WEST);
		label8 = new JLabel("訂單已送出，請稍待服務生...");
		this.add(label8, BorderLayout.CENTER);

		try {
			FileWriter file = new FileWriter("src/res/order.txt");
			BufferedWriter bw = new BufferedWriter(file);
			bw.write("======餐點清單======");
			bw.newLine();
			bw.write("Sashimi $100：" + customer.Order.sashimi.getText() + " 個");
			bw.newLine();
			bw.write("Sushi $50：" + customer.Order.sushi.getText() + " 個");
			bw.newLine();
			bw.write("Salmon $200：" + customer.Order.salmon.getText() + " 個");
			bw.newLine();
			bw.write("Shrimp $100：" + customer.Order.shrimp.getText() + " 個");
			bw.newLine();
			bw.write("總金額：" + customer.Order.label7.getText() + " 元");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
