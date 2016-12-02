package java11_25_2016;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main_JButton extends JFrame {
	public Main_JButton(){
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		JButton button6 = new JButton("Button6");
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel1.add(button6);
		add(panel1);
		add(panel2);
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new Main_JButton();
		frame.setTitle("showButton");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
