package java11_18_2016;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main_calculate extends JFrame{
	private static final Object FlowLayout = null;
	private JButton jbtadd = new JButton("Add");
	private JButton jbtsub = new JButton("Sub");
	private JButton jbtmultiply  = new JButton("multiply");
	private JButton jbtdivide = new JButton("divide");
	private JLabel label1 = new JLabel("Number1");
	private JLabel label2 = new JLabel("Number2");
	private JLabel label3 = new JLabel("Result");
	private JTextField text1 = new JTextField(10);
	private JTextField text2 = new JTextField(10);
	private JTextField text3 = new JTextField(10);
	
	public Main_calculate(){
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		panel.add(jbtadd);
		panel.add(jbtsub);
		panel.add(jbtmultiply);
		panel.add(jbtdivide);
		
		this.add(panel , FlowLayout);
		
		operationListener listener = new operationListener();
		jbtadd.addActionListener(listener);
		jbtsub.addActionListener(listener);
		jbtmultiply.addActionListener(listener);
		jbtdivide.addActionListener(listener);
	}
	
	class operationListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtadd){
				text3.setText(Double.parseDouble(text1.getText()) + Double.parseDouble(text2.getText()) +"");
			}
			else if (e.getSource() == jbtsub) {
				text3.setText(Double.parseDouble(text1.getText()) - Double.parseDouble(text2.getText()) +"");
			}
			else if (e.getSource() == jbtmultiply) {
				text3.setText(Double.parseDouble(text1.getText()) * Double.parseDouble(text2.getText()) +"");
			}
			else if (e.getSource() == jbtdivide) {
				text3.setText(Double.parseDouble(text1.getText()) / Double.parseDouble(text2.getText()) +"");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new Main_calculate();
		frame.setTitle("Calculate");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
	}

}
