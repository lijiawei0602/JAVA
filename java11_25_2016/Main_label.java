package java11_25_2016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main_label extends JFrame{
	public Main_label(){
		JPanel jPanel = new JPanel(new GridLayout(4, 1));
		JLabel jLabel1 = new JLabel("Department of Computer Science");
		JLabel jLabel2 = new JLabel("School of Computing");
		JLabel jLabel3 = new JLabel("Armstrong Atlantic State University");
		JLabel jLabel4 = new JLabel("TEL:(912)921-6440");
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		jLabel1.setBorder(border);
		jLabel2.setBorder(border);
		jLabel3.setBorder(border);
		jLabel4.setBorder(border);
		jPanel.add(jLabel1,BorderLayout.NORTH);
		jPanel.add(jLabel2,BorderLayout.NORTH);
		jPanel.add(jLabel3,BorderLayout.NORTH);
		jPanel.add(jLabel4,BorderLayout.NORTH);
		add(jPanel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new Main_label();
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setTitle("showLabel");
		jFrame.setSize(250, 150);
	}

}
