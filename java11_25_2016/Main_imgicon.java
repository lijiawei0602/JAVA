package java11_25_2016;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main_imgicon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new GridLayout(2, 2));
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		JLabel label1 = new JLabel(new ImageIcon("E:/wamp/www/新建文件夹/picture/2.jpg"));
		JLabel label2 = new JLabel(new ImageIcon("E:/wamp/www/新建文件夹/picture/12.jpg"));
		JLabel label3 = new JLabel(new ImageIcon("E:/wamp/www/新建文件夹/picture/13.jpg"));
		JLabel label4 = new JLabel(new ImageIcon("E:/wamp/www/新建文件夹/picture/14.jpg"));
		label1.setBorder(border);
		label2.setBorder(border);
		label3.setBorder(border);
		label4.setBorder(border);
		jFrame.add(label1);
		jFrame.add(label2);
		jFrame.add(label3);
		jFrame.add(label4);
		jFrame.setVisible(true);
		jFrame.setSize(800, 600);
	}

}
